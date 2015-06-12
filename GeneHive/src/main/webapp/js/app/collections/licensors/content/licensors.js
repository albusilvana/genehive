define([
    'underscore',
    'backbone',
    'licensorModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'user/patients';
        },
        parse: function (resp) {
            this.totalSize = resp.size;
            return resp;
        }
    });
});