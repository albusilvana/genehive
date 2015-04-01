define([
    'text!templates/bundles/content/publication/publicationEditableTable.html',
    'mainView',
    'licensorPublications'
], function (template) {
    var MainView = require('mainView'),
        PublicationCollection = require('licensorPublications');
    return MainView.extend({
        template: Handlebars.compile(template),
        events: {
            'click #goToThirdPanel': 'goToThirdPanel',
            'click #goBackToFirstPanel': 'goBackToFirstPanel',
            'focus #publicatioEditableTable input': 'selectRowHandler'
        },

        onShow: function () {

            var that = this;
            this.publicationsTable = $('#publicatioEditableTable');
            this.event = this.options.bundleEvent;
            var subagreementId = this.options.selectedSubagreementId;
            if (this.options.publications) {
                that.publications = this.options.publications;
                that.publicationsCache = this.options.publicationsCache;
                that.publications.models = this.options.publicationsModels;
            } else {
                that.publications = new PublicationCollection([], {url: NR.rootUrl + 'publications/licensorSubagreements/' + encodeURIComponent(subagreementId)});
                that.publicationsCache = new PublicationCollection([], {url: NR.rootUrl + 'publications/licensorSubagreements/' + encodeURIComponent(subagreementId)});
            }

            that.publicationsTable.dataTable({
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
                sAjaxSource: NR.rootUrl + 'publications/licensorSubagreements/',
                aoColumns: [
                    { mDataProp: 'id', bVisible: false, bSearchable: false },
                    { mDataProp: 'name', sWidth: '25%'},
                    { mDataProp: 'lincensorPublicationName', sWidth: '25%' },
                    { mDataProp: 'displayCost', sWidth: '10%' },
                    { mDataProp: 'actionType', sWidth: '10%' },
                    { mDataProp: 'channelCode', sWidth: '10%' },
                    { mDataProp: 'pCode', sWidth: '10%' },
                    { mDataProp: 'channelId', bVisible: true, bSearchable: true, sWidth: '15%'},

                ],

                aoColumnDefs: [
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div class='editAction'><input class='editPriceInput' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;' " +
                                "'><img style='height: 23px;margin-top: -10px;display: inline' src='/img/pencil.png'></div>";
                        },
                        'aTargets': [7]
                    }
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
                    that.publications.reset();
                    $.when(that.publications.fetch(params)).done(function () {
                        that.publicationsCache.set(that.publications.models, {add: true, remove: false, merge: false});
                        that.publications.set(that.publicationsCache.models, {add: false, remove: false, merge: true});
                        var obj = {
                            'entityList': that.publications.toJSON(),
                            totalSize: that.publications.totalSize,
                            iTotalDisplayRecords: that.publications.totalSize,
                            iTotalRecords: that.publications.totalSize
                        };

                        fnCallback(obj);
                        var editInputs = $('.editPriceInput');
                        $(editInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice(e.target.value);
                        }, this));
                        _.each(that.publications.models, function (model, idx) {
                            if (model.get('price')) {
                                editInputs[idx].value = model.get('price');
                            } else {
                                editInputs[idx].value = '';
                            }
                        });
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

        goToThirdPanel: function () {
            var allPublicationsUpdated = true;
            _.each(this.publications.models, function (publication) {
                if (!publication.get('price')) {
                    allPublicationsUpdated = false;
                }
            });

            this.event.trigger('goToThirdPanel', allPublicationsUpdated, this.publications, this.publicationsCache, this.publicationsCache.models);

        },
        goBackToFirstPanel: function () {
            this.event.trigger('goBackToFirstPanel');
        },
        updatePrice: function (value) {
            var regex = /^[0-9]*[.]\d{2}$/;
            value = "" + value;
            if (value.match(regex) && value.length <= 11) {
                this.selectedModel.set("price", value);
                this.event.trigger('displayEditSuccessMessage');
            } else {
                this.event.trigger('displayEditErrorMessage');
            }
        },
        selectRowHandler: function (event) {
            $(this.publicationsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            var parentNode = $(event.target).closest('tr')[0];
            $(parentNode).addClass('row_selected');
            var rowIndex = parentNode.rowIndex;
            this.selectedNode = this.publicationsTable.fnGetData(rowIndex - 1);
            this.selectedModel = this.publicationsCache.get(this.selectedNode.id);
        }
    });

})
;

