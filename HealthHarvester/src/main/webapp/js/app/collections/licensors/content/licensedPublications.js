//define([
//    'underscore',
//    'backbone',
//    'publicationModel'
//], function (_, Backbone, model) {
//
//    return Backbone.Collection.extend({
//        model: model,
//        url: function () {
//            return NR.rootUrl + 'publications/availablelicensedPublications/' + encodeURIComponent(NR.store.currentNode.licensorId);
//        },
//        parse: function (resp) {
//            this.totalSize = resp.totalSize;
//            return resp.entityList;
//        }
//    });
//});