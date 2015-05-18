package com;

import java.util.Locale;
import java.util.Random;

/**
 * Created by silvana.albert on 2/24/15.
 */
public class Utils {
    Random rand = new Random();

    private String getRandomCnp() {
        String result = "";
        for (int i = 0; i < 13; i++) {
            result = result + rand.nextInt(9);
        }
        return "'" + result + "'";
    }

    private String getRandomCountryCode() {
        // create a new locale
        Locale locale = new Locale("en", "US", "WIN");
        // get ISO countries
        String[] countries = Locale.getISOCountries();
        return "'" + countries[rand.nextInt(countries.length)] + "'";
    }

    private String getRandomName() {
        String[] names = NameUtils.getNames();
        return "'" + names[rand.nextInt(names.length)] + "'";
    }

    private Integer getRandomDateOfBirth() {
        return rand.nextInt(1420070462 - 157766462) + 157766462;
    }

    private Integer getRandomDateOfDiagnosis(Integer dateOfBirth) {
        return rand.nextInt(1420070462 - dateOfBirth) + dateOfBirth;
    }

    private Integer getRandomDateOfDeath(Integer dateOfBirth) {
        int randomDateOfDeath = rand.nextInt(1420070462 - dateOfBirth) + dateOfBirth;
        if (randomDateOfDeath - dateOfBirth >= 631152000) {
            return randomDateOfDeath;
        } else {
            return 0;
        }
    }

    private String getRandomGender() {
        int i = rand.nextInt(10000);
        if (i % 2 == 0) {
            return "'F'";
        } else {
            return "'M'";
        }
    }

    private String getProfessionalExposures() {
        String[] exposures = ProfessionalExposureUtils.getCategories();
        int i = rand.nextInt(exposures.length);
        if (i % 2 == 0) {
            return "'" + exposures[i] + "_" + getRandomExposureTime() + "'";
        } else {
            return "''";
        }
    }

    private String getRandomMutation() {
        String mutation = "'";

        //genes
        String[] genes = GeneUtils.getGenes();
        int k = rand.nextInt(genes.length);
        String gene = genes[k];

        //locus
        String[] locus = LocusUtils.getLocuses();
        int m = rand.nextInt(locus.length);
        String locus_pos = genes[m];

        //disorders
        String[] disorders = DisorderUtils.getDisorders();
        int i = rand.nextInt(disorders.length);
        String[] disorderString = disorders[i].split(",");
        for (String aDisorderString : disorderString) {
            if (mutation != "'") {
                mutation = mutation.concat(",");
            }
            mutation = mutation.concat(gene + "_" + locus_pos + "_" + aDisorderString);
        }
        return mutation + "'";
    }

    private String getRandomExposureTime() {
        return "" + rand.nextInt(1080000000 - 360000000) + 360000000;
    }

    //    INSERT INTO entries (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender,
//                         professionalExposures,details, mutationEntries,physician)
//    VALUES('Albert Silvana','2920129203415','RO',1428670355,1428670355,1428670355,'F',
//                   'radiation_10000','details','A2M_12p13.31_Alzheimers Disease,AACS_12q24.31_Traheal Cancer','Oltean Marin');
    public static void main(String[] args) {
        Utils utils = new Utils();
        for (int i = 0; i < 100; i++) {
            String s = "INSERT INTO entries (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposures,details, mutationEntries,physician)VALUES(";
            Integer dateOfBirth = utils.getRandomDateOfBirth();
            Integer dateOfDeath = utils.getRandomDateOfDeath(dateOfBirth);
            if(dateOfDeath>0){
                s = s.concat(utils.getRandomName() + "," + utils.getRandomCnp() + "," + utils.getRandomCountryCode() + ","
                        + dateOfBirth + "," + utils.getRandomDateOfDiagnosis(dateOfBirth) + "," + dateOfDeath
                        + "," + utils.getRandomGender() + "," + utils.getProfessionalExposures() + ",''," + utils.getRandomMutation() + "," + utils.getRandomName() + ");");
            }else{
                s = s.concat(utils.getRandomName() + "," + utils.getRandomCnp() + "," + utils.getRandomCountryCode() + ","
                        + dateOfBirth + "," + utils.getRandomDateOfDiagnosis(dateOfBirth) + ",'',"
                         + utils.getRandomGender() + "," + utils.getProfessionalExposures() + ",''," + utils.getRandomMutation() + "," + utils.getRandomName() + ");");
            }

            System.out.println(s);
        }
    }
}
