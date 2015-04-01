define([
    'text!templates/bundles/content/bundle/bundlesTable.html',
    'mainView',
    'bundleBundles'

], function (template) {
    var BundlesCollection = require('bundleBundles'),
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
            this.bundlesTable = $('#bundlesTable');
            this.bundles = new BundlesCollection();
            this.event = this.options.event;

            this.bundlesTable.dataTable({
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
                sDom: "<'row-fluid'<'span4 leftAlignClass' l><'span8 searchCss'f>r>t<'row-fluid'<'span4 left leftAlignClass'i><'span11 rightMargin'p>>",
                sAjaxDataProp: 'entityList',
                aoColumns: [
                    { mDataProp: 'id', sWidth: '10%', bSearchable: false},
                    { mDataProp: 'name', name: 'name', sWidth: '90%', bSearchable: true }
                ],
                fnServerData: function (sUrl, aoData, fnCallback, oSettings) {

                    var searchableColumns = NR.store.getSearchableColumns(oSettings);

                    var params = {
                        data: $.param(
                            {
                                items_per_page: oSettings._iDisplayLength,
                                page_nr: oSettings.oInstance.fnPagingInfo().iPage,
                                month: NR.globalMonth,
                                year: NR.globalYear,
                                filter_value: oSettings.oPreviousSearch.sSearch,
                                filter_columns: searchableColumns
                            }, true)
                    };
                    that.bundles.reset();
                    $.when(that.bundles.fetch(params)).done(function () {
                        var obj = {
                            'entityList': that.bundles.toJSON(),
                            totalSize: that.bundles.totalSize,
                            iTotalDisplayRecords: that.bundles.totalSize,
                            iTotalRecords: that.bundles.totalSize
                        };

                        fnCallback(obj);
                    }).fail(function () {

                        var obj = {
                            'entityList': [],
                            totalSize: 0,
                            iTotalDisplayRecords: 0,
                            iTotalRecords: 0
                        };

                            fnCallback(obj);
                        });
                }
            });
        },

        selectRowHandler: function (event) {
            $(this.bundlesTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.bundlesTable.fnGetData(event.target.parentNode.rowIndex - 1);
            this.event.trigger('bundleSelectedEvent', this.selectedNode);
        }

    })
})
;