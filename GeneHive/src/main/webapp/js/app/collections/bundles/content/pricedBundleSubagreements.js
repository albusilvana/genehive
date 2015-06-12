define([
    'underscore',
    'backbone',
    'pricedBundleSubagreementModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'licensorSubagreements/bundle/' + encodeURIComponent(NR.store.parentBundleId);
        },
        parse: function (resp) {
            this.totalSize = resp.totalSize;
            return resp.entityList;
        },
        initialize: function (options) {
            if (options && options.url) {
                this.url = options.url;
            }
        }
    });
});