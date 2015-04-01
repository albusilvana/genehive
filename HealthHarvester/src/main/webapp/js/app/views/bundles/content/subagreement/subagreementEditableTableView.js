define([
    'text!templates/bundles/content/subagreement/subagreementEditableTable.html',
    'mainView',
    'pricedBundleSubagreements'

], function (template) {
    var PricedBundleSubagreementCollection = require('pricedBundleSubagreements'),
        MainView = require('mainView');

    return MainView.extend({
        template: Handlebars.compile(template),
        initialize: function (options) {
            this.currentLevel = 2;
        },
        events: {
            'click tbody': 'selectRowHandler',
            'click #previousButton': 'previousHandler',
            'click #saveButton': 'saveHandler',
            'click #cancelButton': 'cancelHandler',
            'click #nextButton': 'nextHandler'
        },

        onShow: function () {

            var that = this;
            this.subagreementTable = $('#subagreementEditableTable');
            this.event = this.options.bundleEvent;
            this.model = this.options.model;
            this.bundle = this.options.bundle;
            if (this.options.subagreements) {
                that.subagreements = this.options.subagreements;
                that.subagreementsCache = this.options.subagreementsCache;
                that.subagreements.models = this.options.subagreementsModels;
            } else {
                that.subagreements = new PricedBundleSubagreementCollection();
                that.subagreementsCache = new PricedBundleSubagreementCollection();
            }
            this.subagreementTable.dataTable({
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
                sAjaxDataProp: 'entityList',
                aoColumns: [
                    { mDataProp: 'id', sWidth: '5%', bSearchable: false},
                    { mDataProp: 'name', name: 'name', sWidth: '22%', bSearchable: true },
                    { mDataProp: 'subagreementKey', name: 'subagreementKey', sWidth: '22%', bSearchable: false }
                ],
                aoColumnDefs: [
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeUSD' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;' " +
                                "'><img style='height: 23px;margin-top: -10px;display: inline' src='/img/pencil.png'></div>";
                        },
                        'aTargets': [3],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeEUR' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;' " +
                                "'><img style='height: 23px;margin-top: -10px;display: inline' src='/img/pencil.png'></div>";
                        },
                        'aTargets': [4],
                        'mData': null
                    },
                    {
                        'fnRender': function (oObj) {
                            var obj = oObj.aData.id;
                            return "<div><input class='input-mini accessFeeGBP' " +
                                "type='text' style='display: inline;height: 12px;width: 30px;' " +
                                "'><img style='height: 23px;margin-top: -10px;display: inline' src='/img/pencil.png'></div>";
                        },
                        'aTargets': [5],
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
                    that.subagreements.reset();
                    $.when(that.subagreements.fetch(params)).done(function () {
                        that.subagreementsCache.set(that.subagreements.models, {add: true, remove: false, merge: false});
                        that.subagreements.set(that.subagreementsCache.models, {add: false, remove: false, merge: true});
                        var obj = {
                            'entityList': that.subagreements.toJSON(),
                            totalSize: that.subagreements.totalSize,
                            iTotalDisplayRecords: that.subagreements.totalSize,
                            iTotalRecords: that.subagreements.totalSize
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
                        _.each(that.subagreements.models, function (model, idx) {
                            var accessFeeUSDValue = model.get('accessFeeUSD');
                            var accessFeeEURValue = model.get('accessFeeEUR');
                            var accessFeeGBPValue = model.get('accessFeeGBP');
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
            $('#nextButton').removeClass("btn-primary");
            $('#nextButton').addClass("disabled");
            $('#loadingImage').show();
        },
        unblockHandler: function () {
            $('#saveButton').removeClass("disabled");
            $('#saveButton').addClass("btn-primary");
            $('#cancelButton').removeClass("disabled");
            $('#cancelButton').addClass("btn-primary");
            $('#previousButton').removeClass("disabled");
            $('#previousButton').addClass("btn-primary");
            $('#nextButton').removeClass("disabled");
            $('#nextButton').addClass("btn-primary");
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
            }
        },
        selectRowHandler: function (event) {
            $(this.subagreementTable.fnSettings().aoData).each(function () {
                $(this.nTr).removeClass('row_selected');
            });
            var parentNode = $(event.target).closest('tr')[0];
            $(parentNode).addClass('row_selected');
            var rowIndex = parentNode.rowIndex;
            this.selectedNode = this.subagreementTable.fnGetData(rowIndex - 1);
            this.selectedModel = this.subagreementsCache.get(this.selectedNode.id);
        },
        previousHandler: function () {
            var allSubagreementsUpdated = this._validateRows();
            this.event.trigger('goBackToAddPricedBundleStepTwoEvent', this.bundle, this.model, allSubagreementsUpdated, this.subagreements, this.subagreementsCache, this.subagreementsCache.models);
        },
        saveHandler: function () {
            var allSubagreementsUpdated = this._validateRows();
            if (allSubagreementsUpdated) {
                this.event.trigger('savePricedBundleEvent', this.subagreements, this.model, this);
            } else {
                this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Please fill in all the action fees.');
            }
        },
        nextHandler: function () {
            var allSubagreementsUpdated = this._validateRows();

            if (allSubagreementsUpdated) {
                if (this.selectedModel) {
                    NR.store.selectedSubagreementId = this.selectedModel.get("id");
                    this.event.trigger("goToAddPricedBundleStepFourEvent", this.bundle, this.model, allSubagreementsUpdated, this.subagreements, this.subagreementsCache, this.subagreementsCache.models);
                } else {
                    this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Please select a subagreement.');

                }
            } else {
                this.event.trigger('nextStepAddPricedBundleNotAllowed', 'Please fill in all the action fees.');
            }
        },
        cancelHandler: function () {
            this.event.trigger("showPricedBundlesTableEvent", this.event)
        },
        _validateRows: function () {
            var allSubagreementsUpdated = true;
            _.each(this.subagreements.models, function (subagreement) {
                if (!subagreement.get('accessFeeUSD') || !subagreement.get('accessFeeEUR') || !subagreement.get('accessFeeGBP')) {
                    allSubagreementsUpdated = false;
                }
            });
            return allSubagreementsUpdated;
        }
    })
})
;