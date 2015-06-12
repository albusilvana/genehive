define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'bundles';
        },
        labels: {
            displayName: 'Priced Bundle Name:',
            displayId: 'Priced Bundle Id:',
            displayBundleName: 'Bundle Name:',
            effectiveDate: BaseModel.labels.licensors.agreement.effDate,
            expiryDate: BaseModel.labels.licensors.agreement.expDate,
            displayPrice: 'Price:',
            version: 'Version:'
        },
        schema: {
            name: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Name is required.'
                },
                {
                    type: 'regexp', regexp: /\S/, message: 'Name can not contain only white spaces.'
                }
            ], editorAttrs: {
                maxlength: 255, title: 'Name must not exceed 255 characters.'

            }},
            bundleName: { type: 'Hidden' },
            effectiveMonth: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            effectiveYear: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            expiryMonth: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            expiryYear: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            accessFeeUSD: {type: 'Text', editorClass: 'input-mini',
                validators: [{
                    type: 'required', message: 'Access Fee USD is required.'
                },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee USD is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            accessFeeEUR: {type: 'Text', editorClass: 'input-mini',
                validators: [{
                    type: 'required', message: 'Access Fee EUR is required.'
                },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee EUR is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            accessFeeGBP: {type: 'Text', editorClass: 'input-mini',
                validators: [{
                    type: 'required', message: 'Access Fee GBP is required.'
                },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee GBP is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            id: { type: 'Hidden' },
            modifyDate: { type: 'Hidden' }
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Priced Bundle");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Priced Bundle");
        },
        getUpdatedFailedMessage: function () {
            return BaseModel.messages.common.updateFail.format("Priced Bundle");
        }
    });
});