define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'bundles';
        },
        labels: {
            displayId: 'Subagreement Id:',
            subagreementKey: 'Subagreement Key:',
            price: 'Price:',
            currency: 'Currency:',
            displayEffDate: BaseModel.labels.licensors.agreement.effDate,
            displayExpDate: BaseModel.labels.licensors.agreement.expDate
        },
        schema: {
            name: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Name is required.'
                },
                {
                    type: 'regexp', regexp: /\S/, message: 'Name can not contain only white spaces.'
                }
            ],
                editorAttrs: {
                    maxlength: 255, title: 'Name must not exceed 255 characters.'
                }},
            price: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Price is required.'
                },
                {
                    /* regex for testing a number with exact 2 digits after comma */
                    type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Price is not in the correct format (digit with 2 decimals).'
                }
            ]},
            currency: {
                type: 'Select', options: ["USD", "EUR", "GBP"], validators: [
                    {type: 'required', message: 'Currency type must be selected.'}
                ],
                editorClass: 'drop-style'
            },
            effectiveDate: { type: 'DatePicker'},
            expiryDate: { type: 'DatePicker'},
            id: { type: 'Hidden' },
            subagreementKey: { type: 'Hidden' },
            modifyDate: { type: 'Hidden' }
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Priced Subagreement");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Priced Subagreement");
        },
        getUpdatedFailedMessage: function () {
            return BaseModel.messages.common.updateFail.format("Priced Subagreement");
        }
    });
});