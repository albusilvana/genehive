package com.Service;

import com.DAO.EntryDAO;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class ExportDataGeneratorService {
    private static EntryDAO entryDAO = new EntryDAO();
    CSVFileWriter csvFileWriter = new CSVFileWriter();
    PDFFileWriter pdfFileWriter = new PDFFileWriter();

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