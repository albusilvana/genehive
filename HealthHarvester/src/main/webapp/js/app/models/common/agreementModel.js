define([
    'baseModel'
], function (BaseModel) {

    return BaseModel.extend({

        path: 'licensorAgreements/',
        urlRoot: function () {
            return NR.rootUrl + this.path;
        },
        labels: {
            displayName: BaseModel.labels.licensors.agreement.name,
            displayId: BaseModel.labels.licensors.agreement.id,
            displayEffDate: BaseModel.labels.licensors.agreement.effDate,
            displayExpDate: BaseModel.labels.licensors.agreement.expDate,
            displayComment: BaseModel.labels.licensors.agreement.comment,
            icon: 'agreement.png'
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Agreement");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Agreement");
        },
        validate: function (attrs) {
            var modelErrors;

            if (attrs.effectiveDate && attrs.expiryDate) {

                var d1 = new Date(attrs.effectiveDate);
                var d2 = new Date(attrs.expiryDate);

                if (d1 >= d2) {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['expiryDate'] = {message: 'Expiry Date must be after the Effective Date.'};
                }
            }

            return modelErrors;
        },
        schema: {
            name: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Name is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Name can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Name must not exceed 255 characters.'
                }
            },
            comment: { type: 'TextArea',
                validators: [
                    {
                        type: 'regexp', regexp: /\S/, message: 'Comment can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Comment must not exceed 255 characters.'
                }
            },
            effectiveDate: { type: 'DatePicker', validators: [
                {
                    type: 'required', message: 'Effective Date is required.'
                }
            ] },
            expiryDate: { type: 'DatePicker', validators: [
                {
                    type: 'required', message: 'Expiry Date is required.'
                }
            ] },
            parentId: { type: 'Hidden' }
        }
    });
});