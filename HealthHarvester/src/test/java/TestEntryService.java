import com.DTO.EntryDTO;
import com.Service.EntryService;
import com.Utils;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class TestEntryService {

    private EntryService entryService = new EntryService();

    @Test
    public void testGetEntries() throws Exception {

        long entities = entryService.getMutationCount();

        assertEquals(17380, entities);

    }

    @Test
    @Ignore
    public void testInsertEntries() throws Exception {
        for (int i=0;i<2000; i++){
            Utils utils = new Utils();
            String s = "INSERT INTO entries (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposures,details, mutationEntries,physician)VALUES(";
            Integer dateOfBirth = utils.getRandomDateOfBirth();
            Integer dateOfDeath = utils.getRandomDateOfDeath(dateOfBirth);
            String name = utils.getRandomName();
            String identificationNumber = utils.getRandomCnp();
            String countryCode = utils.getRandomCountryCode();
            Integer dateOfDiagnosis = utils.getRandomDateOfDiagnosis(dateOfBirth);
            String gender = utils.getRandomGender();
            String professionalExposure = utils.getProfessionalExposures();
            String mutationEntries = utils.getRandomMutation();
            String physitian = utils.getRandomName();

            String result;
            if(dateOfDeath > 0){
                result = entryService.insertEntry(name, identificationNumber, countryCode, dateOfBirth +"", dateOfDiagnosis+"",
                        dateOfDeath +"", gender, professionalExposure, "''", mutationEntries, physitian);
            } else {
                result = entryService.insertEntry(name, identificationNumber, countryCode, dateOfBirth +"", dateOfDiagnosis+"",
                        "''", gender, professionalExposure, "''", mutationEntries, physitian);
            }

            assertEquals(result, "The entry was successfully inserted.");
        }

    }
}
