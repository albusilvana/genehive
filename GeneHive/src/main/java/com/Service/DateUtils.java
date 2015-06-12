package com.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by silvana.albert on 5/23/15.
 */
public class DateUtils {


    public static int getAgeFromMilliseconds(String millisecond) {
        // create a calendar
        Calendar cal = Calendar.getInstance();

        cal.setTimeInMillis(Integer.parseInt(millisecond));

        Calendar calNow = Calendar.getInstance();
        calNow.setTime(new java.util.Date());
//calculate age in years.
        int ageYr = (calNow.get(Calendar.YEAR) - cal.get(Calendar.YEAR));
// calculate additional age in months, possibly adjust years.
        int ageMo = (calNow.get(Calendar.MONTH) - cal.get(Calendar.MONTH));
        if (ageMo < 0) {
//adjust years by subtracting one
            ageYr--;
        }
        return ageYr;
    }

    public static int getAge(Date date) {
        // create a calendar
        Calendar cal = Calendar.getInstance();

        cal.setTime(date);

        Calendar calNow = Calendar.getInstance();
        calNow.setTime(new java.util.Date());
//calculate age in years.
        int ageYr = (calNow.get(Calendar.YEAR) - cal.get(Calendar.YEAR));
// calculate additional age in months, possibly adjust years.
        int ageMo = (calNow.get(Calendar.MONTH) - cal.get(Calendar.MONTH));
        if (ageMo < 0) {
//adjust years by subtracting one
            ageYr--;
        }
        return ageYr;
    }

    public static void main(String[] args) {
        System.out.print(DateUtils.getAgeFromMilliseconds("1428670355"));
    }

}
