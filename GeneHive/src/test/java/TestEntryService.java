import com.Service.EntryService;
import com.Service.Utils;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Calendar;

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
        System.out.println("Time before insert: " + calendar.getTime());
        int counter = 10000;
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
        System.out.println("Time after insert: " + calendar.getTime());
    }
}
