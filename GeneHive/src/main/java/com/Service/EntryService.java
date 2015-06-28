package com.Service;

import com.DAO.EntryDAO;
import com.DTO.BasicEntityDTO;
import com.DTO.EnhancedBasicEntityDTO;
import com.DTO.SearchOptionsDTO;

import java.util.List;

/**
 * Created by silvana.albert on 4/10/15.
 */
public class EntryService {

    private EntryDAO entryDAO = new EntryDAO();
    private CSVFileWriter csvFileWriter = new CSVFileWriter();
    private PDFFileWriter pdfFileWriter = new PDFFileWriter();
    private PredictionService predictionService = new PredictionService();


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

    public List<BasicEntityDTO> getEntitiesFiltered(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return entryDAO.getFilteredBasicEntitiesDto(searchOptionsDTO);
    }

    public List<EnhancedBasicEntityDTO> getEnhancedEntitiesFiltered(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return entryDAO.getFilteredEnhancedEntitiesDto(searchOptionsDTO);
    }

    public StringBuilder getCSVExportLocation(SearchOptionsDTO searchOptionsDTO) throws Exception {
        return csvFileWriter.writeCsvFile(entryDAO.getExportData(searchOptionsDTO));
    }

    public List<BasicEntityDTO> getPredictedResults(SearchOptionsDTO searchOptionsDTO, String date) throws Exception {
        List<BasicEntityDTO> basicEntityDTOs = entryDAO.getFilteredBasicEntitiesDto(searchOptionsDTO);
        return predictionService.getPredictedResult(basicEntityDTOs, date);
    }

    public List<EnhancedBasicEntityDTO> getEnhancedPredictedResults(SearchOptionsDTO searchOptionsDTO, String date) throws Exception {
        List<BasicEntityDTO> basicEntityDTOs = entryDAO.getFilteredBasicEntitiesDto(searchOptionsDTO);
        return predictionService.getHighlightPredictedResult(basicEntityDTOs, date);
    }

    public String getPDFExportLocation(SearchOptionsDTO searchOptionsDTO) throws Exception {
        pdfFileWriter.createPdf("mutations.pdf", entryDAO.getExportData(searchOptionsDTO));
        return "/Users/salbu/Desktop/itshappening/GeneHive/mutations.pdf";
    }

    public String insertEntry(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis,
                              String dateOfDeath, String gender, String professionalExposure, String professionalExposureTime, String details, String mutation, String locus, String disorder, String physitian) throws Exception {
        return entryDAO.insertEntry(name, identificationNumber, countryCode, dateOfBirth, dateOfDiagnosis,
                dateOfDeath, gender, professionalExposure, professionalExposureTime, details, mutation, locus, disorder, physitian);
    }

    public String insertGene(String code, String name) throws Exception {
        return entryDAO.insertGene(code, name);
    }

    public long getMutationCount() throws Exception {
        return entryDAO.getMutationCount();
    }
}
