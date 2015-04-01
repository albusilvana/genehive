define([
    'text!templates/bundles/content/subagreement/addBundleSubagreement.html',
    'mainView',
    'bundleSubAgreementModel',
    'licensorPublications'
], function (template) {
    var MainView = require('mainView'),
        SubAgreementModel = require('bundleSubAgreementModel')

    return MainView.extend({

        template: _.template(''),
        events: {
            'click #addbundleSubAgreementCancelButton': 'cancelHandler',
            'click #backButton': 'goBackToSubagreements',
            'click #bundleSubAgreementSaveButton': 'saveHandler'
        },
        onShow: function () {

            var that = this;
            this.event = this.options.bundleEvent;
            this.model = this.options.model;
            this.subagreementId = this.options.subagreementId;
            this.bundleId = this.options.bundleId;
            this.model.unset("newExpiryDate");
            this.model.unset('oldEffectiveDate');
            var compiled = Handlebars.compile(template);
            compiled = compiled(this.model.toJSON());
            this.form = new Backbone.Form({model: this.model, template: Handlebars.compile(compiled), idPrefix: ''}).render();
            this.$el.append(this.form.el);

            $('#loadingImage').hide();

        },
        blockHandler: function () {
            $('#bundleSubAgreementSaveButton').removeClass("btn-primary");
            $('#bundleSubAgreementSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#bundleSubAgreementSaveButton').removeClass("disabled");
            $('#bundleSubAgreementSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },
        cancelHandler: function () {
            this.event.trigger('cancelAddBundleSubagreement', this.model);
        },
        saveHandler: function () {
            this.event.trigger('saveBundleSubagreement', this.form, this);
        },
        goBackToSubagreements: function () {
            this.event.trigger('goBackToSecondPanel');
        }

    })
});