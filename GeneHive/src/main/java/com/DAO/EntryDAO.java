package com.DAO;

import com.Convertor.core.EntryDTOConvertor;
import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.ExportEntityDTO;
import com.DTO.SearchOptionsDTO;
import com.Model.Mutation;
import com.Service.CountryService;
import com.accessor.CassandraAccessorFactory;
import com.accessor.CassandraEntriesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class EntryDAO {

    CassandraEntriesAccessor cassandraEntriesAccessor = CassandraAccessorFactory.getInstance();

    EntryDTOConvertor entryDTOConvertor = new EntryDTOConvertor();

    public List<ExportEntityDTO> getAllTrainingModels() throws Exception {
        List<ExportEntityDTO> entities = cassandraEntriesAccessor.getCSVEntries();

        return entities;
    }

    public List<ExportEntityDTO> getExportData(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return cassandraEntriesAccessor.getExportData(searchOptionsDTO);
    }

    public int getDataByCountryAndExposure(String exposure, String countryCode) throws Exception {
        SearchOptionsDTO searchOptionsDTO = new SearchOptionsDTO();
        searchOptionsDTO.setProfessionalExposure(exposure);
        return (int) cassandraEntriesAccessor.readMutationByCountryFiltered(countryCode, searchOptionsDTO);

    }

    public List<BasicEntityDTO> getBasicEntitiesDto() throws Exception {

        List<BasicEntityDTO> returnList = new ArrayList<BasicEntityDTO>();
        String[] countries = Locale.getISOCountries();
        System.out.println("Current time before: " + System.currentTimeMillis());

        for (String country : countries) {
            List<BasicEntityDTO> basicEntityDTOList = cassandraEntriesAccessor.readMutationByContry(country);
            BasicEntityDTO newEntityDTO = new BasicEntityDTO(country, 0);
            if (basicEntityDTOList.size() > 0) {
                newEntityDTO.setZ(basicEntityDTOList.size());
            }
            returnList.add(newEntityDTO);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Current time after: " + System.currentTimeMillis());

        return returnList;
    }

    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDto() throws Exception {

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
        System.out.println("Current time before: " + System.currentTimeMillis());
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
        System.out.println("Current time after: " + System.currentTimeMillis());
        return returnList;
    }

    public List<BasicEntityDTO> getFilteredBasicEntitiesDto(SearchOptionsDTO searchOptionsDTO) throws Exception {

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

        List<EnhancedBasicEntityDTO> returnList = new ArrayList<EnhancedBasicEntityDTO>();
        System.out.println("Before: " + System.currentTimeMillis());
        String[] countries = Locale.getISOCountries();
        for (String country : countries) {
            EnhancedBasicEntityDTO newEntityDTO = new EnhancedBasicEntityDTO();
            newEntityDTO.setCode(country);
            newEntityDTO.setName(CountryService.getCountryNameByCode(country));
            int val = (int) cassandraEntriesAccessor.readMutationByCountryFiltered(country, searchOptionsDTO);
            newEntityDTO.setValue(val);
            if (val > 0) {
                returnList.add(newEntityDTO);
            }
        }
        System.out.println("After: " + System.currentTimeMillis());
        return returnList;
    }


    public List<EnhancedBasicEntityDTO> getEnhancedBasicEntitiesDtoByGender(String gender) throws Exception {
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
                              String dateOfDeath, String gender, String professionalExposure, int professionalExposureTime, String details, String mutation, String locus, String disorder, String physician) throws Exception {
        String s = "INSERT INTO Entries_Space.Entries1 (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposure, professionalExposureTime, details, mutation,locus, disorder, physician)VALUES(";

        s = s.concat(name + "," + identificationNumber + "," + countryCode + ","
                + dateOfBirth + "," + dateOfDiagnosis + "," + dateOfDeath
                + "," + gender + "," + professionalExposure + "," + professionalExposureTime + "," + details + "," + mutation + "," + locus + "," + disorder + "," + physician + ");");
        boolean result = cassandraEntriesAccessor.insertEntry(s);

        if (result) {
            return "The entry was successfully inserted.";
        } else {
            return "The entry could not be inserted.";
        }
    }

    public String getQuery(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis,
                           String dateOfDeath, String gender, String professionalExposure, int professionalExposureTime, String details, String mutation, String locus, String disorder, String physician) throws Exception {
        String s = "INSERT INTO entries1 (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposure, professionalExposureTime, details, mutation,locus, disorder, physician)VALUES(";

        s = s.concat(name + "," + identificationNumber + "," + countryCode + ","
                + dateOfBirth + "," + dateOfDiagnosis + "," + dateOfDeath
                + "," + gender + "," + professionalExposure + "," + professionalExposureTime + "," + details + "," + mutation + "," + locus + "," + disorder + "," + physician + ");");
        return s;
    }

    public String bulkInsertEntry(List<String> queries) throws Exception {
        StringBuilder sb = new StringBuilder();
        sb.append("BEGIN UNLOGGED  BATCH\n");
        for (String q : queries) {
            sb.append(q);
        }
        sb.append("APPLY BATCH;");

        boolean result = cassandraEntriesAccessor.insertEntry(sb.toString());

        if (result) {
            return "The entry was successfully inserted.";
        } else {
            return "The entry could not be inserted.";
        }
    }

    public String insertGene(String geneCode, String name) throws Exception {
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
        return cassandraEntriesAccessor.readMutationCount();
    }

    public Mutation insertMutation(Mutation mutation) {
        return mutation;
    }


}

