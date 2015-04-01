define([
    'text!templates/bundles/bundles.html',
    'i18n!nls/messages',
    'mainView',
    'bundlesHierarchyView',
    'messagesView',
    'bundleDetailView',
    'bundleSubagreementDetailView',
    'bundlePublicationDetailView',
    'subagreementSimpleTableView',
    'addBundleSubagreementView'  ,
    'publicationEditableTableView',
    'bundleSubAgreementModel',
    'bundlePublications',
    'addBundleView',
    'bundleSubagreementTableView'
], function (template, messages) {
    var MainView = require('mainView'),
        BundlesHierarchyView = require('bundlesHierarchyView'),
        MessagesView = require('messagesView'),
        BundlesDetailView = require('bundleDetailView'),
        BundleSubagreementDetailView = require('bundleSubagreementDetailView'),
        BundlePublicationDetailView = require('bundlePublicationDetailView'),
        SubagreementSimpleTableView = require('subagreementSimpleTableView'),
        EditableTableView = require('publicationEditableTableView'),
        AddBundleSubagreementView = require('addBundleSubagreementView'),
        BundleSubagreementModel = require('bundleSubAgreementModel'),
        BundlePublicationCol = require('bundlePublications'),
        AddBundleView = require('addBundleView'),
        BundleSubagreementTableView = require('bundleSubagreementTableView');
    var that = this;

    that.BundlesLayout = Marionette.Layout.extend({

        regions: {
            bundleDetail: '#bundleDetail',
            bundlesHierarchy: '#bundlesHierarchy',
            infoPanel: '#infoPanel'
        }
    });

    return MainView.extend({

        template: template,

        events: {
            'click #edit': 'editElement',
            'click #details': 'detailElement',
            'click #tableTab': 'tableTabHandler',
            'click #addButton': 'addElement',
            'click #addImage': 'addElement',
            'click #addBundleButton': 'addBundleHandler',
            'click #addBundleImage': 'addBundleHandler'
        },

        goToSecondPanel: function () {
            if (this.selectSubagreementModel) {
                NR.bundlesLayout.bundleDetail.show(new EditableTableView({bundleEvent: this.bundleEvent, selectedSubagreementId: this.selectSubagreementModel.id }));
                NR.bundlesLayout.infoPanel.close();
            } else {
                NR.bundlesLayout.infoPanel.show(new MessagesView({msg: messages.common.nextStepNotAllowedBundle, success: false}));
            }
        },
        goBackToSecondPanel: function () {
            NR.bundlesLayout.infoPanel.close();
            NR.bundlesLayout.bundleDetail.show(new EditableTableView({
                bundleEvent: this.bundleEvent,
                selectedSubagreementId: this.selectSubagreementModel.id,
                publications: this.publications,
                publicationsCache: this.publicationsCache,
                publicationsModels: this.publicationsModels
            }));
        },
        goToThirdPanel: function (allPublicationsUpdated, publications, publicationsCache, publicationsModel) {
            if (allPublicationsUpdated) {
                var pricedPubs = new BundlePublicationCol();

                _.each(publicationsModel, function (publication, idx) {
                    var newModel = new Backbone.Model();
                    newModel.set('actionId', publication.get('actionId'));
                    newModel.set('channelId', publication.get('channelId'));
                    newModel.set('price', publication.get('price'));
                    newModel.set('licensedPublicationId', publication.get('licensedPublicationId'));
                    newModel.set('currency', publication.get('currency'));
                    pricedPubs.add(newModel, {at: idx});
                });
                this.model.set('licensorSubagreementId', this.selectSubagreementModel.id);
                this.model.set('bundleId', NR.store.currentNode.id);
                this.model.set('pricedLicensedPublications', pricedPubs);
                this.publications = publications;
                this.publicationsCache = publicationsCache;
                this.publicationsModels = publicationsModel;
                NR.bundlesLayout.bundleDetail.show(new AddBundleSubagreementView({bundleEvent: this.bundleEvent, bundleName: NR.store.currentNode.title, subagreementModel: this.selectSubagreementModel, model: this.model }));
                NR.bundlesLayout.infoPanel.close();
            } else {
                NR.bundlesLayout.infoPanel.show(new MessagesView({msg: messages.common.nextStepNotAllowedAddBundleSubagreement, success: false}));

            }
        },
        goBackToFirstPanel: function () {
            NR.bundlesLayout.infoPanel.close();
            NR.bundlesLayout.bundleDetail.show(new SubagreementSimpleTableView({bundleEvent: this.bundleEvent}));
        },
        selectSubagreementRow: function (model) {
            this.selectSubagreementModel = model;
        },
        displayEditErrorMessage: function () {
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: messages.common.updatePriceNotAllowed, success: false}));
        },
        displayEditSuccessMessage: function () {
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: messages.common.updatePriceSuccess, success: true}));
        },
        onShow: function () {

            this.nodeLevel = 1;
            NR.bundlesLayout = new that.BundlesLayout({el: '#bundlesView'});

            this.bundleEvent = _.extend({}, Backbone.Events);
            NR.bundlesLayout.bundlesHierarchy.show(new BundlesHierarchyView({bundleEvent: this.bundleEvent}));

            this.bundleEvent.bind("changeView", this.changeView, this);
            this.bundleEvent.bind("goToSecondPanel", this.goToSecondPanel, this);
            this.bundleEvent.bind("goBackToSecondPanel", this.goBackToSecondPanel, this);
            this.bundleEvent.bind("goToThirdPanel", this.goToThirdPanel, this);
            this.bundleEvent.bind("goBackToFirstPanel", this.goBackToFirstPanel, this);
            this.bundleEvent.bind("selectSubagreementRow", this.selectSubagreementRow, this);
            this.bundleEvent.bind("displayEditErrorMessage", this.displayEditErrorMessage, this);
            this.bundleEvent.bind("displayEditSuccessMessage", this.displayEditSuccessMessage, this);
            this.bundleEvent.bind("saveBundleSubagreement", this.saveBundleSubagreement, this);
            this.bundleEvent.bind("cancelAddBundleSubagreement", this.detailElement, this);
            this.bundleEvent.bind("createdBundleSuccesEvent", this.createdBundleSuccesEventHandler, this);
            this.bundleEvent.bind("createdSuccesEvent", this.createdSuccesHandler, this);
            this.bundleEvent.bind("saveFailEvent", this.failHandler, this);
            this.bundleEvent.bind("validationEvent", this.validationHandler, this);
            this.bundleEvent.bind("refreshTable", this.refreshTable, this);
            this.bundleEvent.bind("hideInfoPanel", this.hideInfoPanel, this);
            this.detailTab = $('#details');
            this.editTab = $('#edit');
            this.tableTab = $('#tableTab');
            this.detailTabPanel = $('#detailTabPanel');
            this.addButton = $('#addButton');
            this.addDiv = $('#addDiv');
            this.addBundleDiv = $('#addBundleDiv');
            this.bundlesDetailTitle = $('#bundlesDetailTitle');

            this.detailTabPanel.hide();
        },
        addElement: function () {

            $(this.editTab).removeClass("active");
            $(this.detailTab).removeClass('active');
            $(this.tableTab).removeClass('active');

            var currentView = this.getProperAddView();

            NR.bundlesLayout.bundleDetail.show(currentView);

            this.model = new BundleSubagreementModel();

        },
        detailElement: function () {

            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            NR.bundlesLayout.infoPanel.close();
            NR.bundlesLayout.bundleDetail.show(this.getProperDetailView());

        },
        changeView: function (model, nodeLevel) {

            this.bundleEvent.trigger('hideInfoPanel');
            this.detailTabPanel.show();
            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            this.currentModel = model;
            this.nodeLevel = nodeLevel ? nodeLevel : this.nodeLevel;

            NR.bundlesLayout.bundleDetail.show(this.getProperDetailView());

        },

        failHandler: function (model) {
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: model.getSaveFailedMessage(), success: false}));
        },
        saveHandler: function (model) {

            var activeNode = $("#licensorTree").dynatree("getTree").getActiveNode();
            activeNode.setTitle(model.get("name"));
            NR.bundlesLayout.infoPanel.show(new MessagesView({success: true}));

        },
        saveBundleSubagreement: function (form) {
            var errors = form.commit();
            var that = this;
            if (errors) {
                that.bundleEvent.trigger('validationEvent', errors);
            } else {
                this.model.save().done(function (key) {
                    that.model.set('id', key);
                    NR.bundlesLayout.bundlesHierarchy.currentView.baseHierarchyView.refreshOnCreate(that.model);
                    NR.saveInProgress = false;
                    that.bundleEvent.trigger('createdSuccesEvent', that.model, key);

                }).fail(function () {
                    that.model.fetch();
                    that.bundleEvent.trigger('saveFailEvent', that.model);
                });
            }
        },
        createdSuccesHandler: function (model, key) {
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: model.getAddedMessage(), success: true}));
        },
        createdBundleSuccesEventHandler: function (model, key) {
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: model.getAddedMessage(), success: true}));
            this.nodeLevel = 1;
            model.set('id', key);
            NR.bundlesLayout.bundlesHierarchy.show(new BundlesHierarchyView({bundleEvent: this.bundleEvent}));
        },
        tableTabHandler: function () {

            $(this.detailTab).removeClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).addClass('active');

            var currentView = this.getProperTableView();
            NR.bundlesLayout.bundleDetail.show(currentView);

        },
        refreshTable: function (removedModel) {

            this.tableTabHandler();
            NR.bundlesLayout.bundlesHierarchy.currentView.baseHierarchyView.refreshOnDelete();
            NR.bundlesLayout.infoPanel.show(new MessagesView({msg: removedModel.getDeletedMessage(), success: true}));

        },
        hideInfoPanel: function () {

            if (NR.bundlesLayout.infoPanel.currentView) {
                NR.bundlesLayout.infoPanel.currentView.messagesDiv.slideUp();
            }
        },
        validationHandler: function (errors) {

            NR.bundlesLayout.infoPanel.show(new MessagesView({validation: true, errors: errors}));

        },
        getProperDetailView: function () {
            this.addBundleDiv.hide();
            var currentView;
            switch (this.nodeLevel) {
                case 1 :
                    currentView = new BundlesDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Bundle');
                    this.addButton.text("Add Bundle Subagreement");
                    this.addDiv.show();
                    this.tableTab.show();
                    break;
                case 2 :
                    currentView = new BundleSubagreementDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Bundle Subagreement');
                    this.addDiv.hide();
                    this.tableTab.hide();
                    break;
                case 3 :
                    currentView = new BundlePublicationDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Publication');
                    this.addDiv.hide();
                    this.tableTab.hide();
                    break;
            }

            return currentView;
        },
        getProperAddView: function () {

            var currentView;
            switch (this.nodeLevel) {
                case 1 :
                    currentView = new SubagreementSimpleTableView({bundleEvent: this.bundleEvent});
                    break;
            }

            return currentView;

        },
        getProperTableView: function () {
            NR.bundlesLayout.infoPanel.close();
            var currentView;
            switch (this.nodeLevel) {
                case 1 :
                    currentView = new BundleSubagreementTableView({model: this.currentModel, bundleEvent: this.bundleEvent});
                    break;
            }

            return currentView;

        },
        addBundleHandler: function () {
            NR.bundlesLayout.infoPanel.close();
            NR.bundlesLayout.bundleDetail.show(new AddBundleView({bundleEvent: this.bundleEvent}));
        }

    });
});