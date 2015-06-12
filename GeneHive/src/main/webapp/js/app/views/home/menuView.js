define([
    'mainView',
    'text!templates/home/menu.html'
], function (MainView, template) {

    return MainView.extend({
        template: template,
        onShow: function () {
        }
    });
});