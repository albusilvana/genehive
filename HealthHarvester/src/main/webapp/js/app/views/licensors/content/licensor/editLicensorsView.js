define([

    'text!templates/licensors/content/licensor/editLicensors.html',
    'mainView',
    'licensorModel'

], function (template) {
    var MainView = require('mainView'),
        LicensorModel = require('licensorModel')
    return MainView.extend({

        template: _.template(''),
        onShow: function () {
            var that = this;
            this.licEvt = this.options.licEvt;


            this.model = new LicensorModel();

            var compiled = Handlebars.compile(template);
            this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
            this.$el.append(this.form.el);
        },

        events: {
            'click #editSaveButton': 'saveHandler',
            'click #editCancelButton': 'cancelHandler'
        },

        saveHandler: function () {

            var errors = this.form.commit();
            var that = this;

            if (errors) {
                that.licEvt.trigger('validationEvent', errors);
            } else {
                that.model.set("password", "password");
//                that.model.set("userId", NR.store.id);
//                that.model.set("locationId", 1);
//                that.model.set("doctorId", 1);
//                that.model.set("specializationId", 1);
//                that.model.set("isCanceled", "N")
                that.model.save().always(function () {


                }).fail(function () {
                    that.model.fetch();
                    that.bundleEvent.trigger('saveFailEvent', that.model);
                    that.unblockHandler();
                });

                that.licEvt.trigger('saveSuccesEvent');
            }
        },

        cancelHandler: function () {

            this.licEvt.trigger('changeView', this.model);
        }

    })
});