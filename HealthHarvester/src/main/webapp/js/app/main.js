require.config({
    waitSeconds: 20,
    shim: {   // Using shim we define dependencies between our libraries
        jquery: {
            exports: 'jQuery'
        },
        jqueryBlockUI: {
            deps: ['jquery']
        },
        underscore: {
            exports: '_'
        },
        backbone: {
            deps: ['jquery', 'underscore'],
            exports: 'Backbone'
        },
        marionette: {
            deps: ['jquery', 'underscore', 'backbone'],
            exports: 'Marionette'
        },
        backboneForms: {
            deps: ['backbone']
        },
        backboneValidation: {
            deps: ['backbone']
        },
        jqueryUiCustom: ['jquery'],
        jqueryDynatree: ['jqueryUiCustom']
    },
    config: {
        //the config for the i18n
        i18n: {
            locale: 'en-us'
        }
    },
    paths: {   // Require.js allows us to configure shortcut alias
        jquery: '../lib/jquery/jquery',
        jqueryBlockUI: '../lib/jquery/jquery.blockUI',
        underscore: '../lib/underscore/underscore',
        backbone: '../lib/backbone/backbone',
        backboneOverrides: '../lib/backbone/backbone.overrides',
        backboneForms: '../lib/backbone/backbone-forms',
        backboneValidation: '../lib/backbone/backbone-validation',
        marionette: '../lib/backbone/backbone.marionette',
        text: '../lib/require/text',
        i18n: '../lib/require/i18n',
        handlebars: '../lib/handlebars',
        moment: '../lib/moment.min',
        jqueryDataTables: '../lib/jquery/jquery.dataTables',
        jqueryUiCustom: '../lib/jquery/jquery-ui-1.8.21.custom.min',


        /*main views*/
        mainView: 'views/mainView',
        licensorView: 'views/licensors/licensorViewController',
        bundlesView: 'views/bundles/bundlesViewController',
        doctorAppointmentView: 'views/appointments/DoctorAppointmentViewController',
        patientAppointmentView: 'views/appointments/PatientAppointmentViewController',
        /*sub views*/
        editLicensorsView: 'views/licensors/content/licensor/editLicensorsView',
        addLicensorsView: 'views/licensors/content/licensor/addLicensorsView',
        licensorsTableView: 'views/licensors/content/licensor/licensorsTableView',
        licensorDetailView: 'views/licensors/content/licensor/licensorDetailView',
        editPublications: 'views/licensors/content/publication/editPublications',
        publicationDetailView: 'views/licensors/content/publication/publicationDetailView',
        addPublicationsView: 'views/licensors/content/publication/addPublicationsView',
        contentPublicationsTableView: 'views/licensors/content/publication/contentPublicationsTableView',
//        addSubAgreementsView: 'views/licensors/content/subagreement/addSubAgreementsView',
        contentLicensorSubagreementTableView: 'views/licensors/content/subagreement/allContentSubagreementsTableView',
        subagreementDetailView: 'views/licensors/content/subagreement/subagreementDetailView',
        editBundleSubagreementView: 'views/bundles/content/subagreement/editBundleSubagreement',
        expireSubagreementsView: 'views/bundles/content/subagreement/expireBundleSubagreementView',
        contentSubagreementsTableView: 'views/licensors/content/subagreement/contentSubagreementsTableView',
//        pricingRunTableView: 'views/pricingRun/pricingRunTableView',
//        pricingRunDetailView: 'views/pricingRun/pricingRunDetailView',
        messagesView: 'views/common/messagesView',
        bundleEditView: 'views/bundles/content/bundle/editBundleView',
//        editBundlePublicationsView: 'views/bundles/content/publication/pricedPublicationEditTableView',
//        adjustmentsHierarchyView: 'views/adjustments/adjustmentsHierarchyView',
//        adjustmentsActionTable: 'views/adjustments/adjustmentsActionTableView',
//        adjustmentsAccessTable: 'views/adjustments/adjustmentsAccessTableView',
//        createAdjustmentView: 'views/adjustments/createAdjustmentView',
//        adjustmentsTablesView: 'views/adjustments/adjustmentsTableView',

        patientAppointmentTableView: 'views/appointments/PatientAppointmentTableView',
        doctorAppointmentTableView: 'views/appointments/DoctorAppointmentTableView',
        appDetailView: 'views/appointments/PatientAppointmentDetailView',
        addAppointmentView: 'views/appointments/AddPatientAppointmentView',
        addDoctorAppointmentView: 'views/appointments/AddDoctorAppointmentView',
        doctorTableView: 'views/appointments/DoctorsTableView',
        doctorAdminView : 'views/appointments/DoctorsAdminViewController',
        /*bundles*/
//        content
        contentBundlesViewController: 'views/bundles/content/contentBundlesViewController',
        bundleDetailView: 'views/bundles/content/bundle/bundleDetailView',
        bundleSubagreementDetailView: 'views/bundles/content/subagreement/subagreementDetailView',
        bundlePublicationDetailView: 'views/bundles/content/publication/publicationDetailView',
        addBundleView: 'views/bundles/content/bundle/addBundleView',
        addBundleSubagreementView: 'views/bundles/content/subagreement/addBundleSubagreementView',
        publicationEditableTableView: 'views/bundles/content/publication/publicationEditableTableView',
        bundleTableView: 'views/bundles/content/bundle/bundleTableView',
        contentBundleTableView: 'views/bundles/content/bundle/contentBundleTableView',
        contentSubagreementTableView: 'views/bundles/content/subagreement/contentSubagreementTableView',
        contentPublicationTableView: 'views/bundles/content/publication/contentPublicationTableView',
        addPricedBundleStep3View: 'views/bundles/content/subagreement/subagreementEditableTableView',
        addPricedBundleStep4View: 'views/bundles/content/bundle/licensedPublicationEditableTableView',
//

        /*models*/
        baseModel: 'models/baseModel',
        timeframeModel: 'models/timeframeModel',
        ruleModel: 'models/common/ruleModel',
        agreementModel: 'models/common/agreementModel',
        publicationModel: 'models/common/publicationModel',
        patientAppointmentModel: 'models/appointments/patientAppointmentModel',
        doctorAppointmentModel: 'models/appointments/doctorAppointmentModel',
        doctorModel: 'models/appointments/doctorModel',
        locationModel: 'models/appointments/locationModel',
        specializationModel: 'models/appointments/specializationModel',

        /*licensors*/
        licensorModel: 'models/licensors/content/licensorModel',
        subAgreementModel: 'models/licensors/content/subAgreementModel',
        costedSubagreementModel: 'models/licensors/content/costedSubagreementModel',
        costedPublicationModel: 'models/licensors/content/costedPublicationModel',
        simpleSubAgreementModel: 'models/licensors/content/simpleSubAgreementModel',


        /*bundles*/
//        content
        bundleModel: 'models/bundles/content/bundleModel',
        licensedPublicationModel: 'models/bundles/content/licensedPublicationModel',
        bundleSubAgreementModel: 'models/bundles/content/subAgreementModel',
        pricedBundleSubagreementModel: 'models/bundles/content/pricedBundleSubagreementModel',
//        bundlePublicationModel: 'models/customers/publicationModel',


        /*licensors*/
        licensorLicensors: 'collections/licensors/content/licensors',
        licensorPublications: 'collections/licensors/content/publications',
        licensorLicensedPublications: 'collections/licensors/content/licensedPublications',
        costedPublications: 'collections/licensors/content/costedPublications',
        licensorSubAgreements: 'collections/licensors/content/subAgreements',
        costedSubagreements: 'collections/licensors/content/costedSubagreements',
        allSubagreements: 'collections/licensors/content/allSubagreements',
        patientAppointments: 'collections/appointments/patientAppointments',
        doctorAppointments: 'collections/appointments/doctorAppointments',


//        content
        bundleBundles: 'collections/bundles/content/bundles',
        bundleSubAgreements: 'collections/bundles/content/bundleSubAgreements',
        bundlePublications: 'collections/bundles/content/bundlePublications',
        licensedPublications: 'collections/bundles/content/licensedPublications',
        pricedBundleSubagreements: 'collections/bundles/content/pricedBundleSubagreements',
        doctorsCollection: 'collections/appointments/doctors',
        locationsCollection: 'collections/appointments/locations',
        specializationsCollection: 'collections/appointments/specializations'

    }
});

require([
    // Load our app module and pass it to our definition function
    'app'

], function (App) { // The "app" dependency is passed in as "App"

    // if session expires, backbone ajax calls will get blocked and server will return http status 401 unauthorized
    // so if that happens redirect the user to the login page
    $(document).ajaxError(function (e, xhr, options) {
        if (xhr.status == 401) {
            window.location.href = '/login.html';
        }
    });


    App.start();
});