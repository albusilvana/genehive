define([
    // Libraries to load
    'require',
    'mainView',
    // Views to load
    'licensorView',
     'bundlesView',
    'doctorAppointmentView',
    'patientAppointmentView',
    'doctorAdminView'
], function (require) {
    var LicensorView = require('licensorView'),
        DoctorAppintmentsView = require('doctorAppointmentView'),
        PatientAppointmentsView = require('patientAppointmentView'),
        DoctorAdminView = require('doctorAdminView'),
        BundlesView = require('bundlesView');

    var AppRouter = Marionette.AppRouter.extend({

        appRoutes: {
            'patients': 'showLicensors',
            'doctorAppointments': 'showDoctorAppointments',
            'patientAppointments': 'showPatientAppointments',
            'doctorAdmin': 'showDoctorsAdmin',

            'bundles/content': 'showContentBundles',
            // Default
            '*actions': 'defaultAction'
        }
    });

    var AppController = Marionette.Controller.extend({

        showLicensors: function (id) {
            NR.appLayout.contentRegion.show(new LicensorView())
        },
        showContentBundles: function (id) {
            NR.appLayout.contentRegion.show(new BundlesView({show_content_bundle: true}))
        },
        showDoctorAppointments:  function (id) {
            NR.appLayout.contentRegion.show(new DoctorAppintmentsView({}))
        },
        showPatientAppointments:  function (id) {
            NR.appLayout.contentRegion.show(new PatientAppointmentsView({}))
        },
        showDoctorsAdmin:  function (id) {
            NR.appLayout.contentRegion.show(new DoctorAdminView({}))
        },
        defaultAction: function (actions) {

        },
        refreshHandler: function () {
            var currentView = NR.appLayout.contentRegion.currentView;
            NR.appLayout.contentRegion.show(currentView);
        }
    });

    var initialize = function () {
        NR.appController = new AppController();
        var app_router = new AppRouter({controller: NR.appController});
        Backbone.history.start();
        NR.store.globalEvent = _.extend({}, Backbone.Events);
        NR.store.globalEvent.bind("refreshEvent", NR.appController.refreshHandler, this);
    };

    return {
        initialize: initialize
    };
});