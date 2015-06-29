package com.Service;

import java.util.Calendar;
import java.util.Locale;
import java.util.Random;

/**
 * Created by silvana.albert on 2/24/15.
 */
public class Utils {
    Random rand = new Random();

    public String getRandomCnp() {
        String result = "";
        for (int i = 0; i < 13; i++) {
            result = result + rand.nextInt(9);
        }
        return "'" + result + "'";
    }

    public String getRandomCountryCode() {
        // create a new locale
        Locale locale = new Locale("en", "US", "WIN");
        // get ISO countries
        String[] countries = Locale.getISOCountries();
        return "'" + countries[rand.nextInt(countries.length)] + "'";
    }

    public String getRandomName() {
        String[] names = NameUtils.getNames();
        return "'" + names[rand.nextInt(names.length)] + "'";
    }

    public Long getRandomDateOfBirth() {
        Calendar cal = Calendar.getInstance();

        cal.set(rand.nextInt((2014+1) - 1950) + 1950,Calendar.JANUARY, 1);
        return cal.getTimeInMillis();
    }

    public Long getRandomDateOfDiagnosis(Long dateOfBirth) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(dateOfBirth);

        Calendar cal = Calendar.getInstance();
        cal.set(rand.nextInt((2014+1) - cal1.get(Calendar.YEAR)) + cal1.get(Calendar.YEAR),Calendar.JANUARY, 1);
        return cal.getTimeInMillis();
    }

    public Long getRandomDateOfDeath(Long dateOfDiagnosis) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTimeInMillis(dateOfDiagnosis);
        Calendar cal = Calendar.getInstance();
        int year = rand.nextInt((2014+1) - cal1.get(Calendar.YEAR)) + cal1.get(Calendar.YEAR);
        cal.set(year,Calendar.JANUARY, 1);
        if(year%3==0){
            return Long.valueOf("4125330000000");
        }else{
            return cal.getTimeInMillis();
        }
    }

    public String getRandomGender() {
        int i = rand.nextInt(10000);
        if (i % 2 == 0) {
            return "'F'";
        } else {
            return "'M'";
        }
    }

    public String getProfessionalExposures() {
        String[] exposures = ProfessionalExposureUtils.getCategories();
        int i = rand.nextInt(exposures.length);
        if (i % 2 == 0) {
            return "'" + exposures[i] + "'";
        } else {
            return "''";
        }
    }

    public String getRandomLocus() {
        //locus
        String[] locus = LocusUtils.getLocuses();
        int m = rand.nextInt(locus.length);
        String locus_pos = locus[m];

        return "'" + locus_pos +"'" ;
    }

    public String getRandomDisorder() {
        //disorders
        String[] disorders = DisorderUtils.getDisorders();
        int i = rand.nextInt(disorders.length);
        String[] disorderString = disorders[i].split(",");
        int j = rand.nextInt(disorderString.length);
        return "'"  + disorderString[j] + "'" ;
    }

    public String getRandomMutation() {
        String mutation;

        //genes
        String[] genes = GeneUtils.getGenes();
        int k = rand.nextInt(genes.length);
        mutation = genes[k];

        return "'" + mutation + "'";
    }

    public Integer getRandomExposureTime( String proffesionalExposure, Long dateOfBirth, Long dateOfDeath) {


        if (!proffesionalExposure.equals("")) {
            Calendar cal = Calendar.getInstance();

            cal.setTimeInMillis(dateOfBirth);

            Calendar calNow = Calendar.getInstance();

            calNow.setTimeInMillis(dateOfDeath);

//calculate age in years.
            int ageYr = (calNow.get(Calendar.YEAR) - cal.get(Calendar.YEAR));
// calculate additional age in months, possibly adjust years.
            int ageMo = (calNow.get(Calendar.MONTH) - cal.get(Calendar.MONTH));
            if (ageMo < 0) {
//adjust years by subtracting one
                ageYr--;
            }

            int exp = ageYr - 10;
            if (exp > 0) {
                return rand.nextInt(exp);

            } else {
                return 0;
            }

        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Utils utils = new Utils();
        for (int i = 0; i < 10000; i++) {
            String s = "INSERT INTO entries (name,identificationNumber, countryCode,dateOfBirth,dateOfDiagnosis,dateOfDeath,gender, professionalExposures,details, mutationEntries,physician)VALUES(";
            Long dateOfBirth = utils.getRandomDateOfBirth();
            Long dateOfDeath = utils.getRandomDateOfDeath(dateOfBirth);
            if (dateOfDeath > 0) {
                s = s.concat(utils.getRandomName() + "," + utils.getRandomCnp() + "," + utils.getRandomCountryCode() + ","
                        + dateOfBirth + "," + utils.getRandomDateOfDiagnosis(dateOfBirth) + "," + dateOfDeath
                        + "," + utils.getRandomGender() + "," + utils.getProfessionalExposures() + ",''," + utils.getRandomMutation() + "," + utils.getRandomName() + ");");
            } else {
                s = s.concat(utils.getRandomName() + "," + utils.getRandomCnp() + "," + utils.getRandomCountryCode() + ","
                        + dateOfBirth + "," + utils.getRandomDateOfDiagnosis(dateOfBirth) + ",'',"
                        + utils.getRandomGender() + "," + utils.getProfessionalExposures() + ",''," + utils.getRandomMutation() + "," + utils.getRandomName() + ");");
            }

            System.out.println(s);
        }
    }
}
