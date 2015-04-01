define([
    'text!templates/licensors/content/subagreement/contentSubagreementsTable.html',
    'mainView',
    'licensorSubAgreements'

], function (template) {
    var MainView = require('mainView'),
        SubagreementCol = require('licensorSubAgreements');


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
            this.subagreementsTable = $('#temporalSubagreementsTable');
            this.event = this.options.event;
            this.modalWindow = $('#modalWindow');

            that.subagreements = new SubagreementCol({url: NR.rootUrl + 'licensorSubagreements/licensor/' + encodeURIComponent(NR.store.licensorId)});

            this.subagreementsTable.dataTable({
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
                    { mDataProp: 'id', bVisible: true, bSearchable: false },
                    { mDataProp: 'name', sWidth: '40%', bSearchable: true},
                    { mDataProp: 'subagreementKey', sWidth: '40%', bSearchable: true}
                ],
                fnServerData: function (sUrl, aoData, fnCallback, oSettings) {

                    var searchableColumns = NR.store.getSearchableColumns(oSettings);

                    var params = {
                        data: $.param(
                            {
                                items_per_page: oSettings._iDisplayLength,
                                page_nr: oSettings.oInstance.fnPagingInfo().iPage,
                                filter_value: oSettings.oPreviousSearch.sSearch,
                                filter_columns: searchableColumns
                            }, true)
                    };
                    that.subagreements.reset();
                    $.when(that.subagreements.fetch(params)).done(function () {
                        var obj = {
                            'entityList': that.subagreements.toJSON(),
                            totalSize: that.subagreements.totalSize,
                            iTotalDisplayRecords: that.subagreements.totalSize,
                            iTotalRecords: that.subagreements.totalSize
                        };

                        fnCallback(obj);
                    }).fail(function () {

                            var obj = {
                                'entityList': that.subagreements.toJSON(),
                                totalSize: that.subagreements.length,
                                iTotalDisplayRecords: that.subagreements.length,
                                iTotalRecords: that.subagreements.length
                            };

                            fnCallback(obj);
                        });
                }
            });
        },
        selectRowHandler: function (event) {
            $(this.subagreementsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.subagreementsTable.fnGetData(event.target.parentNode.rowIndex - 1);
            this.event.trigger('subagreementSelectedEvent', this.selectedNode);
        }


    })
});
