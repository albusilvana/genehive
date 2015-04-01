define([
    'underscore',
    'backbone',
    'costedPublicationModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
//            TODO update url when feature is implemented
            return NR.rootUrl;
        },
        parse: function (resp) {
            this.totalSize = resp.totalSize;
            return resp.entityList;
        }
    });
});