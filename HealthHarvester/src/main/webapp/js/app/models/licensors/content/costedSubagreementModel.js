define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        urlRoot: function () {
            return NR.rootUrl + 'costedSubagreements/licensor/' + NR.store.licensorId;
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

        validate: function (attrs) {
            var modelErrors;

            if (attrs.effectiveDate && attrs.expiryDate) {

                var d1 = new Date(attrs.effectiveDate);
                var d2 = new Date(attrs.expiryDate);

                if (d1 >= d2) {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'Expiry Date must be after the Effective Date.'}
                }
            }
            if (attrs.feeValue.length > 11) {
                modelErrors = modelErrors ? modelErrors : {};
                modelErrors['feeValue'] = {message: 'Fee value must have maximum 8 integer digits.'}
            }

            return modelErrors;
        },

        schema: {
            subagreementKey: { type: 'Text',
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
            cost: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Access Fee is required.'
                },
                {
                    /* regex for testing a number with exact 2 digits after comma */
                    type: 'regexp', regexp: /^[0-9]*[.]\d{2}$/, message: 'Access Fee is not in the correct format (digit with 2 decimals).'
                }
            ]},
            effectiveDate: { type: 'DatePicker', validators: [
                {
                    type: 'required', message: 'Effective Date is required.'
                }
            ]},
            expiryDate: { type: 'DatePicker', validators: [
                {
                    type: 'required', message: 'Expiry Date is required.'
                }
            ]},
            splitRatio: { type: 'Hidden'},
            currency: { type: 'Hidden'},
            subagreementId: { type: 'Hidden' }
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
        },

        parse: function (resp) {
            resp['name'] = resp['subagreementKey'];
            resp['objectName'] = resp['subagreementKey'];
            resp['displayFeeValue'] = resp['cost'] + " " + resp['currency'];
            return resp;
        }

    });
})
;