define([
    'mainView',
    'text!templates/appointments/patientAppointmentsDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});
