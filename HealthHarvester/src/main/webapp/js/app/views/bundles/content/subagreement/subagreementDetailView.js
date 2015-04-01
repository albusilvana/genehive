define([
    'mainView',
    'text!templates/bundles/content/subagreement/subagreementDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});