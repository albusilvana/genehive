package com.Service;

import com.Utils.CSVFileWriter;
import com.DAO.EntryDAO;
import com.Utils.PDFFileWriter;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class ExportDataGeneratorService {
    private static EntryDAO entryDAO = new EntryDAO();

    public static void generateCsv() throws Exception {
        CSVFileWriter.writeCsvFile("exportData.csv", entryDAO.getAllTrainingModels());
    }

    public static void generatePDF() throws Exception {
        PDFFileWriter.createPdf("exportData.pdf", null);
    }

    public static void main(String[] args) throws Exception {
        ExportDataGeneratorService.generatePDF();
        return;
    }
}
