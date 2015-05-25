package com.Service;

import com.CSVFileWriter;
import com.DAO.EntryDAO;
import com.Model.Entry;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class CsvGeneratorService {
    private static EntryDAO entryDAO = new EntryDAO();

    public static void generateCsv() throws Exception {
        CSVFileWriter.writeCsvFile("trainingModel.csv", entryDAO.getAllTrainingModels());
    }

    public static void main(String[] args) throws Exception {
        CsvGeneratorService.generateCsv();
        return;
    }
}
