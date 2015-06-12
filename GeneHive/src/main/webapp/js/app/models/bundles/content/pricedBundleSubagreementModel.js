define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        urlRoot: function () {
            return NR.rootUrl + 'licensorSubagreements/';
        },
        labels: {
            displayId: BaseModel.labels.licensors.subagreement.id,
            displayName: BaseModel.labels.licensors.subagreement.name,
            displaySubagreementKey: 'Subagreement Key',
            displayAccessFee: 'Access Fee'
        },

        schema: {
            subagreementKey: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Subagreement Key is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Subagreement Key can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Subagreement Key must not exceed 255 characters.'
                }
            },
            subagreementName: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Subagreement Name is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Subagreement Name can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Subagreement Name must not exceed 255 characters.'
                }
            },
            accessFeeUSD: { type: 'Text', editorClass: 'input-mini',
                validators: [
                    {
                        type: 'required', message: 'Access Fee is required.'
                    },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            accessFeeEUR: { type: 'Text', editorClass: 'input-mini',
                validators: [
                    {
                        type: 'required', message: 'Access Fee is required.'
                    },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            accessFeeGBP: { type: 'Text', editorClass: 'input-mini',
                validators: [
                    {
                        type: 'required', message: 'Access Fee is required.'
                    },
                    {
                        type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee is not in the correct format (digit with 2 decimals).'
                    }
                ]},
            id: { type: 'Hidden' }
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Subagreement");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Subagreement");
        },
        getDeletedMessage: function () {
            return BaseModel.messages.common.deleteSuccess.format("Subagreement");
        },
        getDeleteNotAllowedMessage: function () {
            return BaseModel.messages.common.deletionNotAllowed;
        }

    });
})
;