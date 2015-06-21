package com.Service;

import com.Convertor.core.EntityBaseDTOs;
import com.Convertor.core.EntryDTOConvertor;
import com.DAO.EntryDAO;
import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.EntryDTO;
import com.Model.Entry;
import com.accessor.CassandraEntriesAccessor;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by silvana.albert on 4/10/15.
 */
public class EntryService {

    private EntryDAO entryDAO = new EntryDAO();


    public List<BasicEntityDTO> getAllBasicEntitiesDTO() throws Exception {
        return entryDAO.getBasicEntitiesDto();
    }

    public List<EnhancedBasicEntityDTO> getAllEnhancedEntitiesDTO() throws Exception {
        return entryDAO.getEnhancedBasicEntitiesDto();
    }

    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDtoByGender(String gender) throws Exception {
        return entryDAO.getEnhancedBasicEntitiesDtoByGender(gender);
    }

    public List<BasicEntityDTO> getAllEntitiesByGender(String gender) throws Exception {
        return entryDAO.getBasicEntitiesDtoByGender(gender);
    }

    public String insertEntry(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis,
                              String dateOfDeath, String gender, String professionalExposure,String professionalExposureTime, String details, String mutation, String locus, String disorder, String physitian) throws Exception {
        return entryDAO.insertEntry(name, identificationNumber, countryCode, dateOfBirth, dateOfDiagnosis,
                dateOfDeath, gender, professionalExposure,professionalExposureTime, details, mutation, locus, disorder, physitian);
    }

    public String insertGene(String code, String name) throws Exception {
        return entryDAO.insertGene(code, name);
    }

    public long getMutationCount() throws Exception {
        return entryDAO.getMutationCount();
    }
}
