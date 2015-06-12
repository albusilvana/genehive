/**
 * App.js
 *
 * Entry point to application: It initializes router to access to every URL in the app
 */
define([
    'jquery',
    'underscore',
    'backbone',
    'handlebars',
    'marionette',
    'router',	//Dependency: router.js
    'statisticsView'
], function ($, _, Backbone, Handlebars, Marionette, Router, StatisticsView) {

    window.NR = new Marionette.Application();
    window.NR.rootUrl = '/services/rest/';

    var initialize = function () {

        NR.AppLayout = Marionette.Layout.extend({
            regions: {
                contentRegion: '#content'
            }
        });
        NR.appLayout = new NR.AppLayout({el: "#app"});

        NR.appLayout.contentRegion.show(new StatisticsView());

        NR.store = {


            getSearchableColumns:function (param){
                var searchableArray = param.oApi._fnGetColumns(param, 'bSearchable');
                var searchableColumns = [];
                for (var i = 0; i < searchableArray.length; i++) {
                    var obj = searchableArray[i];
                    searchableColumns.push(param.aoColumns[obj].mDataProp);
                }
                return searchableColumns;
            }
        };
        NR.store.today = new Date();
        NR.store.curr_year = NR.store.today.getFullYear();
        NR.store.curr_month = NR.store.today.getMonth();
        NR.store.next_year = NR.store.curr_year + 1;
        NR.store.monthArray = ["January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"];

        Router.initialize();
    };
    NR.addInitializer(initialize);
    return NR;
});