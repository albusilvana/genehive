package com.Service;

import com.DTO.ExportEntityDTO;
import com.DTO.TrainingModelDTO;
import com.Service.UtilsService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.*;
import java.util.List;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class CSVFileWriter {
    //Delimiter used in CSV file

    private static final String COMMA_DELIMITER = ",";

    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String[] FILE_HEADER = {"Name", "Identification Number", "Country Code", "Mutation", "Locus",
            "Disorder", "Professional Exposure", "Professional Exposure Time", "Gender", "Age", "Age At Diagnosis",
            "Age Of Death", "Physician"};

    public String writeCsvFile(String fileName, List<ExportEntityDTO> trainingModelDTOs) {

        UtilsService utilsService = new UtilsService();

        FileWriter fileWriter = null;

//        try {
//
//            fileWriter = new FileWriter(fileName);
//
//            //Write the CSV file header
//
//            fileWriter.append(FILE_HEADER);
//
//            //Add a new line separator after the header
//
//            fileWriter.append(NEW_LINE_SEPARATOR);
//
//            //Write a new student object list to the CSV file
//
//            for (ExportEntityDTO trainingModelDTO : trainingModelDTOs) {
//                fileWriter.append(trainingModelDTO.getName());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getIdentificationNumber());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getCountryCode());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getMutation());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getLocus());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getDisorder());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getProfessionalExposure());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(trainingModelDTO.getProfessionalExposureTime()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getGender());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(trainingModelDTO.getAge()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(trainingModelDTO.getAgeOfDiagnosis()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(trainingModelDTO.getAgeOfDeath()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(String.valueOf(trainingModelDTO.getPhysician()));
//                fileWriter.append(NEW_LINE_SEPARATOR);
//            }
//
//            System.out.println("CSV file was created successfully !!!");
//
//        } catch (Exception e) {
//
//            System.out.println("Error in CsvFileWriter !!!");
//
//            e.printStackTrace();
//
//        } finally {
//
//            try {
//
//                fileWriter.flush();
//
//                fileWriter.close();
//
//            } catch (IOException e) {
//
//                System.out.println("Error while flushing/closing fileWriter !!!");
//
//                e.printStackTrace();
//
//            }
//
//        }
        return fileName;

    }

    public Workbook writeExcelFile( List<ExportEntityDTO> trainingModelDTOs) throws IOException {

        Workbook wb = new HSSFWorkbook();
        FileOutputStream fileInputStream = new FileOutputStream("mutations.xls");

        Sheet sheet = wb.createSheet("Results");

        Row headerRow = sheet.createRow(0);
        headerRow.setHeightInPoints(12.75f);
        for (int i = 0; i < FILE_HEADER.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(FILE_HEADER[i]);
        }
        Row row;

        int rownum = 1;
        for (ExportEntityDTO trainingModelDTO : trainingModelDTOs) {
            row = sheet.createRow(rownum);

            Cell cell;
            int cellNum = 0;

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getName());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getIdentificationNumber());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getCountryCode());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getMutation());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getDisorder());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getLocus());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getProfessionalExposure());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getProfessionalExposureTime());

            cell = row.createCell(cellNum++);
            if(trainingModelDTO.getGender().equals('F')){
                cell.setCellValue("Female");
            }else{
                cell.setCellValue("Male");
            }

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getAge());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getAgeOfDiagnosis());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getAgeOfDeath());

            cell = row.createCell(cellNum++);
            cell.setCellValue(trainingModelDTO.getPhysician());

            rownum++;

            }

            System.out.println("Excel file was created successfully !!!");
        wb.write(fileInputStream);
        fileInputStream.close();
        return wb;

    }

}
