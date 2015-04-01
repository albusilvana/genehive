define([
    'text!templates/bundles/content/bundle/addBundle.html',
    'mainView',
    'bundleModel'
], function (template) {
    var MainView = require('mainView'),
        BundleModel = require('bundleModel')
    return MainView.extend({

        template: _.template(''),
        events: {
            'click #addBundleCancelButton': 'cancelHandler',
            'click #bundleSaveButton': 'saveHandler'
        },
        onShow: function () {

            var that = this;
            this.bundleEvent = this.options.bundleEvent;
            this.model = new BundleModel();
            NR.store.isEdit = false;
            var compiled = Handlebars.compile(template);
            this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
            this.$el.append(this.form.el);

            $('#loadingImage').hide();

        },
        blockHandler: function () {
            $('#bundleSaveButton').removeClass("btn-primary");
            $('#bundleSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#bundleSaveButton').removeClass("disabled");
            $('#bundleSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },
        cancelHandler: function () {
            NR.bundlesLayout.bundleDetail.close()
        },
        saveHandler: function () {
            var errors = this.form.commit();
            var that = this;

            if (errors) {
                that.bundleEvent.trigger('validationEvent', errors);
            } else {
                this.blockHandler();
                this.model.unset('id');
                this.model.unset('effectiveDate');
                this.model.unset('effectiveYear');
                this.model.unset('effectiveMonth');
                this.model.set('modifyDate',"2014-07-01");
                this.model.set('modifyByUserId',53);
                this.model.save().done(function (key) {
                    that.bundleEvent.trigger('createdBundleSuccesEvent', that.model, key);
                    that.unblockHandler();
                }).fail(function () {
                        that.model.fetch();
                        that.bundleEvent.trigger('saveFailEvent', that.model);
                        that.unblockHandler();
                    });
            }

        }
    })
});
