define([
    'baseModel'
], function (BaseModel) {

    return BaseModel.extend({

        parse: function (data) {
            data['operator'] = data.context[0].operator;
            data['field'] = data.context[0].name;
            data['value'] = data.context[0].value;
            data['breakMessage'] = data.breakMessage;
            return data;
        }
    });
});