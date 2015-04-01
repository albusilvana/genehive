define([
    'mainView',
    'text!templates/bundles/content/publication/pricedPublicationEditTable.html'

], function (MainView, template) {

    return MainView.extend({
        template: Handlebars.compile(template),
        events: {
            'click #editPriceCancelButton': 'cancelHandler',
            'click #editPriceSaveButton': 'saveHandler',
            'focus #editPricedPublicationsTable input': 'selectRowHandler'
        },
        onShow: function () {

            var that = this;
            this.publicationsTable = $('#editPricedPublicationsTable');
            this.event = this.options.bundleEvent;
            this.model = this.options.model;

            if (this.options.publications) {
                that.publications = this.options.publications;
                that.publicationsCache = this.options.publicationsCache;
                that.publications.models = this.options.publicationsModels;
            } else {
                that.publications = NR.bundlesLayout.bundlesHierarchy.currentView.baseHierarchyView.level3.clone();
                that.publicationsCache = NR.bundlesLayout.bundlesHierarchy.currentView.baseHierarchyView.level3.clone();
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
                aoColumns: [
                    { mDataProp: 'id', bVisible: false, bSearchable: false },
                    { mDataProp: 'name', sWidth: '25%'},
                    { mDataProp: 'lincensorPublicationName', sWidth: '23%' },
                    { mDataProp: 'pCode', sWidth: '12%' },
                    { mDataProp: 'actionType', sWidth: '5%' },
                    { mDataProp: 'channelCode', sWidth: '5%' },
                    { mDataProp: 'displayPrice', sWidth: '10%' },
                    { mDataProp: 'channelId', bVisible: true, bSearchable: true, sWidth: '15%'}

                ],

                aoColumnDefs: [
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div align=center class='editAction'><input class='editPriceInput' " +
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
                            })
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
                            if (model.get('newPrice')) {
                                editInputs[idx].value = model.get('newPrice');
                            } else {
                                editInputs[idx].value = '';
                            }
                        });
                    });
                }
            });
            $('#loadingImage').hide();
        },
        blockHandler: function () {
            $('#editPriceSaveButton').removeClass("btn-primary");
            $('#editPriceSaveButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#editPriceSaveButton').removeClass("disabled");
            $('#editPriceSaveButton').addClass("btn-primary");
            $('#loadingImage').hide();
        },
        updatePrice: function (value) {
            var regex = /^[0-9]*[.]\d{2}$/;
            var onlySpacesRegex = /\S/;
            value = "" + value;
            if (value.length > 0 && value.match(onlySpacesRegex)) {
                if (value.match(regex) && value.length <= 11) {
                    this.selectedModel.set("newPrice", value);
                    this.decorateRow(this.selectedNodeForDecoration, true);
                } else {
                    this.selectedModel.set("newPrice", "incorrect");
                    this.decorateRow(this.selectedNodeForDecoration, false);
                }
            }
        },
        cancelHandler: function () {
            NR.bundlesLayout.bundleDetail.close()
        },
        selectRowHandler: function (event) {
            $(this.publicationsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            var parentNode = $(event.target).closest('tr')[0];
            $(parentNode).addClass('row_selected');
            var rowIndex = parentNode.rowIndex;
            this.selectedNodeForDecoration = this.selectedNode = event.target.parentNode;
            this.selectedNode = this.publicationsTable.fnGetData(rowIndex - 1);
            this.selectedModel = this.publicationsCache.get(this.selectedNode.id);
        },
        saveHandler: function () {
            this.blockHandler();
            this.event.trigger('saveUpdatedBundleSubagreement', this.model, this.publications, NR.store.currentNode, this.publicationsCache, this);
        },
        decorateRow: function (row, success) {
            $(row).children().each(function (index, td) {
                if (success) {
                    $(td).css("color", "green");
                } else {
                    $(td).css("color", "red");
                }

            });

        }

    })
});

