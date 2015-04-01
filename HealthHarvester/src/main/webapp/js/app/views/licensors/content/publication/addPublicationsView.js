define([
    'text!templates/common/publication/addPublications.html',
    'mainView',
    'publicationModel'

], function (template) {

    var MainView = require('mainView'),
        PublicationModel = require('publicationModel');

    return MainView.extend({

        template: _.template(''),
        events: {
            'click #addPublicationSaveButton': 'saveHandler',
            'click #addPublicationCancelButton': 'cancelHandler',
            'click #previousButton': 'previousButtonHandler'
        },

        onShow: function () {

            this.event = this.options.event;
            this.model = this.options.model;
            this.model.set('currency', NR.store.parentCurrency, {silent: true});
            var compiled = Handlebars.compile(template);
            compiled = compiled(this.model.toJSON());
            compiled = Handlebars.compile(compiled);
            this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
            this.$el.append(this.form.el);
            $('#loadingImage').hide();

        },
        blockHandler: function () {
            $('#addPublicationSaveButton').removeClass("btn-primary");
            $('#addPublicationSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#addPublicationSaveButton').removeClass("disabled");
            $('#addPublicationSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },

        saveHandler: function () {

            this.form.setValue('licensorId', NR.store.currentNode.licensorId);
            this.form.setValue('licensedPublicationId', this.model.get('licensedPublicationId'));
            this.form.setValue('subagreementId', NR.store.currentNode.id);
            this.form.setValue('currency', NR.store.parentCurrency);
            this.model.set('actionType', this.form.getEditor('actionId').schema.options.models[0].collection.get(this.form.getValue('actionId')).toString(), {silent: true});
            this.model.set('channelCode', this.form.getEditor('channelId').schema.options.models[0].collection.get(this.form.getValue('channelId')).toString(), {silent: true});
            var errors = this.form.commit();
            var that = this;

            if (errors) {
                that.event.trigger('validationEvent', errors);
            } else {
                this.blockHandler();
                this.model.save().done(function (key) {
                    that.event.trigger('createdSuccesEvent', that.model, key);
                    that.unblockHandler();
                }).fail(function () {
                        that.model.fetch();
                        that.event.trigger('saveFailEvent', that.model);
                        that.unblockHandler();
                    });
            }

        },

        previousButtonHandler: function () {


        },

        cancelHandler: function () {

            this.event.trigger('cancelHandlerEvent', this.model);
        }
    })
});