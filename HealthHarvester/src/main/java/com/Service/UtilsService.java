package com.Service;

import com.Model.Entry;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class UtilsService {
    private static final MutationService mutationService= new MutationService();

    public Entry convertToEntity(String identificationNumber, String mutations, String countryCode){

        Entry entity = new Entry(identificationNumber,countryCode,mutationService.convertToMutation(mutations));

        return entity;
    }
}
