define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        urlRoot: function () {
            return NR.rootUrl + 'bundleSubagreements/';
        },
        labels: {
            displayName: 'Subagreement Name:',
            displayId: 'Subagreement Id:',
            displayFeeValue: 'Access Fee:',
            displayPaymentCycle: 'Payment Cycle:',
            displayEffDate: 'Effective Date:',
            displayExpDate: 'Expiry Date:',
            subagreementKey: 'Subagreement Key:',
            icon: 'agreement.png'
        },
        validate: function (attrs) {
            var modelErrors;

            var d1 = new Date(attrs.effectiveDate);
            var d2 = new Date(attrs.expiryDate);


            if (NR.store.isExpire) {
                if (d1 >= d2) {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'Expiry Date must be after the Effective Date.'}
                }
                if (attrs.expiryDate == "") {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'New Expiry Date is required.'}
                }
            } else {
                if (d1 >= d2) {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'Expiry Date must be after the Effective Date.'}
                }
//                if (attrs.name == "") {
//                    modelErrors = modelErrors ? modelErrors : {};
//                    modelErrors['name'] = {message: 'Name is required.'}
//                }
                if (attrs.expiryDate == "") {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'Expiry Date is required.'}
                }
                if (attrs.effectiveDate == "") {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['effectiveDate'] = {message: 'Effective Date is required.'}
                }
            }

            return modelErrors;
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Bundle Subagreement");
        },
        schema: {
//            name: { type: 'Text',
//                validators: [
//                    {
//                        type: 'regexp', regexp: /\S/, message: 'Name can not contain only white spaces.'
//                    }
//                ],
//                editorAttrs: {
//                    maxlength: 255, title: 'Name must not exceed 255 characters.'
//                }
//            },
            effectiveDate: { type: 'DatePicker'},
            expiryDate: { type: 'DatePicker'},
            bundleId: { type: 'Hidden' },
            licensorSubagreementId: { type: 'Hidden' }
        },
        getExpiredSuccessMessage: function () {
            return BaseModel.messages.common.expiredSuccess.format("bundle subagreement");
        },
        getExpiredErrorMessage: function () {
            return BaseModel.messages.common.expiredError.format("bundle subagreement");
        },
        getEditedSuccessMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("bundle subagreement");
        },
        getEditErrorMessage: function () {
            return BaseModel.messages.common.updateFail.format("bundle subagreement");
        }

    });
});