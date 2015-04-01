define([
    'underscore',
    'backbone',
    'locationModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'location/all';
        }
    });
});