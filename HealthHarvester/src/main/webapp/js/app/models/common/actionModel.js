define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        toString: function () {
            return this.get('name');
        }
    });
});