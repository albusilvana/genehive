define([
    'underscore',
    'backbone',
    'pricedPublicationModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'pricedLicensedPublications/pricedSubagreements/' + encodeURIComponent(NR.store.pricedSubagreementId);
        },
        initialize: function (options) {
            if (options && options.url) {
                this.url = options.url;
            }
        },
        parse: function (resp) {
            this.totalSize = resp.totalSize;
            return resp.entityList;
        }
    });
});