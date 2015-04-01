define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'bundles';
        },
        labels: {
            displayName: 'Publication Name:',
            displayId: 'Priced Publication Id:',
            licensorSourceId: 'Licensor Source Id:',
            action: 'Action:',
            channel: 'Channel:',
            price: 'Price:',
            distributionPrice: 'Distribution Price:',
            currency: 'Currency:'
        },
        schema: {
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
//            actionId: {
//                type: 'Select', options: new ActionsCollection(), validators: [
//                    {type: 'required', message: 'Actions field is required.'}
//                ]
//            },
//            channelId: {
//                type: 'Select', options: new ChannelsCollection(), validators: [
//                    {type: 'required', message: 'Channel field is required.'}
//                ]
//            },
            effectiveDate: { type: 'DatePicker'},
            expiryDate: { type: 'DatePicker'},
//            action: { type: 'Hidden' },
//            channel: { type: 'Hidden' },
            id: { type: 'Hidden' },
            licensorSourceId: { type: 'Hidden' },
            publicationName: { type: 'Hidden' }
        },
        getAddedMessage: function () {
            return BaseModel.messages.common.add.format("Priced Publication");
        },
        getUpdatedMessage: function () {
            return BaseModel.messages.common.updateSuccess.format("Priced Publication");
        },
        getUpdatedFailedMessage: function () {
            return BaseModel.messages.common.updateFail.format("Priced Publication");
        }
    });
});