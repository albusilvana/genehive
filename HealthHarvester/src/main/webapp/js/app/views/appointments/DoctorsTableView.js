define([
    'text!templates/appointments/doctorsTableView.html',
    'mainView',
    'doctorsCollection',
    'locationsCollection',
    'specializationsCollection'

], function (template) {
    var LicensorCollection = require('doctorsCollection'),
        LocationsCollection = require('locationsCollection'),
        SpecCollection = require('specializationsCollection'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        initialize: function (options) {
            this.currentLevel = 2;
        },
        events: {
            'click tbody': 'selectRowHandler',
            'change #selectSpec': 'changeLicensorHandler',
            'change #selectLoc': 'changeLicensorHandler'
        },

        onShow: function () {

            var that = this;
            this.licensorTable = $('#licensorsTable');
            this.licensors = new LicensorCollection();
            this.event = this.options.event;


            var specModels = [];
            that.specs = new SpecCollection();
            $.when(that.specs.fetch()).done(function () {
                specModels = that.specs.models;
                $.each(specModels, function(id, spec) {
                    $('#selectSpec')
                        .append($("<option></option>")
                            .attr("value",spec.id)
                            .text(spec.attributes.name));
                });
            });

            var locModels = [];
            that.locs = new LocationsCollection();
            $.when(that.locs.fetch()).done(function () {
                locModels = that.locs.models;
                $.each(locModels, function(id, loc) {
                    $('#selectLoc')
                        .append($("<option></option>")
                            .attr("value",loc.id)
                            .text(loc.attributes.name));
                });
            });
            if( $("#selectLoc").val() == 'Cluj'){
                NR.store.selectedLoc =1;
            }else{
                NR.store.selectedLoc = 2;
            }

            if( $("#selectSpec").val() == 'Cardiologie'){
                NR.store.selectedSpec =1;
            }else{
                NR.store.selectedSpec = 2;
            }

            this.myTable = this.licensorTable.dataTable({
                sPaginationType: "bootstrap",
                iDisplayLength: 10,
                aLengthMenu: [5, 10, 20, 50, 100],
                oLanguage: {
                    sLengthMenu: '_MENU_ records per page'
                },
                bServerSide: true,
                bProcessing: true,
                bDestroy: true,
                sScrollY: "400px",
                bDeferRender: true,
                sDom: "<'row-fluid' r>t<'row-fluid'>",
                sAjaxDataProp: 'entityList',
                aoColumns: [

                    { mDataProp: 'id', bSearchable: false},
                    { mDataProp: 'name', name: 'name', bSearchable: true },
                    { mDataProp: 'specialization', name: 'gender', bSearchable: true },
                    { mDataProp: 'location', name: 'gender', bSearchable: true }
                ],
                fnServerData: function (sUrl, aoData, fnCallback, oSettings) {

//                    var searchableColumns = NR.store.getSearchableColumns(oSettings);

//                    var params = {
//                        data: $.param(
//                            {
//                                items_per_page: oSettings._iDisplayLength,
//                                page_nr: oSettings.oInstance.fnPagingInfo().iPage,
//                                filter_value: oSettings.oPreviousSearch.sSearch,
//                                filter_columns: searchableColumns
//                            }, true)
//                    };
                    that.licensors.reset();

                    $.when(that.licensors.fetch()).done(function () {
                        var obj = {
                            'entityList': that.licensors.toJSON(),
                            totalSize: that.licensors.totalSize,
                            iTotalDisplayRecords: that.licensors.totalSize,
                            iTotalRecords: that.licensors.totalSize
                        };

                        fnCallback(obj);
                    }).fail(function () {

                        var obj = {
                            'entityList': that.licensors.toJSON(),
                            totalSize: that.licensors.length,
                            iTotalDisplayRecords: that.licensors.length,
                            iTotalRecords: that.licensors.length
                        };

                        fnCallback(obj);
                    });
                    NR.store.doctors = that.licensors;
                }
            });

        },
        changeLicensorHandler: function () {
            if( $("#selectLoc").val() == 'Cluj'){
                NR.store.selectedLoc =1;
            }else{
                NR.store.selectedLoc = 2;
            }

            if( $("#selectSpec").val() == 'Cardiologie'){
                NR.store.selectedSpec =1;
            }else{
                NR.store.selectedSpec = 2;
            }
            this.myTable.fnDraw();
        },

        selectRowHandler: function (event) {
            $(this.licensorTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.licensorTable.fnGetData(event.target.parentNode.rowIndex - 1);
            this.event.trigger('licensorSelectedEvent', this.selectedNode);
        }

    })
})
;