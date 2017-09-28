package com.Service;

import com.DAO.MutationDAO;
import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.SearchOptionsDTO;
import com.Model.Mutation;
import com.google.inject.Inject;

import java.util.List;

/**
 * Created by silvana.albert on 04/10/15.
 */
public class MutationService {
    private static MutationDAO mutationDAO;
    private static PredictionService predictionService;

    @Inject
    public MutationService(MutationDAO mutationDAO, PredictionService predictionService){
        MutationService.mutationDAO = mutationDAO;
        MutationService.predictionService = predictionService;
    }

    /**
     * @return a list containing all mutations in the database
     */
    public List<BasicEntityDTO> getAllBasicEntitiesDTO() throws Exception {
        return mutationDAO.getBasicEntitiesDto();
    }


    /**
     * @param gender has values "F" of "M"
     * @return a list containing all mutations for the given gender in the database
     */
    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDtoByGender(String gender) throws Exception {
        return mutationDAO.getEnhancedBasicEntitiesDtoByGender(gender);
    }

    /**
     * @param searchOptionsDTO  advanced filter object containing filters like professional exposure, locus and disorder
     * @return a list containing the mutations that match the filters
     */
    public List<BasicEntityDTO> getEntitiesFiltered(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return mutationDAO.getFilteredBasicEntitiesDto(searchOptionsDTO);
    }

    /**
     * @param searchOptionsDTO advanced filter object containing filters like professional exposure, locus and disorder
     * @param predictionDate value used for predicting the mutations (ex: 12/12/2020 - how many mutations that match the filters will exist in 2020)
     * @return a list containing the predicted mutations that match the filters
     */
    public List<BasicEntityDTO> getPredictedResults(SearchOptionsDTO searchOptionsDTO, String predictionDate) throws Exception {
        List<BasicEntityDTO> basicEntityDTOs = mutationDAO.getFilteredBasicEntitiesDto(searchOptionsDTO);
        return predictionService.getPredictedResult(basicEntityDTOs, predictionDate);
    }

    /**
     * @param mutation the mutation object that needs to be persisted
     * @return the created mutation
     */
    public Mutation createMutation(Mutation mutation) {
        return mutationDAO.insertMutation(mutation);
    }

    /**
     * @return the number of mutations in the database
     */
    public long getMutationCount() throws Exception {
        return mutationDAO.getMutationCount();
    }

}
