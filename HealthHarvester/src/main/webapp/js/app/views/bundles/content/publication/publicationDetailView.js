define([
    'mainView',
    'text!templates/bundles/content/publication/publicationDetail.html'
], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});