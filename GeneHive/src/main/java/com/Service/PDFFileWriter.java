package com.Service;

import com.DTO.ExportEntityDTO;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

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
    public boolean createPdf(String filename, List<ExportEntityDTO> trainingModelDTOs)
            throws DocumentException, IOException {
        // step 1
        Document document = new Document(PageSize.A3.rotate(), 0, 0, 0, 0);
        // step 2
        PdfWriter.getInstance(document, new FileOutputStream(filename));
        // step 3
        document.open();

        String RESOURCE = "/Users/salbu/Desktop/itshappening/GeneHive/src/main/java/com/Service/logo.png";
        com.itextpdf.text.Image img;
        java.awt.Image awtImage = Toolkit.getDefaultToolkit().createImage(RESOURCE);
        img = com.itextpdf.text.Image.getInstance(awtImage, null);

        document.add(img);
        // step 4

        document.add(createTable(trainingModelDTOs));

        document.close();
        return true;
    }

    public static PdfPTable createTable(List<ExportEntityDTO> trainingModelDTOs) {
        // a table with three columns
        PdfPTable table = new PdfPTable(12);
        table.setWidthPercentage(90);
        table.setSpacingBefore(10);
        table.setSpacingAfter(10);
        // the cell object
        PdfPCell cell;

        String[] header = "Name, Identification Number,Country Code,Mutation,Locus,Disorder,Professional Exposure, Gender,Age,Age At Diagnosis,Age Of Death,Physician".split(",");
        for(int i=0; i<header.length; i++){
            table.addCell(header[i]);
        }

        for (ExportEntityDTO trainingModelDTO : trainingModelDTOs) {
            String gender = trainingModelDTO.getGender().equals("F") ? "Female" : "Male";
            String country = new Locale("", trainingModelDTO.getCountryCode()).getDisplayCountry();

            table.addCell(trainingModelDTO.getName());
            table.addCell(trainingModelDTO.getIdentificationNumber());
            table.addCell(country);
            table.addCell(trainingModelDTO.getMutation());
            table.addCell(trainingModelDTO.getLocus());
            table.addCell(trainingModelDTO.getDisorder());
            table.addCell(trainingModelDTO.getProfessionalExposure());
//            table.addCell(String.valueOf(trainingModelDTO.getProfessionalExposureTime()));
            table.addCell(gender);
            table.addCell(String.valueOf(trainingModelDTO.getAge()));
            table.addCell(String.valueOf(trainingModelDTO.getAgeOfDiagnosis()));
            table.addCell(String.valueOf(trainingModelDTO.getAgeOfDeath()));
            table.addCell(trainingModelDTO.getPhysician());
        }
        return table;
    }
}
