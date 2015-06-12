define([
    'mainView',
    'text!templates/home/header.html'

], function (MainView, template) {

    var that = this;
    that.ContentLayout = Marionette.Layout.extend({


    });
    return MainView.extend({
        template: template,

        onShow: function () {

        }
    });
});