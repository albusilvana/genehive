define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'pricedBundles';
        },
        labels: {
            displayName: 'Priced Bundle Name:',
            displayId: 'Priced Bundle Id:',
            displayBundleName: 'Bundle Name:',
            version: 'Version:',
            effectiveDate: BaseModel.labels.licensors.agreement.effDate,
            expiryDate: BaseModel.labels.licensors.agreement.expDate
        },
        validation: {
            name: {
                required: true,
                pattern: /\S/,
                maxLength: 255,
                msg: 'Please enter a valid name.'
            },
            version: {
                required: true,
                pattern: /\S/,
                maxLength: 255,
                msg: 'Please enter a valid version.'
            }
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
            version: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Version is required.'
                },
                {
                    type: 'regexp', regexp: /\S/, message: 'Version can not contain only white spaces.'
                }
            ],
                editorAttrs: {
                    maxlength: 255, title: 'Name must not exceed 255 characters.'
                }},
            effectiveDate: { type: 'DatePicker'},
            expiryDate: { type: 'DatePicker'},
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
            id: { type: 'Hidden' },
            bundleName: { type: 'Hidden' },
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
        },
        getExpiredSuccessMessage: function () {
            return BaseModel.messages.common.expiredSuccess.format("Priced Bundle");
        },
        getExpiredErrorMessage: function () {
            return BaseModel.messages.common.expiredError.format("Priced Bundle");
        }
    });
});