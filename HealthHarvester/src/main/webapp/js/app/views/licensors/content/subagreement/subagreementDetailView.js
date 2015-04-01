define([
    'mainView',
    'text!templates/licensors/content/subagreement/subagreementDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});