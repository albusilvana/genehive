import com.Service.EntryService;
import com.Service.Utils;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.assertEquals;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class TestEntryService {

    private EntryService entryService = new EntryService();

    @Test
    @Ignore
    public void testInsertEntries() throws Exception {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Time before insert: " + System.currentTimeMillis());
        int counter = 100000;
        System.out.println("Now it is inserting: " + counter + " results");
        for (int i = 0; i < counter; i++) {
            Utils utils = new Utils();
            Long dateOfBirth = utils.getRandomDateOfBirth();
            String name = utils.getRandomName();
            String identificationNumber = utils.getRandomCnp();
            String countryCode = utils.getRandomCountryCode();
            Long dateOfDiagnosis = utils.getRandomDateOfDiagnosis(dateOfBirth);
            Long dateOfDeath = utils.getRandomDateOfDeath(dateOfDiagnosis);
            String gender = utils.getRandomGender();
            String professionalExposure = utils.getProfessionalExposures();
//            String professionalExposure = "'Arsenic'";
            Integer professionalExposureTime = utils.getRandomExposureTime(professionalExposure, dateOfBirth, dateOfDeath);
            String mutationEntries = utils.getRandomMutation();
//            String mutationEntries = "'Pancreatic Cancer'";
            String locus = utils.getRandomLocus();
            String disorder = utils.getRandomDisorder();
            String physician = utils.getRandomName();

            String result = entryService.insertEntry(name, identificationNumber,countryCode, dateOfBirth + "", dateOfDiagnosis + "",
                        dateOfDeath + "", gender, professionalExposure, professionalExposureTime , "''", mutationEntries, locus, disorder, physician);
            assertEquals(result, "The entry was successfully inserted.");
        }
        System.out.println("Time after insert: " + System.currentTimeMillis());
    }

    @Test
    public void testBulkInsertEntries() throws Exception {
        System.out.println("Time before insert: " + System.currentTimeMillis());
        int counter = 700000;
        System.out.println("Now it is inserting: " + counter + " results");
        List<String> bulk = new ArrayList<>();
        String countryCode = "'IS'";
        String gender = "'M'";
        String mutationEntries = "'BRCA1'";
        String professionalExposure = "'Arsenic'";
        String locus = "'7q31.32'";
        String disorder = "'Breast Cancer'";

        for (int i = 0; i < counter; i++) {
            Utils utils = new Utils();
            Long dateOfBirth = utils.getRandomDateOfBirth();
            String name = utils.getRandomName();
            String identificationNumber = utils.getRandomCnp();
//            String countryCode = utils.getRandomCountryCode();

            Long dateOfDiagnosis = utils.getRandomDateOfDiagnosis(dateOfBirth);
            Long dateOfDeath = utils.getRandomDateOfDeath(dateOfDiagnosis);
//            String gender = utils.getRandomGender();
//            String professionalExposure = utils.getProfessionalExposures();
            Integer professionalExposureTime = utils.getRandomExposureTime(professionalExposure, dateOfBirth, dateOfDeath);
//            String mutationEntries = utils.getRandomMutation();
//            String locus = utils.getRandomLocus();
//            String disorder = utils.getRandomDisorder();
            String physician = utils.getRandomName();

            String result = getQuery(name, identificationNumber,countryCode, dateOfBirth + "", dateOfDiagnosis + "",
                    dateOfDeath + "", gender, professionalExposure, professionalExposureTime , "''", mutationEntries, locus, disorder, physician);
            bulk.add(result);
            if(i%100 == 0){
                entryService.bulkInsertEntry(bulk);
                bulk = new ArrayList<>();
            }
        }
        entryService.bulkInsertEntry(bulk);


        System.out.println("Time after insert: " + System.currentTimeMillis());
    }

    public String getQuery(String name, String identificationNumber, String countryCode, String dateOfBirth, String dateOfDiagnosis,
                           String dateOfDeath, String gender, String professionalExposure, int professionalExposureTime, String details, String mutation, String locus, String disorder, String physician) throws Exception {
        String s = "INSERT INTO entries1 (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposure, professionalExposureTime, details, mutation,locus, disorder, physician)VALUES(";

        s = s.concat(name + "," + identificationNumber + "," + countryCode + ","
                + dateOfBirth + "," + dateOfDiagnosis + "," + dateOfDeath
                + "," + gender + "," + professionalExposure + "," + professionalExposureTime + "," + details + "," + mutation + "," + locus + "," + disorder + "," + physician + ");");
        return s;
    }

    @Test
    @Ignore
    public void testInsertEntriesByCountry() throws Exception {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Time before insert: " + calendar.getTime());
        int counter = 30000;
        System.out.println("Now it is inserting: " + counter + " results");
        for (int i = 0; i < counter; i++) {
            Utils utils = new Utils();
            Long dateOfBirth = utils.getRandomDateOfBirth();
            String name = utils.getRandomName();
            String identificationNumber = utils.getRandomCnp();
            String countryCode = utils.getRandomCountryCode();
//            String countryCode = "MX";
//            String countryCode = "RO";
            Long dateOfDiagnosis = utils.getRandomDateOfDiagnosis(dateOfBirth);
            Long dateOfDeath = utils.getRandomDateOfDeath(dateOfDiagnosis);
            String gender = utils.getRandomGender();
            String professionalExposure = utils.getProfessionalExposures();
//            String professionalExposure = "'Arsenic'";
            Integer professionalExposureTime = utils.getRandomExposureTime(professionalExposure, dateOfBirth, dateOfDeath);
            String mutationEntries = utils.getRandomMutation();
//            String mutationEntries = "'Pancreatic Cancer'";
            String locus = utils.getRandomLocus();
            String disorder = utils.getRandomDisorder();
            String physician = utils.getRandomName();

            String result = entryService.insertEntry(name, identificationNumber,"'"+countryCode+"'", dateOfBirth + "", dateOfDiagnosis + "",
                    dateOfDeath + "", gender, professionalExposure, professionalExposureTime , "''", mutationEntries, locus, disorder, physician);
            assertEquals(result, "The entry was successfully inserted.");
        }
        System.out.println("Time after insert: " + calendar.getTime());
    }
}
