define([
    'mainView',
    'text!templates/licensors/messages.html'

], function (MainView, template) {
    return MainView.extend({

        template: Handlebars.compile(template),
        onShow: function () {
            this.messagesDiv = $('#messagesDiv');
            this.successMessage = $('#successMessage');
            this.errorMessage = $('#errorMessage');
            this.model = this.options.model;
            if (this.options.validation) {
                this.successMessage.hide();
                this.computeMessages(this.options.errors);
                this.errorMessage.show();
                this.messagesDiv.slideDown();
            } else if (this.options.success) {
                this.successMessage.text(this.options.msg);
                this.successMessage.show();
                this.messagesDiv.slideDown().delay(15000).slideUp();
            } else {
                this.successMessage.hide();
                this.errorMessage.text(this.options.msg);
                this.errorMessage.show();
                this.messagesDiv.slideDown();
            }
        },

        computeMessages: function (errors) {
            $(this.errorMessage).empty();
            for (var prop in errors) {
                $(this.errorMessage).append('<p>' + errors[prop].message + '</p>');
            }
        }

    })
});