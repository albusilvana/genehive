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
    @Ignore
    public void testInsertEntries() throws Exception {
        System.out.println("Time before insert " + new Date().getHours() + ":" + new Date().getMinutes() + ":" + new Date().getSeconds());
        int counter = 1000;
        System.out.print("Now it is inserting: " + counter + " results");
        for (int i = 0; i < counter; i++) {
            Utils utils = new Utils();
            Long dateOfBirth = utils.getRandomDateOfBirth();

            String name = utils.getRandomName();
            String identificationNumber = utils.getRandomCnp();
            String countryCode = utils.getRandomCountryCode();
            Long dateOfDiagnosis = utils.getRandomDateOfDiagnosis(dateOfBirth);
            Long dateOfDeath = utils.getRandomDateOfDeath(dateOfDiagnosis);
            String gender = utils.getRandomGender();
//            String professionalExposure = utils.getProfessionalExposures();
            String professionalExposure = "'Arsenic'";
            Integer professionalExposureTime = utils.getRandomExposureTime(professionalExposure, dateOfBirth, dateOfDeath);
            String mutationEntries = utils.getRandomMutation();
            String locus = utils.getRandomLocus();
            String disorder = utils.getRandomDisorder();
            String physician = utils.getRandomName();

            String result;

                result = entryService.insertEntry(name, identificationNumber,countryCode, dateOfBirth + "", dateOfDiagnosis + "",
                        dateOfDeath + "", gender, professionalExposure, professionalExposureTime , "''", mutationEntries, locus, disorder, physician);



            assertEquals(result, "The entry was successfully inserted.");
        }
        System.out.println("Time after insert " + new Date().getHours() + ":" + new Date().getMinutes() + ":" + new Date().getSeconds());

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
