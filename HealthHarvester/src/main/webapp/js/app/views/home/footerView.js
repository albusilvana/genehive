define([
    'mainView',
    'text!templates/home/footer.html'

], function (MainView, template) {

    return MainView.extend({
        template: template,

        onShow: function () {
        }
    });
});