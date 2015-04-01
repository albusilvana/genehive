define([
    'text!templates/customers/bundle/bundlesTable.html',
    'mainView',
    'customerBundles'


], function (template) {
    var MainView = require('mainView'),
        BundlesCol = require('customerBundles')

    return MainView.extend({

        template: Handlebars.compile(template),
        events: {
            'click .deleteAction img': 'deleteHandler',
            'click #cancelButton': 'cancelButtonHandler',
            'click #saveButton': 'saveButtonHandler',
            'click tbody': 'selectRowHandler'
        },
        onShow: function () {

            var that = this;
            this.bundlesTable = $('#bundlesTable');
            this.event = this.options.customerEvent;
            that.bundles = new BundlesCol({url: NR.rootUrl + 'bundles/availableBundles/' + encodeURIComponent(NR.store.currentNode.id)});

            that.bundlesTable.dataTable({

                sDom: "<'row-fluid'<'span6'l>r>t<'row-fluid'<'span12'i><'span12 center'p>>",
                sPaginationType: 'bootstrap',
                iDisplayLength: 10,
                aLengthMenu: [1, 5, 10, 20],
                oLanguage: {
                    sLengthMenu: '_MENU_ records per page'
                },
                bServerSide: true,
                bProcessing: true,
                bDestroy: true,
                bDeferRender: true,
                aoColumns: [
                    { mDataProp: 'name', sWidth: '40%', bSearchable: true},
                    { mDataProp: 'subscriptionFee', sWidth: '40%', bSearchable: true}
                ],
                sAjaxDataProp: 'entityList',
                fnServerData: function (sUrl, aoData, fnCallback, oSettings) {

                    var params = {
                        data: $.param(
                            {
                                'items_per_page': oSettings._iDisplayLength,
                                'page_nr': oSettings.oInstance.fnPagingInfo().iPage
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
        saveButtonHandler: function () {
            if (this.selectedNode) {
                this.event.trigger('addBundleToAgreement', this.selectedNode.id, this);
            } else {
                this.event.trigger('addBundleToAgreementNotAllowed');
            }
        },
        selectRowHandler: function (event) {
            $(this.bundlesTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.bundlesTable.fnGetData(event.target.parentNode.rowIndex - 1);
        },
        cancelButtonHandler: function () {

            this.event.trigger('cancelHandlerEvent', this.model);
        },
        fnGetSelected: function () {
            var aTrs = this.bundlesTable.fnGetNodes();

            for (var i = 0; i < aTrs.length; i++) {
                if ($(aTrs[i]).hasClass('row_selected')) {
                    return aTrs[i];
                }
            }
            return null;
        }

    })
});
