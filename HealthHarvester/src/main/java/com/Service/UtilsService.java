package com.Service;

import com.DTO.BasicEntityDTO;
import com.Model.Entry;
import com.Model.MutationEntry;
import org.apache.cassandra.thrift.Mutation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class UtilsService {
    private static final MutationService mutationService = new MutationService();

    public Entry convertToEntity(String identificationNumber, String mutations, String countryCode) {

        Entry entity = new Entry(identificationNumber, countryCode, mutationService.convertToMutation(mutations));

        return entity;
    }

    public List<String> convertToMutations(String mutations) {
        List<String> mutationCodes = new ArrayList<String>();
        List<MutationEntry> mutationList = mutationService.convertToMutation(mutations);
        for (MutationEntry mutationEntry : mutationList) {
            if (!mutationCodes.contains(mutationEntry.getGene().getGeneCode())) {
                mutationCodes.add(mutationEntry.getGene().getGeneCode());
            }
        }

        return mutationCodes;
    }

    public BasicEntityDTO convertToBasicEntityDTO(String countryCode, String mutations) {
        int count = mutations.split(",").length;
        BasicEntityDTO basicEntityDTO = new BasicEntityDTO(countryCode, count);
        return basicEntityDTO;
    }

    public List<String> convertToDiagnstics(String mutations) {
        List<String> mutationCodes = new ArrayList<String>();
        List<MutationEntry> mutationList = mutationService.convertToMutation(mutations);
        for (MutationEntry mutationEntry : mutationList) {
            if (!mutationCodes.contains(mutationEntry.getDisease().getName())) {
                mutationCodes.add(mutationEntry.getDisease().getName());
            }
        }

        return mutationCodes;
    }
}
