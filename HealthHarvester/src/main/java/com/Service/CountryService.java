package com.Service;

import java.util.Locale;

/**
 * Created by silvana.albert on 3/11/15.
 */
public class CountryService {
    public static void main(String[] args) {

        // create a new locale
        Locale locale = new Locale("en", "US", "WIN");

        // print locale
        System.out.println("Locale:" + locale);

        // get ISO countries
        String[] countries = Locale.getISOCountries();

        // print countries
        System.out.println("Countries are:");
        for (int i = 0; i < countries.length; i++) {
            System.out.println(i + ":" + countries[i]);
        }
    }
}
