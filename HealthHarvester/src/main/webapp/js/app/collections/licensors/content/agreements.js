define([
    'underscore',
    'backbone',
    'agreementModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'licensorAgreements/licensors/' + encodeURIComponent(NR.store.currentNode.id);
        }
    });
});