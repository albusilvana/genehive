package com.Service;

import com.DTO.ExportEntityDTO;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.awt.Image;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Created by silvana.albert on 6/7/15.
 */
public class PDFFileWriter {
//    ** Path to the resulting PDF file. */
    public static final String RESULT
            = "hello.pdf";

    /**
     * Creates a PDF file: hello.pdf
     * @param    args    no arguments needed
     */
//    public static void main(String[] args)
//            throws DocumentException, IOException {
//        new PDFFileWriter().createPdf(RESULT);
//    }

    /**
     * Creates a PDF document.
     * @param filename the path to the new PDF document
     * @throws    DocumentException
     * @throws    IOException
     */
    public static void createPdf(String filename, List<ExportEntityDTO> trainingModelDTOs)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document();
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();

        String RESOURCE = "/Users/silvana.albert/Desktop/itshappening/HealthHarvester/src/main/java/com/Utils/logo.png";
        com.itextpdf.text.Image img;
        java.awt.Image awtImage = Toolkit.getDefaultToolkit().createImage(RESOURCE);
        img = com.itextpdf.text.Image.getInstance(awtImage, null);

        document.add(img);
        // step 4
        document.add(new Paragraph("List of patients with mutations"));
        // step 5

        document.add(createTable(trainingModelDTOs));

        document.close();
    }

    public static PdfPTable createTable(List<ExportEntityDTO> trainingModelDTOs) {
        // a table with three columns
        PdfPTable table = new PdfPTable(11);
        // the cell object
        PdfPCell cell;

        String[] header ="Name, Identification Number,Country Code,Mutation,Disorder,Professional Exposure,Gender,Age,Age At Diagnosis,Age Of Death,Physician".split(",");
        for(int i=0; i<header.length; i++){
            cell = new PdfPCell(new Phrase(header[i]));
            cell.setColspan(1);
            table.addCell(cell);
        }
        // we add a cell with colspan 3


        // we add the four remaining cells with addCell()
//        table.addCell("row 1; cell 1");
//        table.addCell("row 1; cell 2");
//        table.addCell("row 2; cell 1");
//        table.addCell("row 2; cell 2");

//        for(ExportEntityDTO trainingModelDTO: trainingModelDTOs){
//            fileWriter.append(trainingModelDTO.getName());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(trainingModelDTO.getIdentificationNumber());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(trainingModelDTO.getCountryCode());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(utilsService.getMutationCodes(trainingModelDTO.getMutationentries()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(utilsService.getMutationDisorders(trainingModelDTO.getMutationentries()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(utilsService.getProfessionalExposure(trainingModelDTO.getProfessionalExposures()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(trainingModelDTO.getGender());
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(String.valueOf(trainingModelDTO.getAge()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(String.valueOf(trainingModelDTO.getAgeOfDiagnosis()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(String.valueOf(trainingModelDTO.getAgeOfDeath()));
//            fileWriter.append(COMMA_DELIMITER);
//            fileWriter.append(String.valueOf(trainingModelDTO.getPhysician()));
//            fileWriter.append(NEW_LINE_SEPARATOR);
//        }
        return table;
    }
}
