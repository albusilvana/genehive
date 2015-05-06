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
        statisticsView: 'views/home/statisticsView'
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