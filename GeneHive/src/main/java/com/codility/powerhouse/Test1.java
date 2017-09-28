package com.codility.powerhouse;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by silvana.albert on 10/19/15.
 */
public class Test1 {

    public int solution(int Y, String A, String B, String W) {
        // write your code in Java SE 8
        Calendar startMonth = Calendar.getInstance();
        Calendar stopMonth = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("MMMM", Locale.ENGLISH);

        int fistDay = this.getFirstDayIndex(W);

        int weeksNo = -1;

        try {
            startMonth.setTime(format.parse(A));
            stopMonth.setTime(format.parse(B));
        } catch (ParseException e) {
            return weeksNo;
        }

        startMonth.set(Calendar.YEAR, Y);
        stopMonth.set(Calendar.YEAR, Y);
        stopMonth.set(Calendar.DATE, stopMonth.getActualMaximum(Calendar.DAY_OF_MONTH));

        while (startMonth.get(Calendar.DAY_OF_WEEK) != fistDay) {
            startMonth.add(Calendar.DATE, 1);
        }
        int days = daysBetween(stopMonth.getTime(),startMonth.getTime());
        while (startMonth.before(stopMonth) || (days>=0 && days<7)) {
            weeksNo++;
            startMonth.add(Calendar.DATE, 7);
            days = daysBetween(stopMonth.getTime(),startMonth.getTime());
        }
        return weeksNo;
    }
    private int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    private int getFirstDayIndex(String W){
        int firstDay = 1;
        switch (W) {
            case "Monday": {
                firstDay = 2;
                break;
            }
            case "Tuesday": {
                firstDay = 3;
                break;
            }
            case "Wednesday": {
                firstDay = 4;
                break;
            }
            case "Thursday": {
                firstDay = 5;
                break;
            }
            case "Friday": {
                firstDay = 6;
                break;
            }
            case "Saturday": {
                firstDay = 7;
                break;
            }
            case "Sunday": {
                firstDay = 1;
                break;
            }
        }
        return firstDay;
    }


    public static void main(String[] args) {
        Test1 test1 = new Test1();
        System.out.println(test1.solution(2014, "April", "May", "Sunday"));
        System.out.println(test1.solution(2015, "February", "February", "Sunday"));
        System.out.println(test1.solution(2015, "January", "December", "Thursday"));

    }
}
