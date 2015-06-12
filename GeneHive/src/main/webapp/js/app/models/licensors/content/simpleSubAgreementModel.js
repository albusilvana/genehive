define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        urlRoot: function () {
            return NR.rootUrl + 'licensorSubagreements/';
        },
        labels: {
            displayName: BaseModel.labels.licensors.subagreement.name,
            displayId: BaseModel.labels.licensors.subagreement.id,
            displayFeeValue: BaseModel.labels.licensors.subagreement.fee,
            displaySplitRatio: BaseModel.labels.licensors.subagreement.splitRatio,
            displayPaymentCycle: BaseModel.labels.licensors.subagreement.paymentCycle,
            displayEffDate: BaseModel.labels.licensors.subagreement.effDate,
            displayExpDate: BaseModel.labels.licensors.subagreement.expDate,
            icon: 'subagreement1.png'
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