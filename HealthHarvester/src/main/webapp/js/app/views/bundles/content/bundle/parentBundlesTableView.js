define([
    'text!templates/bundles/content/bundle/parentBundleTable.html',
    'mainView',
    'bundleBundles'


], function (template) {
    var MainView = require('mainView'),
        BundlesCollection = require('bundleBundles');

    return MainView.extend({

        template: Handlebars.compile(template),
        events: {
            'click tbody': 'selectRowHandler',
            'click #cancelButton': 'cancelButtonHandler',
            'click #chooseBundleNextButton': 'nextHandler'
        },
        onShow: function () {

            var that = this;
            this.bundlesTable = $('#bundlesTable');
            this.event = this.options.bundleEvent;
            this.bundle = this.options.bundle;
            this.bundles = new BundlesCollection();
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
            $('#loadingImage').hide();

        },
        blockHandler: function () {
            $('#saveButton').removeClass("btn-primary");
            $('#saveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#saveButton').removeClass("disabled");
            $('#saveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },
        selectRowHandler: function (event) {
            $(this.bundlesTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.bundlesTable.fnGetData(event.target.parentNode.rowIndex - 1);
        },
        cancelButtonHandler: function () {

            this.event.trigger("showPricedBundlesTableEvent", this.event)
        },
        nextHandler: function () {
            if (this.selectedNode) {
                if (!this.bundle) {
                    this.bundle = this.bundles.get(this.selectedNode.id);
                }
                this.event.trigger('goToAddPricedBundleStepTwoEvent', this.bundle);
            } else {
                this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Select a parent bundle.');
            }
        },
        fnGetSelected: function () {
            var aTrs = this.bundlesTable.fnGetNodes();

            for (var i = 0; i < aTrs.length; i++) {
                if ($(aTrs[i]).hasClass('row_selected')) {
                    this.selectedNode = aTrs[i];
                    return this.selectedNode;
                }
            }
            return null;
        }

    })
});
