define([
    'text!templates/licensors/content/licensor/licensorsTable.html',
    'mainView',
    'licensorLicensors'

], function (template) {
    var LicensorCollection = require('licensorLicensors'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        initialize: function (options) {
            this.currentLevel = 1;
        },
        events: {
            'click tbody': 'selectRowHandler'
        },

        onShow: function () {

            var that = this;
            this.licensorTable = $('#licensorsTable');
            this.licensors = new LicensorCollection();
            this.event = this.options.event;

            this.licensorTable.dataTable({
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
                    { mDataProp: 'gender', name: 'gender', bSearchable: true },
                    { mDataProp: 'email', name: 'email', bSearchable: true }

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
                    NR.store.patients = that.licensors;
                }
            });
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