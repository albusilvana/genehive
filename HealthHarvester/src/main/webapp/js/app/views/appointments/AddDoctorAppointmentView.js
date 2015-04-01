define([

    'text!templates/appointments/AddDoctorAppointment.html',
    'mainView',
    'doctorAppointmentModel'

], function (template) {
    var MainView = require('mainView'),
        LicensorModel = require('doctorAppointmentModel')
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
            var currentUserId = 3;
            if (errors) {
                that.licEvt.trigger('validationEvent', errors);
            } else {
                 var selectedUser = that.model.attributes.userId;
                var selectedLoc = $("#locationId option:selected").text();
                var selectedSpec = $("#specializationId option:selected").text();

                if(selectedLoc == "Cluj"){
                    that.model.set("locationId", 1);
                }else{
                    that.model.set("locationId", 2);
                }
                if(selectedSpec == "Cardiologie"){
                    that.model.set("specializationId", 1);
                }else{
                    that.model.set("specializationId", 2);
                }
                that.model.set("userId",selectedUser );
                that.model.set("doctorId", NR.store.doctorId);
                that.model.set("isCanceled", "N");
                that.model.save().always(function () {


                }).fail(function () {
                    that.model.fetch();
                    that.licEvt.trigger('saveFailEvent', that.model);
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