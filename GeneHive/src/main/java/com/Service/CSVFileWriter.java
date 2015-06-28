package com.Service;

import com.DTO.ExportEntityDTO;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class CSVFileWriter {

    private static final String[] FILE_HEADER = {"Name", "Identification Number", "Country Code", "Mutation", "Locus",
            "Disorder", "Professional Exposure", "Professional Exposure Time", "Gender", "Age", "Age At Diagnosis",
            "Age Of Death", "Physician"};

    private static final String CSV_FILE_HEADER = "Name, Identification Number,Country Code,Mutation,Locus,Disorder,Professional Exposure, Gender,Age,Age At Diagnosis,Age Of Death,Physician";


    public StringBuilder writeCsvFile(List<ExportEntityDTO> trainingModelDTOs) {
        StringBuilder result = new StringBuilder();
        result.append(CSV_FILE_HEADER + System.lineSeparator());


        for (ExportEntityDTO trainingModelDTO : trainingModelDTOs) {
            String gender = trainingModelDTO.getGender().equals("F")?"Female":"Male";
            String country = new Locale("", trainingModelDTO.getCountryCode()).getDisplayCountry();
            result.append(trainingModelDTO.getName() + "," + trainingModelDTO.getIdentificationNumber() + ","
                    + country + "," + trainingModelDTO.getMutation() + ","
                    + trainingModelDTO.getLocus() + "," + trainingModelDTO.getDisorder() + "," + trainingModelDTO.getProfessionalExposure() +
                    "," + gender +
                    "," + trainingModelDTO.getAge() + "," + trainingModelDTO.getAgeOfDiagnosis() + "," + trainingModelDTO.getAgeOfDeath()
                    + "," + trainingModelDTO.getPhysician() + System.lineSeparator());
        }

        return result;

    }

    public Workbook writeExcelFile(List<ExportEntityDTO> trainingModelDTOs) throws IOException {

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
            if (trainingModelDTO.getGender().equals('F')) {
                cell.setCellValue("Female");
            } else {
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
