define([
    'mainView',
    'text!templates/licensors/content/licensor/editLicensors.html',
    'licensorModel'

], function (MainView, template,LicensorModel) {

    return MainView.extend({

        template: _.template(''),

        onShow: function () {

            this.licEvt = this.options.licEvt;
            this.model = new LicensorModel();
            var compiled = Handlebars.compile(template);
            compiled = Handlebars.compile(compiled);
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
            this.model.save().done(function () {
                that.licEvt.trigger('saveSuccesEvent', that.model);
            }).fail(function () {
                that.model.fetch();
                that.licEvt.trigger('saveFailEvent', that.model);
            });
        },

        cancelHandler: function () {

            this.licEvt.trigger('changeView', this.model);
        }

    })
});