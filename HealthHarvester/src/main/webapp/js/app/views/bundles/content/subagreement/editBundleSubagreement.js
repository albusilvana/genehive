define([
    'mainView',
    'text!templates/bundles/content/subagreement/editBundleSubagreement.html'

], function (MainView, template) {
    return MainView.extend({

            template: _.template(''),

            onShow: function () {

                this.bundleEvent = this.options.bundleEvent;
                this.model = this.options.model;
                NR.store.isExpire = false;

                var compiled = Handlebars.compile(template);
                this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
                this.$el.append(this.form.el);
                $('#loadingImage').hide();
            },
            blockHandler: function () {
                $('#editAgreementSaveButton').removeClass("btn-primary");
                $('#editAgreementSaveButton').addClass("disabled");
                $('#loadingImage').show();
            },
            unblockHandler: function () {
                $('#editAgreementSaveButton').removeClass("disabled");
                $('#editAgreementSaveButton').addClass("btn-primary");
                $('#loadingImage').hide();
            },

            events: {
                'click #editAgreementSaveButton': 'saveHandler',
                'click #editAgreementCancelButton': 'cancelHandler'
            },

            saveHandler: function () {
                var errors = this.form.commit();
                var that = this;
                if (errors) {
                    that.bundleEvent.trigger('validationEvent', errors);
                } else {
                    this.blockHandler();
                    var errorMessage = "";
//                    this.rules = new RulesCollection({url: NR.rootUrl + 'rules/item/BundleSubagreement/action/EDIT'});
//                    this.rules.fetch(
//                        {
//                            success: function () {
//                                NR.store.rules = that.rules.models;
//                                for (var x in  NR.store.rules) {
//                                    switch (NR.store.rules[x].get('operator')) {
//                                        case ">=":
//                                            if (that.model.get(NR.store.rules[x].get('field')) < NR.store.rules[x].get('value')) {
//                                                errorMessage = NR.store.rules[x].get('breakMessage');
//                                            }
//                                            break;
//                                        case "<=":
//                                            if (that.model.get(NR.store.rules[x].get('field')) > NR.store.rules[x].get('value')) {
//                                                errorMessage = NR.store.rules[x].get('breakMessage');
//                                            }
//                                            break;
//                                        case "=":
//                                            if (that.model.get(NR.store.rules[x].get('field')) != NR.store.rules[x].get('value')) {
//                                                errorMessage = NR.store.rules[x].get('breakMessage');
//                                            }
//                                            break;
//                                        case "<":
//                                            if (that.model.get(NR.store.rules[x].get('field')) >= NR.store.rules[x].get('value')) {
//                                                errorMessage = NR.store.rules[x].get('breakMessage');
//                                            }
//                                            break;
//                                        case ">":
//                                            if (that.model.get(NR.store.rules[x].get('field')) <= NR.store.rules[x].get('value')) {
//                                                errorMessage = NR.store.rules[x].get('breakMessage');
//                                            }
//                                            break;
//                                    }
//                                }
//                                if (errorMessage == "") {
//                                    var that1 = that;
//                                    that.model.save().done(function () {
//                                        that1.bundleEvent.trigger('editSuccessEvent', that1.model);
//                                        that1.unblockHandler();
//                                    }).fail(function () {
//                                            that1.model.fetch();
//                                            that1.bundleEvent.trigger('saveFailEvent', that1.model);
//                                            that1.unblockHandler();
//                                        });
//                                } else {
//                                    that.bundleEvent.trigger('saveFailEvent', that.model, errorMessage);
//                                    that.unblockHandler();
//                                }
//                            }
//                        })
                }
            },

            cancelHandler: function () {

                this.bundleEvent.trigger('changeView', this.model);
            }

        }
    )
});