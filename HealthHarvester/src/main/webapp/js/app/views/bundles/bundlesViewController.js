define([
    'text!templates/bundles/bundles.html',
    'i18n!nls/messages',
    'mainView',
    'messagesView',
    'contentBundlesViewController'

], function (template, messages) {
    var MainView = require('mainView'),
        MessagesView = require('messagesView'),
        ContentBundlesViewController = require('contentBundlesViewController')
    var that = this;
    that.BundlesLayout = Marionette.Layout.extend({

        regions: {
            content: '#content'
        }
    });

    return MainView.extend({

        template: template,

        initialize: function() {
            this.show_content_bundle = this.options.show_content_bundle ? true : false;
        },

        events: {
            'click #contentBundlesTab': 'showContent',
            'click #pricedBundlesTab': 'showPricing'
        },

        onShow: function () {
            NR.bundlesLayout = new that.BundlesLayout({el: '#bundlesMainPanel'});
            if (this.show_content_bundle) {
                this.showContent();
            } else {
                this.showPricing();
            }
        },
        showContent: function () {
            NR.bundlesLayout.content.close();
            $('#pricedBundlesTab').removeClass("active");
            $('#contentBundlesTab').addClass('active');
            NR.bundlesLayout.content.show(new ContentBundlesViewController());
        },
        showPricing: function () {
//            NR.bundlesLayout.content.close();
//            $('#contentBundlesTab').removeClass("active");
//            $('#pricedBundlesTab').addClass('active');
//            NR.bundlesLayout.content.show(new PricingBundlesViewController());
        }


    });
});