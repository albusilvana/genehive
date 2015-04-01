define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'publications';
        },
        labels: {
            licensorSourceId: 'Licensor Source Id',
            lincensorPublicationName: 'Licensor Publication Name'
        },
        schema: {
            licensorSourceId: { type: 'Text' },
            licensorPublicationName: { type: 'Text' },
            id: { type: 'Hidden' }
        }
    });
});