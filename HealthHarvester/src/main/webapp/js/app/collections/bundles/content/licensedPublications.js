define([
    'underscore',
    'backbone',
    'licensedPublicationModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'publications/subagreements/' + encodeURIComponent(NR.store.selectedSubagreementId);
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