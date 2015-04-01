define([
    'mainView',
    'text!templates/common/publication/editPublications.html'

], function (MainView, template) {

    return MainView.extend({

        template: _.template(''),

        onShow: function () {

            this.licEvt = this.options.licEvt;
            this.model = this.options.model;
            var compiled = Handlebars.compile(template);
            compiled = compiled(this.model.toJSON());
            compiled = Handlebars.compile(compiled);
            this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
            this.$el.append(this.form.el);
            $('#loadingImage').hide();
        },
        blockHandler: function () {
            $('#editSaveButton').removeClass("btn-primary");
            $('#editSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#editSaveButton').removeClass("disabled");
            $('#editSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },

        events: {
            'click #editSaveButton': 'saveHandler',
            'click #editCancelButton': 'cancelHandler'
        },

        saveHandler: function () {
            this.model.unset('currency');
            this.form.setValue('currency', NR.store.parentCurrency);
            var that = this;
            var errors = this.form.commit();
            if (errors) {
                that.licEvt.trigger('validationEvent', errors);
            } else {
                this.blockHandler();
                this.model.save().done(function () {
                    that.unblockHandler();
                    that.licEvt.trigger('saveSuccesEvent', that.model);
                }).fail(function () {
                        that.model.fetch();
                        that.unblockHandler();
                        that.licEvt.trigger('saveFailEvent', that.model);
                    });
            }
        },

        cancelHandler: function () {

            this.licEvt.trigger('changeView', this.model);
        }

    })
});