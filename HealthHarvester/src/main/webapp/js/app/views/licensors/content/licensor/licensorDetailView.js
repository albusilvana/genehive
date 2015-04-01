define([
    'mainView',
    'text!templates/licensors/content/licensor/licensorDetail.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template)

    })
});