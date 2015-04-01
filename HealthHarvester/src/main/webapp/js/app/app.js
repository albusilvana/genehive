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
    'views/home/headerView',
    'views/home/menuView',
    'views/home/footerView'
], function ($, _, Backbone, Handlebars, Marionette, Router, HeaderView, MenuView, FooterView) {

    window.NR = new Marionette.Application();
    window.NR.rootUrl = '/services/rest/';

    var initialize = function () {

        NR.AppLayout = Marionette.Layout.extend({
            regions: {
                headerRegion: '#header',
                menuRegion: '#leftMenu',
                contentRegion: '#content',
                footerRegion: '#footer'
            }
        });
        NR.appLayout = new NR.AppLayout({el: "#app"});

        NR.appLayout.headerRegion.show(new HeaderView());
        NR.appLayout.menuRegion.show(new MenuView());
        NR.appLayout.footerRegion.show(new FooterView());


        NR.store = {
            initializeYearsAndMonths: function(form_fields) {
                if (form_fields.effectiveYear) {
                    var effectiveYears = [];
                    effectiveYears.push({val: NR.store.curr_year, label: NR.store.curr_year });
                    effectiveYears.push({val: NR.store.next_year, label: NR.store.next_year });
                    form_fields.effectiveYear.editor.setOptions(effectiveYears);
                }
                if (form_fields.expiryYear) {
                    var expiryYears = [];
                    expiryYears.push({val: 9999, label: "-" });
                    expiryYears.push({val: NR.store.curr_year, label: NR.store.curr_year });
                    expiryYears.push({val: NR.store.next_year, label: NR.store.next_year });
                    form_fields.expiryYear.editor.setOptions(expiryYears);

                }

                NR.store.changeEffectiveYearHandler(form_fields);
            },
            changeEffectiveYearHandler: function(form_fields) {
                var selected_effective_year = form_fields.effectiveYear.editor.getValue();
                var effective_months = [];
                var years = [];
                var i = 0;
                years.push({val: 9999, label: "-" });
                years.push({val: selected_effective_year, label: selected_effective_year});
                if (selected_effective_year == NR.store.curr_year) {
                    years.push({val: NR.store.next_year, label: NR.store.next_year });
                    for (i = NR.store.curr_month; i <= 11; i++) {
                        effective_months.push({val: (i), label: NR.store.monthArray[i]});
                    }
                } else {
                    for (i = 0; i <= 11; i++) {
                        effective_months.push({val: (i), label: NR.store.monthArray[i]});
                    }
                }

                form_fields.effectiveMonth.editor.setOptions(effective_months);
                form_fields.expiryYear.editor.setOptions(years);
                form_fields.expiryMonth.editor.setOptions(effective_months);
                NR.store.changeExpiryYearHandler(form_fields);
            },
            changeExpiryYearHandler: function (form_fields) {
                var selected_expiry_year = form_fields.expiryYear.editor.getValue();
                var selected_effective_year = form_fields.effectiveYear.editor.getValue();
                var selected_effective_month = form_fields.effectiveMonth.editor.getValue();
                var expiry_months = [];
                var i = 0;
                if (selected_expiry_year == 9999) {
                    expiry_months.push({val: 11, label: "-"});
                } else {
                    if (selected_effective_year == selected_expiry_year) {
                        if (selected_expiry_year == NR.store.curr_year) {
                            for (i = selected_effective_month; i <= 11; i++) {
                                expiry_months.push({val: (i), label: NR.store.monthArray[i]});
                            }
                        } else {
                            for (i = selected_effective_month; i <= 11; i++) {
                                expiry_months.push({val: (i), label: NR.store.monthArray[i]});
                            }
                        }
                    } else {
                        for (i = 0; i <= 11; i++) {
                            expiry_months.push({val: (i), label: NR.store.monthArray[i]});
                        }
                    }
                }

                form_fields.expiryMonth.editor.setOptions(expiry_months);
            },
            changeEffectiveMonthHandler: function (form_fields) {
                var selected_effective_year = form_fields.effectiveYear.editor.getValue();
                var selected_expiry_year = form_fields.expiryYear.editor.getValue();
                var selected_effective_month = form_fields.effectiveMonth.editor.getValue();
                var effective_months = [];
                var i = 0;
                if (selected_effective_year == selected_expiry_year) {
                    if (selected_effective_year == NR.store.curr_year) {
                        for (i = selected_effective_month; i <= 11; i++) {
                            effective_months.push({val: (i), label: NR.store.monthArray[i]});
                        }
                    } else {
                        for (i = selected_effective_month; i <= 11; i++) {
                            effective_months.push({val: (i), label: NR.store.monthArray[i]});
                        }
                    }

                    form_fields.expiryMonth.editor.setOptions(effective_months);
                }

            },
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