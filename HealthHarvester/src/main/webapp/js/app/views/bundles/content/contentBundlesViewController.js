define([
    'text!templates/bundles/content/contentBundles.html',
    'i18n!nls/messages',
    'mainView',
    'messagesView',
    'bundleDetailView',
    'bundleSubagreementDetailView',
    'bundlePublicationDetailView',
    'addBundleSubagreementView'  ,
    'bundleSubAgreementModel',
    'publicationModel',
    'bundleModel',
    'bundlePublications',
    'addBundleView',
    'bundleEditView',
    'contentBundleTableView',
    'contentSubagreementTableView',
    'contentPublicationTableView',
    'editBundleSubagreementView',
    'expireSubagreementsView',
    'contentLicensorSubagreementTableView'
], function (template, messages) {
    var MainView = require('mainView'),
        MessagesView = require('messagesView'),
        BundlesDetailView = require('bundleDetailView'),
        BundleSubagreementDetailView = require('bundleSubagreementDetailView'),
        BundlePublicationDetailView = require('bundlePublicationDetailView'),
        AddBundleSubagreementView = require('addBundleSubagreementView'),
        BundleSubagreementModel = require('bundleSubAgreementModel'),
        AddBundleView = require('addBundleView'),
        EditBundleView = require('bundleEditView'),
        ContentSubagreementTableView = require('contentSubagreementTableView'),
        ContentPublicationTableView = require('contentPublicationTableView'),
        BundleModel = require('bundleModel'),
        BundlePublicationModel = require('publicationModel'),
        ContentLicensorSubagreementTableView = require('contentLicensorSubagreementTableView'),
        EditBundleSubagreementView = require('editBundleSubagreementView'),
        ExpireSubagreementsView = require('expireSubagreementsView'),
        ContentBundleTableView = require('contentBundleTableView');
    var that = this;

    that.BundlesViewLayout = Marionette.Layout.extend({

        regions: {
            bundleDetail: '#bundleDetail',
            bundlesPanel: '#bundlesPanel',
            operationsView: '#operationsView',
            addBundleDiv: '#addBundleDiv',
            infoPanel: '#infoPanel',
            navigationInfoPanel: '#navigationInfoPanel'
        }
    });

    return MainView.extend({

        template: template,

        events: {
            'click #edit': 'editElement',
            'click #expire': 'expireElement',
            'click #details': 'detailElement',
            'click #tableTab': 'tableTabHandler',
            'click #addButton': 'addElement',
            'click #addBundleButton': 'goToAddPricedBundleStepOneHandler',
            'click #switchToRight': 'switchToChildHandler',
            'click #switchToLeft': 'switchToParentHandler',
            'click #firstLevelTitle': 'showBundlesTableHandler',
            'click #secondLevelTitle': 'showSubagreementsTableHandler',
            'click #thirdLevelTitle': 'showPublicationsTableHandler'
        },

        onShow: function () {

            this.nodeLevel = 1;

            this.bundleEvent = _.extend({}, Backbone.Events);
            NR.bundlesViewLayout = new that.BundlesViewLayout({el: '#contentBundlesMainPanel'});
            NR.bundlesViewLayout.bundlesPanel.show(new ContentBundleTableView({event: this.bundleEvent}));
            this.bundleEvent.bind("changeView", this.changeView, this);

            this.bundleEvent.bind("goBackToSecondPanel", this.goBackToSecondPanel, this);
            this.bundleEvent.bind("selectSubagreementRow", this.selectSubagreementRow, this);
            this.bundleEvent.bind("displayEditSuccessMessage", this.displayEditSuccessMessage, this);
            this.bundleEvent.bind("saveBundleSubagreement", this.saveBundleSubagreement, this);
            this.bundleEvent.bind("cancelAddBundleSubagreement", this.detailElement, this);
            this.bundleEvent.bind("createdBundleSuccesEvent", this.createdBundleSuccesEventHandler, this);
            this.bundleEvent.bind("saveSuccesEvent", this.saveHandler, this);
            this.bundleEvent.bind("editBundleSuccessEvent", this.editBundleSuccessHandler, this);
            this.bundleEvent.bind("editBundleFailEvent", this.editBundleFailHandler, this);
            this.bundleEvent.bind("createdSuccesEvent", this.createdSuccesHandler, this);
            this.bundleEvent.bind("saveFailEvent", this.failHandler, this);
            this.bundleEvent.bind("validationEvent", this.validationHandler, this);
            this.bundleEvent.bind("refreshTable", this.refreshTable, this);
            this.bundleEvent.bind("hideInfoPanel", this.hideInfoPanel, this);
            this.bundleEvent.bind("bundleSelectedEvent", this.pricedBundleSelectedHandler, this);
            this.bundleEvent.bind("subagreementSelectedEvent", this.pricedSubagreementSelectedHandler, this);
            this.bundleEvent.bind("publicationSelectedEvent", this.pricedPublicationSelectedHandler, this);
            this.bundleEvent.bind("nextStepNotAllowed", this.nextStepNotAllowedHandler, this);
            this.bundleEvent.bind("createBundleSubagreementDetailsEvent", this.createBundleSubagreementDetailsHandler, this);
            this.bundleEvent.bind("expireSuccesEvent", this.expireSuccessHandler, this);
            this.bundleEvent.bind("expireErrorEvent", this.expireErrorHandler, this);
            this.bundleEvent.bind("editSuccessEvent", this.editSuccessHandler, this);


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
            this.expireTab = $('#expire');
            this.tableTab = $('#tableTab');
            this.detailTabPanel = $('#detailTabPanel');
            this.addButton = $('#addButton');
            this.addDiv = $('#addDiv');
            this.addBundleDiv = $('#addBundleDiv');
            this.bundlesDetailTitle = $('#bundlesDetailTitle');
            this.switchToRight = $('#switchToRight');
            this.switchToLeft = $('#switchToLeft');
            this.switchToLeft.hide();
            this.nextLabel.text('Subagreements');
            this.emptyDetailsPanelHandler();
            this.addBundleDiv.show();
        },
        nextStepNotAllowedHandler: function () {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: messages.common.nextStepNotAllowedAddPublication, success: false}));
        },
        emptyDetailsPanelHandler: function () {
            this.bundlesDetailTitle.text('');
            this.addDiv.hide();
            this.tableTab.hide();
            this.editTab.hide();
            this.detailTab.hide();
            this.expireTab.hide();
            NR.bundlesViewLayout.bundleDetail.close();
            NR.bundlesViewLayout.infoPanel.close();
        },
        pricedBundleSelectedHandler: function (bundle) {
            this.bundleId = bundle.id;
            NR.store.bundleId = bundle.id;
            NR.store.bundleName = bundle.name;
            NR.store.bundle = bundle;
            this.hideNavigationInfoPanel();
            this.entityTitle.empty();
            this.firstLevelTitle.empty();
            this.firstLevelTitle.append(NR.store.bundleName);
            this.firstLevelTitle.show();
            this.currentModel = new BundleModel(bundle);
            this.detailTab.show();
            this.addDiv.show();
            this.detailElement();
        },
        pricedSubagreementSelectedHandler: function (subagreement) {
            this.bundleSubagreementId = subagreement.id;
            NR.store.bundleSubagreementId = subagreement.id;
            NR.store.bundleSubagreementName = subagreement.name;
            NR.store.bundleSubagreement = subagreement;
            this.hideNavigationInfoPanel();
            this.entityTitle.empty();
            this.secondLevelTitle.empty();
            this.secondLevelTitle.append(NR.store.bundleSubagreementName);
            this.secondLevelTitle.show();
            this.currentModel = new BundleSubagreementModel(subagreement);
            this.detailTab.show();
            this.editTab.show();
            this.expireTab.show();
            this.detailElement();
        },
        pricedPublicationSelectedHandler: function (publication) {
            this.bundlePublicationId = publication.id;
            NR.store.bundlePublicationId = publication.id;
            NR.store.bundlePublicationName = publication.publicationName;
            NR.store.bundlePublication = publication;
            this.hideNavigationInfoPanel();
            this.entityTitle.empty();
            this.thirdLevelTitle.empty();
            this.thirdLevelTitle.append(NR.store.bundlePublicationName);
            this.thirdLevelTitle.show();
            this.currentModel = new BundlePublicationModel(publication);
            this.detailTab.show();
            this.detailElement();

        },
        hideNavigationInfoPanel: function () {
            if (NR.bundlesViewLayout.navigationInfoPanel.currentView) {
                NR.bundlesViewLayout.navigationInfoPanel.currentView.messagesDiv.slideUp();
            }
        },
        showPricedSubagreements: function () {
            if (NR.store.bundleId != null) {
                NR.bundlesViewLayout.bundlesPanel.close();
                NR.bundlesViewLayout.bundlesPanel.show(new ContentSubagreementTableView({event: this.bundleEvent}));
                this.switchToLeft.show();
                this.switchToRight.show();
                this.nextLabel.text('Publications');
                this.prevLabel.text('Bundles');
            } else {
                NR.bundlesViewLayout.navigationInfoPanel.show(new MessagesView({msg: messages.common.nextStepNotAllowed.format("Bundle"), success: false}));
            }
        },
        showPricedPublications: function () {
            if (NR.store.bundleSubagreementId != null) {
                NR.bundlesViewLayout.bundlesPanel.close();
                NR.bundlesViewLayout.bundlesPanel.show(new ContentPublicationTableView({event: this.bundleEvent}));
                this.switchToLeft.show();
                this.switchToRight.hide();
                this.prevLabel.text('Subagreements');
            } else {
                NR.bundlesViewLayout.navigationInfoPanel.show(new MessagesView({msg: messages.common.nextStepNotAllowed.format("Subagreement"), success: false}));
            }
        },
        switchToChildHandler: function () {
            var childLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel + 1;
            this.emptyDetailsPanelHandler();
            switch (childLevel) {
                case 2 :
                    this.showPricedSubagreements();
                    break;
                case 3:
                    this.showPricedPublications();
                    break;
            }
        },
        showBundlesTableHandler: function () {
            NR.bundlesViewLayout.bundlesPanel.show(new ContentBundleTableView({event: this.bundleEvent}));
            this.switchToLeft.hide();
            this.switchToRight.show();
            this.nextLabel.text('Subagreements');

            this.firstLevelTitle.hide();
            this.secondLevelTitle.hide();
            this.thirdLevelTitle.hide();

            NR.store.bundleId = null;
            NR.store.bundleSubagreementId = null;
            NR.store.bundlePublicationId = null;
            this.emptyDetailsPanelHandler();
            this.addBundleDiv.show();
        },
        showPublicationsTableHandler: function () {
            NR.bundlesViewLayout.bundlesPanel.show(new ContentPublicationTableView({event: this.bundleEvent}));
            this.switchToLeft.show();
            this.switchToRight.hide();
            this.prevLabel.text('Subagreements');

            this.thirdLevelTitle.hide();

            NR.store.bundlePublicationId = null;
            this.emptyDetailsPanelHandler();
        },
        showSubagreementsTableHandler: function () {
            NR.bundlesViewLayout.bundlesPanel.show(new ContentSubagreementTableView({event: this.bundleEvent}));
            this.switchToLeft.show();
            this.switchToRight.show();
            this.nextLabel.text('Publications');
            this.prevLabel.text('Bundles');

            this.secondLevelTitle.hide();
            this.thirdLevelTitle.hide();

            NR.store.bundleSubagreementId = null;
            NR.store.bundlePublicationId = null;
            this.emptyDetailsPanelHandler();
        },
        switchToParentHandler: function () {
            var parentLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel - 1;
            this.emptyDetailsPanelHandler();
            NR.bundlesViewLayout.bundlesPanel.close();
            switch (parentLevel) {
                case 1 :
                    this.showBundlesTableHandler();
                    break;
                case 2 :
                    this.showSubagreementsTableHandler();
                    break;
                case 3:
                    this.showPublicationsTableHandler();
                    break;
            }
        },
        addElement: function () {

            $(this.editTab).removeClass("active");
            $(this.detailTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            $(this.expireTab).removeClass('active');

            var currentView = this.getProperAddView();

            NR.bundlesViewLayout.bundleDetail.show(currentView);

            this.model = new BundleSubagreementModel();

        },
        editElement: function () {

            $(this.editTab).addClass("active");
            $(this.detailTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            $(this.expireTab).removeClass('active');

            var currentView = this.getProperEditView();

            NR.bundlesViewLayout.bundleDetail.show(currentView);
        },
        expireElement: function () {

            $(this.expireTab).addClass("active");
            $(this.detailTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            $(this.editTab).removeClass('active');

            var currentView = this.getProperExpireView();

            NR.bundlesViewLayout.bundleDetail.show(currentView);
        },
        detailElement: function () {

            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            $(this.expireTab).removeClass("active");
            NR.bundlesViewLayout.infoPanel.close();
            NR.bundlesViewLayout.bundleDetail.show(this.getProperDetailView());

        },
        changeView: function (model, nodeLevel) {

            this.bundleEvent.trigger('hideInfoPanel');
            this.detailTabPanel.show();
            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.tableTab).removeClass('active');
            this.currentModel = model;
            this.nodeLevel = nodeLevel ? nodeLevel : this.nodeLevel;

            NR.bundlesViewLayout.bundleDetail.show(this.getProperDetailView());

        },
        failHandler: function (model, errorMsg) {
            if (errorMsg) NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: errorMsg, success: false}));
            else  NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getSaveFailedMessage(), success: false}));
        },
        updatedSuccesHandler: function (model, key) {
            model.set('id', key);
            NR.bundlesViewLayout.bundlesHierarchy.currentView.baseHierarchyView.refreshOnDelete(model);
            NR.saveInProgress = false;
            NR.bundlesViewLayout.bundleDetail.close();
            this.editElement();
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: messages.common.updatePublicationsProcesSuccess, success: true}));
        },
        saveBundleSubagreement: function (form, context) {
            var errors = form.commit();
            var that = this;
            if (errors) {
                that.bundleEvent.trigger('validationEvent', errors);
            } else {
                context.blockHandler();
                this.model.set('bundleId', context.bundleId);
                this.model.set('licensorSubagreementId', context.subagreementId);
                this.model.unset('newExpiryDate');
                this.model.unset('oldEffectiveDate');
                var errorMessage = "";
//                this.rules = new RulesCollection({url: NR.rootUrl + 'rules/item/BundleSubagreement/action/ADD'});
//                this.rules.fetch(
//                    {
//                        success: function () {
//                            NR.store.rules = that.rules.models;
//                            for (var x in  NR.store.rules) {
//                                switch (NR.store.rules[x].get('operator')) {
//                                    case ">=":
//                                        if (that.model.get(NR.store.rules[x].get('field')) < NR.store.rules[x].get('value')) {
//                                            errorMessage = NR.store.rules[x].get('breakMessage');
//                                        }
//                                        break;
//                                    case "<=":
//                                        if (that.model.get(NR.store.rules[x].get('field')) > NR.store.rules[x].get('value')) {
//                                            errorMessage = NR.store.rules[x].get('breakMessage');
//                                        }
//                                        break;
//                                    case "=":
//                                        if (that.model.get(NR.store.rules[x].get('field')) != NR.store.rules[x].get('value')) {
//                                            errorMessage = NR.store.rules[x].get('breakMessage');
//                                        }
//                                        break;
//                                    case "<":
//                                        if (that.model.get(NR.store.rules[x].get('field')) >= NR.store.rules[x].get('value')) {
//                                            errorMessage = NR.store.rules[x].get('breakMessage');
//                                        }
//                                        break;
//                                    case ">":
//                                        if (that.model.get(NR.store.rules[x].get('field')) <= NR.store.rules[x].get('value')) {
//                                            errorMessage = NR.store.rules[x].get('breakMessage');
//                                        }
//                                        break;
//                                }
//
//                            }
//                            if (errorMessage == "") {
//                                var that1 = that;
//                                that.model.save().done(function (key) {
//                                    that1.model.set('id', key);
//                                    NR.saveInProgress = false;
//                                    that1.bundleEvent.trigger('createdSuccesEvent', that.model, key);
//                                    context.unblockHandler();
//                                }).fail(function () {
//                                        that1.bundleEvent.trigger('saveFailEvent', that.model);
//                                        context.unblockHandler();
//                                    });
//                            } else {
//                                NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: errorMessage, success: false}));
//                                context.unblockHandler();
//                            }
//
//                        },
//                        error: function () {
//                            console.log('Failed to fetch!');
//                        }
//                    });

            }
        },
        createdSuccesHandler: function (model, key) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getAddedMessage(), success: true}));
            $(this.detailTab).addClass("active");
            $(this.editTab).removeClass('active');
            $(this.expireTab).removeClass("active");
            NR.bundlesViewLayout.bundleDetail.show(this.getProperDetailView());

        },
        createdBundleSuccesEventHandler: function (model, key) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getAddedMessage(), success: true}));
            this.showBundlesTableHandler();
        },
        editBundleSuccessHandler: function (model) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getUpdatedMessage(), success: true}));
        },
        editBundleFailHandler: function (model) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getUpdatedFailedMessage(), success: false}));
        },
        saveHandler: function (model) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getUpdatedMessage(), success: true}));
            this.showSubagreementsTableHandler();
        },
        tableTabHandler: function () {

            $(this.detailTab).removeClass("active");
            $(this.editTab).removeClass('active');
            $(this.expireTab).removeClass('active');
            $(this.tableTab).addClass('active');

            var currentView = this.getProperTableView();
            NR.bundlesViewLayout.bundleDetail.show(currentView);

        },
        refreshTable: function (removedModel) {

            this.tableTabHandler();
            NR.bundlesViewLayout.bundlesHierarchy.currentView.baseHierarchyView.refreshOnDelete();
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: removedModel.getDeletedMessage(), success: true}));

        },
        hideInfoPanel: function () {

            if (NR.bundlesViewLayout.infoPanel.currentView) {
                NR.bundlesViewLayout.infoPanel.currentView.messagesDiv.slideUp();
            }
        },
        validationHandler: function (errors) {

            NR.bundlesViewLayout.infoPanel.show(new MessagesView({validation: true, errors: errors}));

        },
        getProperDetailView: function () {
            this.addBundleDiv.hide();
            var currentView;
            var currentLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel;
//            NR.bundlesLayout.infoPanel.close();
            switch (currentLevel) {
                case 1 :
                    currentView = new BundlesDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Bundle');
                    this.addButton.text("Add Bundle Subagreement");
                    this.addDiv.show();
                    this.editTab.show();
                    this.tableTab.show();
                    this.expireTab.hide();
                    break;
                case 2 :
                    currentView = new BundleSubagreementDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Add Bundle Subagreement');
                    this.addDiv.hide();
                    this.editTab.show();
                    this.expireTab.show();
                    this.tableTab.hide();
                    break;
                case 3 :
                    currentView = new BundlePublicationDetailView({model: this.currentModel});
                    this.bundlesDetailTitle.text('Add Publication');
                    this.addDiv.hide();
                    this.tableTab.hide();
                    this.editTab.hide();
                    this.expireTab.hide();
                    break;
            }

            return currentView;
        },
        getProperAddView: function () {

            var currentView;
            var currentLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel;
            NR.bundlesViewLayout.infoPanel.close();
            switch (currentLevel) {
                case 1 :
                    currentView = new ContentLicensorSubagreementTableView({event: this.bundleEvent});
                    break;
            }

            return currentView;

        },
        getProperEditView: function () {

            var currentView;
            var currentLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel;
            NR.bundlesViewLayout.infoPanel.close();
            switch (currentLevel) {
                case 1 :
                    currentView = new EditBundleView({model: this.currentModel, bundleEvent: this.bundleEvent});
                    break;
                case 2 :
                    currentView = new EditBundleSubagreementView({model: this.currentModel, bundleEvent: this.bundleEvent});
                    break;
            }

            return currentView;
        },
        getProperExpireView: function () {

            var currentView;
            var currentLevel = NR.bundlesViewLayout.bundlesPanel.currentView.currentLevel;
            NR.bundlesViewLayout.infoPanel.close();
            switch (currentLevel) {
                case 2 :
                    currentView = new ExpireSubagreementsView({model: this.currentModel, bundleEvent: this.bundleEvent});
                    break;
            }

            return currentView;
        },
        goToAddPricedBundleStepOneHandler: function () {
            NR.bundlesViewLayout.infoPanel.close();
            NR.bundlesViewLayout.bundleDetail.show(new AddBundleView({bundleEvent: this.bundleEvent}));
        },
        createBundleSubagreementDetailsHandler: function (subagreement) {
            NR.bundlesViewLayout.infoPanel.close();
            NR.bundlesViewLayout.bundleDetail.show(new AddBundleSubagreementView({bundleEvent: this.bundleEvent, bundleId: NR.store.bundleId, subagreementId: subagreement.id, model: this.model }));
        },
        goBackToSecondPanel: function () {
            NR.bundlesViewLayout.infoPanel.close();
            this.addElement();
        },
        selectSubagreementRow: function (model) {
            this.selectSubagreementModel = model;
        },
        updateRequestNotSent: function () {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: messages.common.updateRequestNotSent, success: false}));
        },
        displayEditSuccessMessage: function () {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: messages.common.updatePriceSuccess, success: true}));
        },
        expireErrorHandler: function (model) {
            this.showPricedSubagreements();
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getExpiredErrorMessage(), success: false}));
        },
        expireSuccessHandler: function (model) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getExpiredSuccessMessage(), success: true}));
            this.showPricedSubagreements();
        },
        editSuccessHandler: function (model) {
            NR.bundlesViewLayout.infoPanel.show(new MessagesView({msg: model.getEditedSuccessMessage(), success: true}));
            this.showPricedSubagreements();
        }

    });
});