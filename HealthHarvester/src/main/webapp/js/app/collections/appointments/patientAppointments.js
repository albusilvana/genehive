define([
    'underscore',
    'backbone',
    'patientAppointmentModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
           var url =  NR.rootUrl + 'appointment/userId/'+ NR.store.userID;
            console.log(url);
            return url;
        }
//        parse: function (resp) {
//            this.totalSize = resp.length;
//            return resp;
//        }
    });
});