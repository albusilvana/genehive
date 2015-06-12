define([
    'underscore',
    'backbone',
    'i18n!nls/labels',
    'i18n!nls/messages'
], function (_, Backbone, labels, messages) {

    return Backbone.Model.extend({

            /**
             * Method used for retrieving a confirmation message when an object has been added
             * keeping in mind the i18n
             *
             * @returns {String}
             */
            getAddedMessage: function () {
                return messages.common.add.format("data");
            },

            /**
             * Method used for retrieving a confirmation message when an object has been updated
             * keeping in mind the i18n
             *
             * @returns {String}
             */
            getUpdatedMessage: function () {
                return messages.common.updateSuccess.format("data");
            },

            /**
             * Method used for retrieving a fail message when an object failed to update itself
             * keeping in mind the i18n
             *
             * @returns {String}
             */
            getSaveFailedMessage: function () {
                return messages.common.updateFail.format('data');
            },

            /**
             * Method used for retrieving a fail message when an object has successfully removed itself
             * keeping in mind the i18n
             *
             * @returns {String}
             */
            getDeletedMessage: function () {
                return messages.common.deleteSuccess.format('data');
            },

            /**
             * Method used for retrieving a fail message when an object failed to remove itself
             * keeping in mind the i18n
             *
             * @returns {String}
             */
            getDeleteFailedMessage: function () {
                return messages.common.deleteFail.format('data');
            }

        },
        /**
         * static data hooked on BaseModel object
         */
        {
            labels: labels,
            messages: messages

        });
});