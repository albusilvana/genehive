define([
    'underscore',
    'backbone',
    'costedSubagreementModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'costedSubagreements/licensor/' + encodeURIComponent(NR.store.licensorId);
            
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