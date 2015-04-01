define([
    'underscore',
    'backbone',
    'doctorAppointmentModel'
], function (_, Backbone, model) {

    return Backbone.Collection.extend({
        model: model,
        url: function () {
            var url =  NR.rootUrl + 'appointment/doctorId/'+  NR.store.doctorId;
            console.log(url);
            return url;
        }
//        parse: function (resp) {
//            this.totalSize = resp.length;
//            return resp;
//        }
    });
});
