import com.Service.GeneUtils;
import com.Service.EntryService;
import com.Service.Utils;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by silvana.albert on 4/13/15.
 */
public class TestEntryService {

    private EntryService entryService = new EntryService();

    @Test
    @Ignore
    public void testGetEntries() throws Exception {

        long entities = entryService.getMutationCount();

        assertEquals(17380, entities);

    }

    @Test
    public void testInsertEntries() throws Exception {
        System.out.println("Time before insert " + new Date().getHours() + ":" + new Date().getMinutes()+ ":"+ new Date().getSeconds());
        System.out.print("Now it is inserting: "+ 10000 + " results");
        for (int i = 0; i < 10000; i++) {
            Utils utils = new Utils();
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

            String result ;
            if (dateOfDeath > 0) {
                result = entryService.insertEntry(name, identificationNumber, countryCode, dateOfBirth + "", dateOfDiagnosis + "",
                        dateOfDeath + "", gender, professionalExposure, "''", mutationEntries, physitian);
            } else {
                result = entryService.insertEntry(name, identificationNumber, countryCode, dateOfBirth + "", dateOfDiagnosis + "",
                        "''", gender, professionalExposure, "''", mutationEntries, physitian);
            }

            assertEquals(result, "The entry was successfully inserted.");
        }
        System.out.println("Time after insert " + new Date().getHours() + ":" + new Date().getMinutes()+ ":"+ new Date().getSeconds());

    }

    @Test
    @Ignore
    public void insertGenes() throws Exception {
        String[] gene = GeneUtils.getGenes();
        String[] name = GeneUtils.getGenesNames();
        int limit = 0;
        if (gene.length < name.length) {
            limit = gene.length;
        } else {
            limit = name.length;
        }
        String result;
        for (int i = 0; i < limit; i++) {
            result = entryService.insertGene("'" + gene[i] + "'", "'" + name[i] + "'");
            assertEquals(result, "The entry was successfully inserted.");
        }
    }
}
