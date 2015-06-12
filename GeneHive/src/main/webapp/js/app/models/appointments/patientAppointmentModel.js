define([
    'baseModel',
    'doctorsCollection',
 'locationsCollection',
    'specializationsCollection'
], function (BaseModel, DoctorsCollection,LocationsCollection,SpecializationsCollection) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'appointment/add';
        },
        labels: {

        },
        schema: {

            doctorId: {
                type: 'Select', options: new DoctorsCollection(), validators: [

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
            for(var i=0; i<NR.store.doctors.length;i++){
                if (NR.store.doctors.models[i].id == resp['doctorId']){
                    resp['doctor'] = NR.store.doctors.models[i].attributes.name;
                }
            }
            return resp;
        }
    });
});