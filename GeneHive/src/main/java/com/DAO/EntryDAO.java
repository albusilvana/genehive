package com.DAO;

import com.Convertor.core.EntryDTOConvertor;
import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.ExportEntityDTO;
import com.DTO.SearchOptionsDTO;
import com.Service.CountryService;
import com.accessor.CassandraEntriesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDAO {

    CassandraEntriesAccessor cassandraEntriesAccessor = new CassandraEntriesAccessor();

    EntryDTOConvertor entryDTOConvertor = new EntryDTOConvertor();

    public List<ExportEntityDTO> getAllTrainingModels() throws Exception {
        cassandraEntriesAccessor.activate();
        List<ExportEntityDTO> entities = cassandraEntriesAccessor.getCSVEntries();

        return entities;
    }

    public List<ExportEntityDTO> getExportData(SearchOptionsDTO searchOptionsDTO) throws Exception {
        cassandraEntriesAccessor.activate();
        return cassandraEntriesAccessor.getExportData(searchOptionsDTO);
    }

    public List<BasicEntityDTO> getBasicEntitiesDto() throws Exception {
        cassandraEntriesAccessor.activate();

        List<BasicEntityDTO> returnList = new ArrayList<BasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByContry(country);
            BasicEntityDTO newEntityDTO = new BasicEntityDTO(country, 0);
            if (basicEntityDTOList.size() > 0) {
                newEntityDTO.setZ(basicEntityDTOList.size());
            }
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDto() throws Exception {
        cassandraEntriesAccessor.activate();

        List<EnhancedBasicEntityDTO> returnList = new ArrayList<EnhancedBasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByContry(country);
            EnhancedBasicEntityDTO newEntityDTO = new EnhancedBasicEntityDTO();
            if (basicEntityDTOList.size() > 0) {
                newEntityDTO.setCode(country);
                newEntityDTO.setName(CountryService.getCountryNameByCode(country));
                newEntityDTO.setValue(basicEntityDTOList.size());
            }
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    public List<BasicEntityDTO> getBasicEntitiesDtoByGender(String gender) throws Exception {
        cassandraEntriesAccessor.activate();
        List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByGender(gender);
        List<BasicEntityDTO> returnList = new ArrayList<BasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            BasicEntityDTO newEntityDTO = new BasicEntityDTO(country, 0);
            for (BasicEntityDTO basicEntityDTO : basicEntityDTOList) {
                if (basicEntityDTO.getCode().equals(country)) {
                    newEntityDTO.setZ(newEntityDTO.getZ() + basicEntityDTO.getZ());
                }
            }
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    public List<BasicEntityDTO> getFilteredBasicEntitiesDto(SearchOptionsDTO searchOptionsDTO) throws Exception {
        cassandraEntriesAccessor.activate();

        List<BasicEntityDTO> returnList = new ArrayList<BasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            BasicEntityDTO newEntityDTO = new BasicEntityDTO(country, 0);
            newEntityDTO.setZ((int) cassandraEntriesAccessor.readMutationByCountryFiltered(country, searchOptionsDTO));
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    public List<EnhancedBasicEntityDTO> getFilteredEnhancedEntitiesDto(SearchOptionsDTO searchOptionsDTO) throws Exception {
        cassandraEntriesAccessor.activate();

        List<EnhancedBasicEntityDTO> returnList = new ArrayList<EnhancedBasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            EnhancedBasicEntityDTO newEntityDTO = new EnhancedBasicEntityDTO();
            newEntityDTO.setCode(country);
            newEntityDTO.setName(CountryService.getCountryNameByCode(country));
            int val = (int) cassandraEntriesAccessor.readMutationByCountryFiltered(country, searchOptionsDTO);
            newEntityDTO.setValue(val);
            if(val>0){
                returnList.add(newEntityDTO);
            }
        }
        return returnList;
    }


    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDtoByGender(String gender) throws Exception {
        cassandraEntriesAccessor.activate();
        List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByGender(gender);
        List<EnhancedBasicEntityDTO> returnList = new ArrayList<EnhancedBasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            EnhancedBasicEntityDTO newEntityDTO = new EnhancedBasicEntityDTO();
            for (BasicEntityDTO basicEntityDTO : basicEntityDTOList) {
                if (basicEntityDTO.getCode().equals(country)) {
                    newEntityDTO.setCode(country);
                    newEntityDTO.setName(CountryService.getCountryNameByCode(country));
                    newEntityDTO.setValue(newEntityDTO.getValue() + basicEntityDTO.getZ());
                }
            }
            returnList.add(newEntityDTO);
        }
        return returnList;
    }

    public String insertEntry(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis,
                              String dateOfDeath, String gender, String professionalExposure, String professionalExposureTime, String details, String mutation, String locus, String disorder, String physician) throws Exception {
        cassandraEntriesAccessor.activate();
        String s = "INSERT INTO entries (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposure, professionalExposureTime, details, mutation,locus, disorder, physician)VALUES(";

        s = s.concat(name + "," + identificationNumber + "," + countryCode + ","
                + dateOfBirth + "," + dateOfDiagnosis + "," + dateOfDeath
                + "," + gender + "," + professionalExposure + "," + professionalExposureTime + "," + details + "," + mutation + "," + locus + "," + disorder + "," + physician + ");");
//        System.out.println(s);
        boolean result = cassandraEntriesAccessor.insertEntry(s);

        if (result) {
            return "The entry was successfully inserted.";
        } else {
            return "The entry could not be inserted.";
        }
    }

    public String insertGene(String geneCode, String name) throws Exception {
        cassandraEntriesAccessor.activate();
        String s = "INSERT INTO genes (genecode,genename)VALUES(";

        s = s.concat(geneCode + "," + name + ");");

        boolean result = cassandraEntriesAccessor.insertEntry(s);

        if (result) {
            return "The entry was successfully inserted.";
        } else {
            return "The entry could not be inserted.";
        }
    }


    public long getMutationCount() throws Exception {
        cassandraEntriesAccessor.activate();
        return cassandraEntriesAccessor.readMutationCount();
    }


}

