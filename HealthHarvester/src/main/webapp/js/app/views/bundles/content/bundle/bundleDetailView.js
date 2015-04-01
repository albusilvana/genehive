define([
    'mainView',
    'text!templates/bundles/content/bundle/bundleDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});