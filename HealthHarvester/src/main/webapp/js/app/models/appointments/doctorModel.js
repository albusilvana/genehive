define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({

        parse: function (resp) {
            resp['id'] = resp['doctorId'];
            if(resp['locationId']==1){
                resp['location'] = "Cluj";
            }else{
                resp['location'] = "Bucuresti";
            }

            if(resp['specializationId']==1){
                resp['specialization'] = "Cardiologie";
            }else{
                resp['specialization'] = "Oftalmologie";
            }
            return resp;
        },
        toString: function (resp) {
            return this.get('name');
        }
    });
});