define([
    'underscore',
    'backbone',
    'specializationModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'specialization/all';
        }
    });
});