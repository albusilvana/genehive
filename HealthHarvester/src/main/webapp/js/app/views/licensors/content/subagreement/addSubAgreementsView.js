define([
    'mainView',
    'subAgreementModel',
    'text!templates/licensors/content/subagreement/addSubAgreements.html'

], function (MainView, SubAgreementModel, template) {

    return MainView.extend({

        template: _.template(''),
        events: {
            'click #addtSaveButton': 'saveHandler',
            'click #addCancelButton': 'cancelHandler'
        },

        onShow: function () {


            this.licEvt = this.options.licEvt;
            this.model = new SubAgreementModel();
            this.model.set('subscriptionCurrencyCode', NR.store.parentCurrency, {silent: true});
            var that = this;
            var compiled = Handlebars.compile(template);
            compiled = compiled(this.model.toJSON());
            compiled = Handlebars.compile(compiled);
            this.form = new Backbone.Form({model: this.model, template: compiled, idPrefix: ''}).render();
            this.$el.append(this.form.el);

            this.drawSplitRatioSlider(that);
            $('#loadingImage').hide();

        },
        blockHandler: function () {
            $('#addtSaveButton').removeClass("btn-primary");
            $('#addtSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#addtSaveButton').removeClass("disabled");
            $('#addtSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },

        drawSplitRatioSlider: function (that) {
            this.splitRatioPercentage = $('#splitRatioPercentage_left');
            this.splitRatioPercentage2 = $('#splitRatioPercentage_right');
            this.splitRatioPercentage.val(50);
            this.splitRatioPercentage2.val(50);

            this.splitRatioPercentage.attr('title', "Licensor Share");
            this.splitRatioPercentage2.attr('title', "Moreover Share");

            var splitRatioSlider = $('#splitRatioSlider').slider({
                range: "max",
                min: 0,
                max: 100,
                step: 10,
                value: 50,
                slide: function (event, ui) {
                    $("#splitRatioPercentage_left").val(ui.value);
                    $("#splitRatioPercentage_right").val(100 - ui.value);
                    that.form.setValue('splitRatioPercentage', ui.value)
                }
            });
            this.splitRatioPercentage.on('change', function () {
                var val = that.splitRatioPercentage.val();
                $('#splitRatioSlider').slider('value', val);
                that.form.setValue('splitRatioPercentage', val);
                that.splitRatioPercentage.val(val);
                that.splitRatioPercentage2.val(100 - val)
            });
            this.splitRatioPercentage2.on('change', function () {
                var val = that.splitRatioPercentage2.val();
                var otherVal = 100 - val;
                that.splitRatioPercentage.val(100 - val);
                that.form.setValue('splitRatioPercentage', otherVal);
                $('#splitRatioSlider').slider('value', otherVal);

            });
        },

        saveHandler: function () {

            this.form.setValue('licensorAgreementId', NR.store.currentNode.id);
            if(this.form.getValue('splitRatioPercentage') == ""){
                this.form.setValue('splitRatioPercentage',50);
            }
            var errors = this.form.commit();
            var that = this;
            if (errors) {
                that.licEvt.trigger('validationEvent', errors);
            } else {
                this.blockHandler();
                this.model.save().done(function (key) {
                    that.model.set('name', that.model.get('subagreementKey'), {silent: true});
                    that.licEvt.trigger('createdSuccesEvent', that.model, key);
                    that.unblockHandler();
                }).fail(function () {
                        that.model.fetch();
                        that.licEvt.trigger('saveFailEvent', that.model);
                        that.unblockHandler();
                    });
            }

        },

        cancelHandler: function () {

            this.licEvt.trigger('cancelHandlerEvent', this.model);
        }

    })
});