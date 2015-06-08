package com.Utils;

/**
 * Created by silvana.albert on 5/18/15.
 */
public class ProfessionalExposureUtils {
    public static String chemicals = "Arsenic\n" +
            "Asbestos\n" +
            "Asphalt fumes\n" +
            "Benzene\n" +
            "Beryllium\n" +
            "1-Bromopropane\n" +
            "13-Butadiene\n" +
            "Cadmium\n" +
            "Chromium\n" +
            "Diacetyl\n" +
            "Diesel exhaust\n" +
            "Ethylene oxide\n" +
            "Formaldehyde\n" +
            "Hexavalent chromium\n" +
            "Hydrogen sulfide\n" +
            "Isocyanates\n" +
            "Lead\n" +
            "Mercury\n" +
            "Metals toxic\n" +
            "Metalworking fluids\n" +
            "Methylene chloride\n" +
            "Silica" +
            "Crystalline\n" +
            "Solvents\n" +
            "Synthetic mineral fibers\n" +
            "Toluene";
    public static String[] getCategories(){
        return chemicals.split("\n");
    }
}
