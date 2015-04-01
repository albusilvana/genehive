define([
    'mainView',
    'text!templates/bundles/content/bundle/editBundle.html'

], function (MainView, template) {
        var today = new Date();
        var curr_year = today.getFullYear();
        var curr_month = today.getMonth();
        var next_year = curr_year + 1;
        var monthArray = ["January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"];
        var that = this;

        return MainView.extend({

            template: _.template(''),

            events: {
                'click #editBundleSaveButton': 'saveHandler',
                'click #editBundleCancelButton': 'cancelHandler',
                'change #effectiveYear': 'changeYearHandler'
            },

            onShow: function () {
                this.bundleEvent = this.options.bundleEvent;
                this.model = this.options.model;
                NR.store.isEdit = true;
                var compiled = Handlebars.compile(template);
                this.model.unset("name");
                this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
                this.$el.append(this.form.el);
                $('#loadingImage').hide();

                var years = [];
                years.push({val: curr_year, label: curr_year });
                years.push({val: next_year, label: next_year });

                this.form.fields.effectiveYear.editor.setOptions(years);
                this.changeYearHandler();
            },
            changeYearHandler: function () {
                var selected_year = this.form.fields.effectiveYear.editor.getValue();
                var months = [];
                if (selected_year == curr_year) {
                    for (var i = curr_month + 2; i <= 12; i++) {
                        months.push({val: (i), label: monthArray[i - 1]});
                    }
                } else {
                    for (var i = 1; i <= 12; i++) {
                        months.push({val: (i), label: monthArray[i - 1]});
                    }
                }
                this.form.fields.effectiveMonth.editor.setOptions(months);
            },
            blockHandler: function () {
                $('#editBundleSaveButton').removeClass("btn-primary");
                $('#editBundleSaveButton').addClass("disabled");
                $('#loadingImage').show();
            },
            unblockHandler: function () {
                $('#editBundleSaveButton').removeClass("disabled");
                $('#editBundleSaveButton').addClass("btn-primary");
                $('#loadingImage').hide();
            },

            saveHandler: function () {

                var errors = this.form.commit();
                var that = this;
                if (errors) {
                    that.bundleEvent.trigger('validationEvent', errors);
                } else {
                    this.blockHandler();
                    var that1 = this;
                    //hack because when manually setting the effective date attribute, the name would be removed from the changed attributes lists and would not be sent on request
                    var attrs = {name:this.model.get('name'), effectiveDate:this.model.get('effectiveYear') + "-" + this.model.get('effectiveMonth') + "-" + "01"};
                    this.model.save(attrs, {patch: true}).done(function () {
                        that1.bundleEvent.trigger('editBundleSuccessEvent', that.model, this);
                        that1.unblockHandler();
                    }).fail(function () {
                            that1.model.fetch();
                            that1.bundleEvent.trigger('editBundleFailEvent', that.model, this);
                            that1.unblockHandler();
                        });
                }
            },
            cancelHandler: function () {

                this.bundleEvent.trigger('changeView', this.model);
            }

        })
    }
)
;
