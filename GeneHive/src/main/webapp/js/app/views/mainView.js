define([
    'jquery',
    'underscore',
    'backbone',
    'marionette',
    'handlebars',
    'backboneForms',
    'backboneOverrides',
    'moment',
    'jqueryBlockUI'
], function ($, _, Backbone, Marionette) {

    /**
     * Acts as a Base View and all the views in the application should extend from this MainView
     */
    return Marionette.ItemView.extend({

        /**
         * Method it's overridden from Marionette in order to add labels data to the json
         * @returns {{}}
         */
        serializeData: function () {
            var data = {};

            if (this.model) {
                data = this.model.toJSON();
                data['labels'] = this.model.labels;
            }

            return data;
        }
    })
});