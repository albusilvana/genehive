define([
    'text!templates/licensors/licensor.html',
    'i18n!nls/messages',
    'mainView',
    'messagesView',
    'editLicensorsView',
    'editPublications',
    'licensorDetailView',
    'subagreementDetailView',
    'publicationDetailView',
    'addPublicationsView',
    'licensorsTableView',
    'contentSubagreementsTableView',
    'contentPublicationsTableView',
    'licensorModel',
    'subAgreementModel',
    'publicationModel'

], function (template, messages) {
    var MainView = require('mainView'),
        MessagesView = require('messagesView'),
        EditLicensorsView = require('editLicensorsView'),
        LicensorDetailView = require('licensorDetailView'),
        LicensorsTableView = require('licensorsTableView'),
        LicensorModel = require('licensorModel')
    var that = this;

    /**
     * A {Marionette.Layout} object which contains regions for the current use case
     *
     * @type {Marionette.Layout}
     */
    that.LicensorsLayout = Marionette.Layout.extend({


        regions: {

            agreementDetail: '#agreementDetail',
            licensorsMainPanel: '#licensorsMainPanel',
            licensorsPanel: '#licensorsPanel',
            operationsView: '#operationsView',
            infoPanel: '#infoPanel',
            navigationInfoPanel: '#navigationInfoPanel',
            timeframe: '#timeframeLicensor'
        }
    });

    /**
     * A view which acts like a Controller for a bunch of other views
     */
    return MainView.extend({

        template: template,

        events: {
            'click #edit': 'editElement',
            'click #details': 'detailElement',
            'click #tableTab': 'tableTabHandler',
            'click #addButton': 'addElement',
            'click #switchToRight': 'switchToChildHandler',
            'click #switchToLeft': 'switchToParentHandler',
            'click #firstLevelTitle': 'showLicensorsTableHandler',
            'click #secondLevelTitle': 'showSubagreementsTableHandler',
            'click #thirdLevelTitle': 'showPublicationsTableHandler'
        },

        onShow: function () {

            this.nodeLevel = 1;
            NR.licensorsLayout = new that.LicensorsLayout({el: '#licensorsMainPanel'});

            /**
             * Event object which is used to communicate between views
             *
             * @type {Backbone.Events}
             */
            this.licEvt = _.extend({}, Backbone.Events);
            NR.licensorsLayout.licensorsPanel.show(new LicensorsTableView({event: this.licEvt}));
            this.licEvt.bind("changeView", this.changeView, this);
            this.licEvt.bind("saveSuccesEvent", this.saveHandler, this);
            this.licEvt.bind("createdSuccesEvent", this.createdSuccesHandler, this);
            this.licEvt.bind("saveFailEvent", this.failHandler, this);

            this.licEvt.bind("hideInfoPanel", this.hideInfoPanel, this);
            this.licEvt.bind("cancelHandlerEvent", this.detailElement, this);
            this.licEvt.bind("validationEvent", this.validationHandler, this);
            this.licEvt.bind("licensorSelectedEvent", this.licensorSelectedHandler, this);
            this.licEvt.bind("refreshTable", this.refreshTable, this);
            this.licEvt.bind("nextPublicationScreen", this.nextHandler, this);
            this.licEvt.bind("nextStepNotAllowed", this.nextStepNotAllowedHandler, this);

            this.entityTitle = $('#entityTitle');
            this.firstLevelTitle = $('#firstLevelTitle');
            this.secondLevelTitle = $('#secondLevelTitle');
            this.thirdLevelTitle = $('#thirdLevelTitle');
            this.prevLabel = $('#prevLabel');
            this.nextLabel = $('#nextLabel');

            this.firstLevelTitle.hide();
            this.secondLevelTitle.hide();
            this.thirdLevelTitle.hide();

            this.detailTab = $('#details');
            this.editTab = $('#edit');
            this.tableTab = $('#tableTab');
            this.detailTabPanel = $('#detailTabPanel');
            this.addButton = $('#addButton');
            this.addDiv = $('#addDiv');
            this.licensorDetailTitle = $('#licensorDetailTitle');
            this.tableTab.hide();
            this.switchToRight = $('#switchToRight');
            this.switchToLeft = $('#switchToLeft');
            this.switchToLeft.hide();
            this.nextLabel.text('Subagreements');
            this.emptyDetailsPanelHandler();
        },
        emptyDetailsPanelHandler: function () {
            this.licensorDetailTitle.text('');
//            this.addDiv.hide();
            this.tableTab.hide();
            this.editTab.hide();
            this.detailTab.hide();
            NR.licensorsLayout.agreementDetail.close();
        },
        licensorSelectedHandler: function (licensor) {
            this.licensorId = licensor.id;
            NR.store.licensorId = licensor.id;
            NR.store.liceonsorName = licensor.name;
            NR.store.licensor = licensor;
            this.hideNavigationInfoPanel();
            this.entityTitle.empty();
            this.firstLevelTitle.empty();
            this.firstLevelTitle.append(NR.store.liceonsorName);
            this.firstLevelTitle.show();
            this.currentModel = new LicensorModel(licensor);
            this.detailTab.show();
            this.addDiv.show();
            this.detailElement();
        },

        hideNavigationInfoPanel: function () {
            if (NR.licensorsLayout.navigationInfoPanel.currentView) {
                NR.licensorsLayout.navigationInfoPanel.currentView.messagesDiv.slideUp();
            }
        },

        addElement: function () {

            this.licEvt.trigger('hideInfoPanel');
            $(this.editTab).removeClass("active");
            $(this.detailTab).removeClass('active');
            $(this.tableTab).removeClass('active');

            var currentView = this.getProperAddView();

            NR.licensorsLayout.agreementDetail.show(currentView);
        },


        /**
         * Handler for Detail Button
         * Delegates the correct view to display into detail region
         */
        detailElement: function () {

            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');

            NR.licensorsLayout.agreementDetail.show(this.getProperDetailView());

        },

        /**
         * Event handler for changing the view displayed into detail region
         *
         * @param model {Backbone.Model} instance needed for the new view
         * @param nodeLevel The node level which corresponds to the model
         */
        changeView: function (model, nodeLevel) {

            this.licEvt.trigger('hideInfoPanel');
            this.detailTabPanel.show();
            this.tableTab.hide();
            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            this.currentModel = model;
            this.nodeLevel = nodeLevel ? nodeLevel : this.nodeLevel;

            NR.licensorsLayout.agreementDetail.show(this.getProperDetailView());

        },

        /**
         * A generic fail event handler in order to display a view containing the error messages
         *
         * @param model The model which failed
         */
        failHandler: function (model) {
            NR.licensorsLayout.infoPanel.show(new MessagesView({msg: model.getSaveFailedMessage(), success: false}));
        },
        saveHandler: function () {

            NR.licensorsLayout.infoPanel.show(new MessagesView({msg: "The patient was succesfully added", success: true}));
            NR.licensorsLayout.licensorsPanel.close();
            NR.licensorsLayout.licensorsPanel.show(new LicensorsTableView({event: this.licEvt}));
            NR.licensorsLayout.agreementDetail.close();
        },

        /**
         * Used for hiding the infoPanel view
         */
        hideInfoPanel: function () {

            if (NR.licensorsLayout.infoPanel.currentView) {
                NR.licensorsLayout.infoPanel.currentView.messagesDiv.clearQueue();
                NR.licensorsLayout.infoPanel.currentView.messagesDiv.slideUp();
            }
        },
        /**
         * Event handler for showing some information to the end user about some validation errors
         *
         * @param errors an object containing the errors
         */
        validationHandler: function (errors) {

            NR.licensorsLayout.infoPanel.show(new MessagesView({validation: true, errors: errors}));

        },

        getProperDetailView: function () {

            var currentView;
            var currentLevel = NR.licensorsLayout.licensorsPanel.currentView.currentLevel;
            NR.licensorsLayout.infoPanel.close();
            switch (currentLevel) {
                case 1 :
                    currentView = new LicensorDetailView({model: this.currentModel});
                    this.licensorDetailTitle.text('Entry');

                    this.addDiv.show();
                    this.addButton.show();
                    this.editTab.hide();
                    break;
            }

            return currentView;
        },

        getProperAddView: function () {
            var currentView;
            var currentLevel = NR.licensorsLayout.licensorsPanel.currentView.currentLevel;
            NR.licensorsLayout.infoPanel.close();


            currentView = new EditLicensorsView({model: new LicensorModel(), licEvt: this.licEvt});
            this.licensorDetailTitle.text('Entry');

                    this.addDiv.show();
                    this.addButton.show();
                    this.editTab.hide();


            return currentView;

        }


    });
});