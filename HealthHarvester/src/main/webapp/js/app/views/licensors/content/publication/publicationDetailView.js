define([
    'mainView',
    'text!templates/common/publication/publicationDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});