define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        url: function () {
            return NR.rootUrl + 'licensorSubagreements/';
        },


        schema: {
            currentTimeframe: {
                type: 'Select', options: [], validators: [
                    {type: 'required', message: 'Timeframe type must be selected.'}
                ],
                editorClass: 'drop-style'

            },
            currentStatus: {
                type: 'Select', options: ["ACTIVE", "INACTIVE"], validators: [
                    {type: 'required', message: 'Status type must be selected.'}
                ],
                editorClass: 'drop-style'
            }
        }

    });
})
;
