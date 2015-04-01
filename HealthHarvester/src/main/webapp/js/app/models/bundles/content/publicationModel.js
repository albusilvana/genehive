define([
    'baseModel'
], function (BaseModel) {

    return BaseModel.extend({

        labels: {
            displayName: 'Publication Name:',
            licensorPublicationName: 'Licensor Publication Name:',
            displayId: 'Publication Id:',
            displayAccessPrice: 'Price:',
            displayChannel: 'Channel Code:',
            displayAction: 'Action Type:',
            pCode: 'Licensor Source Id:',
            icon: 'publication.png'
        },
        schema: {
            modifiedByUserId: 'Text',
            modifyDate: 'DatePicker',
            active: 'Checkbox',
            name: 'Text',
            id: 'Text',
            price: { type: 'Hidden' },
            newPrice: { type: 'Hidden' }
        }

    });
});