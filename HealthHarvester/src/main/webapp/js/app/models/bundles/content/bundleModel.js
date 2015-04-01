define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'bundles';
        },
        labels: {
            displayName: 'Bundle Name:',
            displayId: 'Bundle Id:',
            displayEffDate: BaseModel.labels.licensors.agreement.effDate,
            displayExpDate: BaseModel.labels.licensors.agreement.expDate
        },
        validate: function (attrs) {
            var modelErrors;
            if (NR.store.isEdit) {
                if (attrs.effectiveDate == "") {
                    modelErrors = modelErrors ? modelErrors : {};
                    modelErrors['effectiveDate'] = {message: 'Effective Date is required.'}
                }
            }
            return modelErrors;
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
            effectiveMonth: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            effectiveYear: {
                type: 'Select', options: [],
                editorClass: 'drop-small-style'
            },
            effectiveDate:{ type: 'Hidden'},
            id: { type: 'Hidden' }
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Bundle");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Bundle");
        },
        getUpdatedFailedMessage: function () {
            return BaseModel.messages.common.updateFail.format("Bundle");
        }
    });
});