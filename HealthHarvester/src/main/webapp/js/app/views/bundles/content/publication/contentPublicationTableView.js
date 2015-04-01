define([
    'text!templates/bundles/content/publication/publicationContentTable.html',
    'mainView',
    'bundlePublications'

], function (template) {
    var PublicationsCollection = require('bundlePublications'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        initialize: function (options) {
            this.currentLevel = 3;
        },
        events: {
            'click tbody': 'selectRowHandler'
        },

        onShow: function () {

            var that = this;
            this.publicationsTable = $('#publicationTable');
            this.publications = new PublicationsCollection();
            this.event = this.options.event;

            this.publicationsTable.dataTable({
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
                    { mDataProp: 'publicationName', name: 'publicationName', sWidth: '30%', bSearchable: true },
                    { mDataProp: 'lincensorPublicationName', name: 'lincensorPublicationName', sWidth: '50%', bSearchable: true },
                    { mDataProp: 'licensorSourceId', name: 'licensorSourceId', sWidth: '15%', bSearchable: true }
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
                    that.publications.reset();
                    $.when(that.publications.fetch(params)).done(function () {
                        var obj = {
                            'entityList': that.publications.toJSON(),
                            totalSize: that.publications.totalSize,
                            iTotalDisplayRecords: that.publications.totalSize,
                            iTotalRecords: that.publications.totalSize
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
            $(this.publicationsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.publicationsTable.fnGetData(event.target.parentNode.rowIndex - 1);
            this.event.trigger('publicationSelectedEvent', this.selectedNode);
        }

    })
})
;
