define([
    'text!templates/bundles/content/subagreement/subagreementContentTable.html',
    'mainView',
    'bundleSubAgreements'

], function (template) {
    var BundleSubagreementCollection = require('bundleSubAgreements'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        initialize: function (options) {
            this.currentLevel = 2;
        },
        events: {
            'click tbody': 'selectRowHandler'
        },

        onShow: function () {

            var that = this;
            this.subagreementTable = $('#subagreementTable');
            this.bundleSubagreements = new BundleSubagreementCollection();
            this.event = this.options.event;

            this.subagreementTable.dataTable({
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
                    { mDataProp: 'id', sWidth: '5%', bSearchable: false},
                    { mDataProp: 'name', name: 'name', sWidth: '25%', bSearchable: true },
                    { mDataProp: 'subagreementKey', name: 'subagreementKey', sWidth: '25%', bSearchable: false },
                    { mDataProp: 'effectiveDate', name: 'effectiveDate', sWidth: '22%', bSearchable: false },
                    { mDataProp: 'expiryDate', name: 'expiryDate', sWidth: '24%', bSearchable: false}
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
                                status: NR.globalStatus,
                                filter_value: oSettings.oPreviousSearch.sSearch,
                                filter_columns: searchableColumns
                            }, true)
                    };
                    that.bundleSubagreements.reset();
                    $.when(that.bundleSubagreements.fetch(params)).done(function () {
                        var obj = {
                            'entityList': that.bundleSubagreements.toJSON(),
                            totalSize: that.bundleSubagreements.totalSize,
                            iTotalDisplayRecords: that.bundleSubagreements.totalSize,
                            iTotalRecords: that.bundleSubagreements.totalSize
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
            $(this.subagreementTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.subagreementTable.fnGetData(event.target.parentNode.rowIndex - 1);
            this.event.trigger('subagreementSelectedEvent', this.selectedNode);
        }

    })
})
;