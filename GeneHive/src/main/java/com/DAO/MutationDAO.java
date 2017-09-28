package com.DAO;

import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.SearchOptionsDTO;
import com.Model.Mutation;
import com.Service.CountryService;
import com.accessor.CassandraAccessorFactory;
import com.accessor.CassandraEntriesAccessor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by silvana.albert on 5/12/15.
 */
public class MutationDAO {
    private static CassandraEntriesAccessor cassandraEntriesAccessor = CassandraAccessorFactory.getInstance();

    /**
     * @return a list containing all mutations in the database
     */
    public List<BasicEntityDTO> getBasicEntitiesDto() throws SQLException {
        return cassandraEntriesAccessor.readAllMutations();
    }

    /**
     * @param searchOptionsDTO  advanced filter object containing filters like professional exposure, locus and disorder
     * @return a list containing all mutations in the database
     */
    public List<BasicEntityDTO> getFilteredBasicEntitiesDto(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return cassandraEntriesAccessor.readMutationFiltered(searchOptionsDTO);
    }

    /**
     * @param gender has values "F" of "M"
     * @return a list containing all mutations for the given gender in the database
     */
    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDtoByGender(String gender) throws Exception {
        List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByGender(gender);
        List<EnhancedBasicEntityDTO> returnList = new ArrayList<EnhancedBasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            EnhancedBasicEntityDTO newEntityDTO = new EnhancedBasicEntityDTO();
            basicEntityDTOList.stream().filter(basicEntityDTO -> basicEntityDTO.getCode().equals(country)).forEach(basicEntityDTO -> {
                newEntityDTO.setCode(country);
                newEntityDTO.setName(CountryService.getCountryNameByCode(country));
                newEntityDTO.setValue(newEntityDTO.getValue() + basicEntityDTO.getZ());
            });
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    /**
     * @return the number of mutations in the database
     */
    public long getMutationCount() throws Exception {
        return cassandraEntriesAccessor.readMutationCount();
    }

    /**
     * @param mutation the mutation object that needs to be persisted
     * @return the created mutation
     */
    public Mutation insertMutation(Mutation mutation) {
        return cassandraEntriesAccessor.insertMutation(mutation);
    }

}
