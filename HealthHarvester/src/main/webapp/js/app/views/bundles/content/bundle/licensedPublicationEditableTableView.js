define([
    'text!templates/bundles/pricing/publication/pricedLicensedPublicationEditableTable.html',
    'mainView',
    'licensedPublications'

], function (template) {
    var LicensedPublicationCollection = require('licensedPublications'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        events: {
            'click tbody': 'selectRowHandler',
            'click #previousButton': 'previousHandler',
            'click #saveButton': 'saveHandler',
            'click #cancelButton': 'cancelHandler'
        },

        onShow: function () {

            var that = this;
            this.licensedPublicationsTable = $('#licensedPublicationsTable');
            this.event = this.options.bundleEvent;
            this.model = this.options.model;

            if (!NR.store.plpForSubagreements[NR.store.selectedSubagreementId]) {
                that.licensedPublications = new LicensedPublicationCollection();
                that.licensedPublicationsCache = new LicensedPublicationCollection();
            } else {
                that.licensedPublications = NR.store.plpForSubagreements[NR.store.selectedSubagreementId];
                that.licensedPublicationsCache = NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId];
                that.licensedPublications.models = NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId].models;
            }


            this.licensedPublicationsTable.dataTable({
                sDom: "<'row-fluid'<'span4 leftAlignClass' l><'span8 searchCss'f>r>t<'row-fluid'<'span4 left leftAlignClass'i><'span11 rightMargin'p>>",
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
                sScrollY: "400px",
                sAjaxDataProp: 'entityList',
                aoColumns: [
                    { mDataProp: 'id', sWidth: '5%', bSearchable: false},
                    { mDataProp: 'lincensorPublicationName', name: 'lincensorPublicationName', sWidth: '10%', bSearchable: true },
                    { mDataProp: 'licensorSourceId', name: 'licensorSourceId', sWidth: '10%', bSearchable: false }
                ],
                aoColumnDefs: [
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeUSD' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [3],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeEUR' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [4],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeGBP' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [5],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini distributionFeeUSD' " +
                                "type='text' style='display: inline;margin:0 auto;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [6],
                        'mData': null
                    } ,
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini distributionFeeEUR' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [7],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini distributionFeeGBP' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;'>";
                        },
                        'aTargets': [8],
                        'mData': null
                    }
                ],
                fnServerData: function (sUrl, aoData, fnCallback, oSettings) {

                    var searchableColumns = NR.store.getSearchableColumns(oSettings);

                    var params = {
                        data: $.param(
                            {
                                items_per_page: oSettings._iDisplayLength,
                                page_nr: oSettings.oInstance.fnPagingInfo().iPage,
                                effectiveMonth: NR.store.effectiveMonth,
                                effectiveYear: NR.store.effectiveYear,
                                expiryMonth: NR.store.expiryMonth,
                                expiryYear: NR.store.expiryYear,
                                filter_value: oSettings.oPreviousSearch.sSearch,
                                filter_columns: searchableColumns
                            }, true)
                    };
                    that.licensedPublications.reset();
                    $.when(that.licensedPublications.fetch(params)).done(function () {
                        that.licensedPublicationsCache.set(that.licensedPublications.models, {add: true, remove: false, merge: false});
                        that.licensedPublications.set(that.licensedPublicationsCache.models, {add: false, remove: false, merge: true});
                        var obj = {
                            'entityList': that.licensedPublications.toJSON(),
                            totalSize: that.licensedPublications.totalSize,
                            iTotalDisplayRecords: that.licensedPublications.totalSize,
                            iTotalRecords: that.licensedPublications.totalSize
                        };
                        fnCallback(obj);

                        var accessFeeUSDInputs = $('.accessFeeUSD');
                        $(accessFeeUSDInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('accessFeeUSD', e.target.value);
                        }, this));
                        var accessFeeEURInputs = $('.accessFeeEUR');
                        $(accessFeeEURInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('accessFeeEUR', e.target.value);
                        }, this));
                        var accessFeeGBPInputs = $('.accessFeeGBP');
                        $(accessFeeGBPInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('accessFeeGBP', e.target.value);
                        }, this));

                        var distributionFeeUSDInputs = $('.distributionFeeUSD');
                        $(distributionFeeUSDInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('distributionFeeUSD', e.target.value);
                        }, this));
                        var distributionFeeEURInputs = $('.distributionFeeEUR');
                        $(distributionFeeEURInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('distributionFeeEUR', e.target.value);
                        }, this));
                        var distributionFeeGBPInputs = $('.distributionFeeGBP');
                        $(distributionFeeGBPInputs).on('blur', $.proxy(function (e) {
                            that.updatePrice('distributionFeeGBP', e.target.value);
                        }, this));
                        _.each(that.licensedPublications.models, function (model, idx) {
                            var accessFeeUSDValue = model.get('accessFeeUSD');
                            var accessFeeEURValue = model.get('accessFeeEUR');
                            var accessFeeGBPValue = model.get('accessFeeGBP');
                            var distributionFeeUSDValue = model.get('distributionFeeUSD');
                            var distributionFeeEURValue = model.get('distributionFeeEUR');
                            var distributionFeeGBPValue = model.get('distributionFeeGBP');

                            if (accessFeeUSDValue) {
                                accessFeeUSDInputs[idx].value = accessFeeUSDValue;
                            } else {
                                accessFeeUSDInputs[idx].value = '';
                            }
                            if (accessFeeEURValue) {
                                accessFeeEURInputs[idx].value = accessFeeEURValue;
                            } else {
                                accessFeeEURInputs[idx].value = '';
                            }
                            if (accessFeeGBPValue) {
                                accessFeeGBPInputs[idx].value = accessFeeGBPValue;
                            } else {
                                accessFeeGBPInputs[idx].value = '';
                            }
                            if (distributionFeeUSDValue) {
                                distributionFeeUSDInputs[idx].value = distributionFeeUSDValue;
                            } else {
                                distributionFeeUSDInputs[idx].value = '';
                            }
                            if (distributionFeeEURValue) {
                                distributionFeeEURInputs[idx].value = distributionFeeEURValue;
                            } else {
                                distributionFeeEURInputs[idx].value = '';
                            }
                            if (distributionFeeGBPValue) {
                                distributionFeeGBPInputs[idx].value = distributionFeeGBPValue;
                            } else {
                                distributionFeeGBPInputs[idx].value = '';
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
            $('#loadingImage').hide();
        },
        blockHandler: function () {
            $('#saveButton').removeClass("btn-primary");
            $('#saveButton').addClass("disabled");
            $('#cancelButton').removeClass("btn-primary");
            $('#cancelButton').addClass("disabled");
            $('#previousButton').removeClass("btn-primary");
            $('#previousButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#saveButton').removeClass("disabled");
            $('#saveButton').addClass("btn-primary");
            $('#cancelButton').removeClass("disabled");
            $('#cancelButton').addClass("btn-primary");
            $('#previousButton').removeClass("disabled");
            $('#previousButton').addClass("btn-primary");

            $('#loadingImage').hide();
        },
        updatePrice: function (accessFeeType, value) {
            var regex = /^[0-9]*[.]\d{2}$/;
            value = "" + value;
            switch (accessFeeType) {
                case 'accessFeeUSD':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("accessFeeUSD", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Action Fee USD is not in the correct format (digit with 2 decimals).');
                    }
                    break;
                case 'accessFeeEUR':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("accessFeeEUR", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Action Fee EUR is not in the correct format (digit with 2 decimals).');
                    }
                    break;
                case 'accessFeeGBP':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("accessFeeGBP", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Action Fee GBP is not in the correct format (digit with 2 decimals).');
                    }
                    break;
                case 'distributionFeeUSD':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("distributionFeeUSD", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Distribution Fee USD is not in the correct format (digit with 2 decimals).');
                    }
                    break;
                case 'distributionFeeEUR':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("distributionFeeEUR", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Distribution Fee EUR is not in the correct format (digit with 2 decimals).');
                    }
                    break;
                case 'distributionFeeGBP':
                    if (value.match(regex) && value.length <= 11) {
                        this.selectedModel.set("distributionFeeGBP", value);
                        this.event.trigger('displayEditSuccessMessage');
                    } else {
                        this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Distribution Fee GBP is not in the correct format (digit with 2 decimals).');
                    }
                    break;
            }
        },
        selectRowHandler: function (event) {
            $(this.licensedPublicationsTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            var parentNode = $(event.target).closest('tr')[0];
            $(parentNode).addClass('row_selected');
            var rowIndex = parentNode.rowIndex;
            this.selectedNode = this.licensedPublicationsTable.fnGetData(rowIndex - 1);
            this.selectedModel = this.licensedPublicationsCache.get(this.selectedNode.id);
        },
        previousHandler: function () {
            NR.store.plpForSubagreements[NR.store.selectedSubagreementId] = this.licensedPublications;
            NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId] = this.licensedPublicationsCache;
            NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId].models = this.licensedPublicationsCache.models;
            this.event.trigger('goBackToAddPricedBundleStepThreeEvent', this.bundle, this.model);
        },
        saveHandler: function () {
            NR.store.plpForSubagreements[NR.store.selectedSubagreementId] = this.licensedPublications;
            NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId] = this.licensedPublicationsCache;
            NR.store.plpForSubagreementsCache[NR.store.selectedSubagreementId].models = this.licensedPublicationsCache.models;
            this.event.trigger('savePricedBundleEvent', null, null, this);
        },
        cancelHandler: function () {
            this.event.trigger("showPricedBundlesTableEvent", this.event)
        },
        _getChangedLicensedPublications: function () {
            var changedLicensedPublications = [];
            var i = 0;
            _.each(this.licensedPublications.models, function (licensedPublication) {
                if (licensedPublication.get('accessFeeUSD') || licensedPublication.get('accessFeeEUR') || licensedPublication.get('accessFeeGBP')) {
                    changedLicensedPublications[i++] = licensedPublication;
                }
            });
            return changedLicensedPublications;
        }

    })
})
;