package com.Service;

import com.DTO.ExportEntityDTO;
import com.DTO.TrainingModelDTO;
import com.Service.UtilsService;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class CSVFileWriter {
    //Delimiter used in CSV file

    private static final String COMMA_DELIMITER = ",";

    private static final String NEW_LINE_SEPARATOR = "\n";

    private static final String FILE_HEADER = "Name, Identification Number,Country Code,Mutation,Disorder,Professional Exposure,Gender,Age,Age At Diagnosis,Age Of Death,Physician";
//    "select name,identificationNumber,countryCode,mutationentries,professionalExposures,gender,dateOfBirth,dateOfDiagnosis,dateOfDeath,physician from Entries_Space.Entries";

    public static void writeCsvFile(String fileName, List<ExportEntityDTO> trainingModelDTOs) {

        UtilsService utilsService = new UtilsService();

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter(fileName);

            //Write the CSV file header

            fileWriter.append(FILE_HEADER);

            //Add a new line separator after the header

            fileWriter.append(NEW_LINE_SEPARATOR);

            //Write a new student object list to the CSV file

//            for(ExportEntityDTO trainingModelDTO: trainingModelDTOs){
//                fileWriter.append(trainingModelDTO.getName());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getIdentificationNumber());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(trainingModelDTO.getCountryCode());
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(utilsService.getMutationCodes(trainingModelDTO.getMutationentries()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(utilsService.getMutationDisorders(trainingModelDTO.getMutationentries()));
//                fileWriter.append(COMMA_DELIMITER);
//                fileWriter.append(utilsService.getProfessionalExposure(trainingModelDTO.getProfessionalExposures()));
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

            System.out.println("CSV file was created successfully !!!");

        } catch (Exception e) {

            System.out.println("Error in CsvFileWriter !!!");

            e.printStackTrace();

        } finally {

            try {

                fileWriter.flush();

                fileWriter.close();

            } catch (IOException e) {

                System.out.println("Error while flushing/closing fileWriter !!!");

                e.printStackTrace();

            }

        }
        return;

    }

}
