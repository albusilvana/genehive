define([
    'baseModel'

], function (BaseModel) {

    return BaseModel.extend({
        urlRoot: function () {
            return NR.rootUrl + 'user/addPatient';
        },
        labels: {
            displayName: BaseModel.labels.licensors.licensor.name,
            displayId: BaseModel.labels.licensors.licensor.id,
            icon: 'licensor.png'
        },
        schema: {
            name: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Name is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Name can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Name must not exceed 255 characters.'
                }
            },
            username: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Username is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Username can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Username must not exceed 255 characters.'
                }
            },
            city: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'City is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'City can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'City must not exceed 255 characters.'
                }
            },
            email: { type: 'Text',
                validators: [
                    {
                        type: 'required', message: 'Email is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Email can not contain only white spaces.'
                    }
                ],
                editorAttrs: {
                    maxlength: 255, title: 'Email must not exceed 255 characters.'
                }
            },
            country: {
                type: 'Select', options: ["Romania", "Hungary","Russia","France","Ukraine","Italy","Belarus"], validators: [
                    {type: 'required', message: 'ProfessionalExposureCategories must be selected.'}
                ],
                editorClass: 'drop-style'
            },
            gender: {
                type: 'Select', options: ["M","F"], validators: [
                    {type: 'required', message: 'Gender must be selected.'}
                ],
                editorClass: 'drop-style'
            },
            comment: { type: 'TextArea', validators: [
                {
                    type: 'required', message: 'Comment is required.'
                },
                {
                    type: 'regexp', regexp: /\S/, message: 'Comment can not contain only white spaces.'
                }
            ]},
                address: { type: 'Text', validators: [
                    {
                        type: 'required', message: 'Address is required.'
                    },
                    {
                        type: 'regexp', regexp: /\S/, message: 'Address can not contain only white spaces.'
                    }
                ]},
                    zipCode: { type: 'Text',
                        validators: [
                            {
                                type: 'required', message: 'Zipcode is required.'
                            },
                            {
                                type: 'regexp', regexp: /\S/, message: 'Zipcode can not contain only white spaces.'
                            }
                        ],
                        editorAttrs: {
                            maxlength: 255, title: 'Zipcode must not exceed 255 characters.'
                        }
                    }
        },
        parse: function (resp) {
            resp['id'] = resp['userId'];
            return resp;
        },
        toString: function (resp) {
            return this.get('name');
        }
    });
});