define([
    'underscore',
    'backbone',
    'doctorModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            return NR.rootUrl + 'doctor/locationId/'+NR.store.selectedLoc + "/specializationId/"+ NR.store.selectedSpec;
//            return NR.rootUrl + 'doctor/all';
        }
    });
});