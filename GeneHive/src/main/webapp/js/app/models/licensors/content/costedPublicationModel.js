define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        urlRoot: function () {
            return NR.rootUrl + 'licensedPublications/costedSubagreements/' + NR.store.subagreementId;
        },
        labels: {
            displayName: BaseModel.labels.common.publication.name,
            displayId: BaseModel.labels.common.publication.id,
            displayAccessPrice: BaseModel.labels.common.publication.price,
            displayAction: BaseModel.labels.common.publication.action,
            displayChannel: BaseModel.labels.common.publication.channel,
            icon: 'publication.png'
        },
        parse: function (resp) {
            resp['displayCost'] = resp['cost'] + " " + resp['currency'];
            return resp;
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Publication");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Publication");
        },
        getDeletedMessage: function () {
            return BaseModel.messages.common.deleteSuccess.format("Publication");
        },
        validate: function (attrs) {
            var modelErrors;


            if (attrs.cost.length > 11) {
                modelErrors = modelErrors ? modelErrors : {};
                modelErrors['cost'] = {message: 'Click fee value must have maximum 8 integer digits.'}
            }

            return modelErrors;
        },
        schema: {
            cost: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Click Fee is required.'
                },
                {
                    /* regex for testing a number with exact 2 digits after comma */
                    type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee is not in the correct format (digit with 2 decimals).'
                }
            ]},

            sourceId: { type: 'Hidden' },
            licensedPublicationId: { type: 'Hidden' },
            currency: { type: 'Hidden' },
            publicationName: { type: 'Hidden' }

        }
    });
});
