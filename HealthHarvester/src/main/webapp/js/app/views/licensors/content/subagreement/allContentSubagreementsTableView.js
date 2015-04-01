define([
    'text!templates/bundles/content/subagreement/simpleSubagreementTable.html',
    'mainView',
    'allSubagreements',
    'addBundleSubagreementView'

], function (template) {
    var MainView = require('mainView'),
        SubagreementCol = require('allSubagreements');

    return MainView.extend({

        template: Handlebars.compile(template),

        events: {
            'click #goToSecondPanel': 'goToSecondPanel',
            'click #cancelButton': 'cancelButtonHandler',
            'click #chooseSubAgreementNextButton': 'nextHandler',
            'click tbody': 'selectRowHandler'
        },
        onShow: function () {

            var that = this;
            this.subagreementsTable = $('#subagreementTable');
            this.event = this.options.event;
            this.modalWindow = $('#modalWindow');
            that.subagreements = new SubagreementCol();

            that.subagreementsTable.dataTable({

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
                    { mDataProp: 'id', sWidth: '10%', bSearchable: true},
                    { mDataProp: 'name', sWidth: '50%', bSearchable: true},
                    { mDataProp: 'subagreementKey', sWidth: '40%', bSearchable: true}
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
            $(this.subagreementsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            $(event.target.parentNode).addClass('row_selected');
            this.selectedNode = this.subagreementsTable.fnGetData(event.target.parentNode.rowIndex - 1);
//            this.event.trigger('selectSubagreementRow', this.subagreements.get(this.selectedNode.id));
        },
        cancelButtonHandler: function () {

            this.event.trigger('cancelHandlerEvent', this.model);
        },
        nextHandler: function () {
            this.event.trigger('createBundleSubagreementDetailsEvent', this.subagreements.get(this.selectedNode.id));
        },
        fnGetSelected: function () {
            var aTrs = this.subagreementsTable.fnGetNodes();

            for (var i = 0; i < aTrs.length; i++) {
                if ($(aTrs[i]).hasClass('row_selected')) {
                    return aTrs[i];
                }
            }
            return null;
        }

    })
});
