define([
    'underscore',
    'backbone',
    'pricedSubagreementModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'pricedSubagreements/pricedBundles/' + encodeURIComponent(NR.store.pricedBundleId);
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
