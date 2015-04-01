define([
    'baseModel',

    'licensorLicensors',
    'locationsCollection',
    'specializationsCollection'
], function (BaseModel, LicensorsCollection,LocationsCollection,SpecializationsCollection) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'appointment/add';
        },
        labels: {

        },
        schema: {

            userId: {
                type: 'Select', options: new LicensorsCollection(), validators: [

                ]
            },
            locationId: {
                type: 'Select', options: new LocationsCollection(), validators: [

                ]
            },
            specializationId: {
                type: 'Select', options: new SpecializationsCollection(), validators: [

                ]
            },
            date: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Date is required.'
                }
            ]},
            time: { type: 'Text', validators: [
                {
                    type: 'required', message: 'Time is required.'
                }
            ]},
            comment: { type: 'TextArea', validators: [
                {
                    type: 'required', message: 'Comment is required.'
                },
                {
                    type: 'regexp', regexp: /\S/, message: 'Comment can not contain only white spaces.'
                }
            ]}


        },
        parse: function (resp) {
            resp['id'] = resp['appointmentId'];
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
            for(var i=0; i<NR.store.patients.length;i++){
                if (NR.store.patients.models[i].attributes.id == resp['userId']){
                    resp['patient']=NR.store.patients.models[i].attributes.name;
                }
            }
            return resp;
        }
    });
});