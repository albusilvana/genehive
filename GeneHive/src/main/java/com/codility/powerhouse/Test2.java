package com.codility.powerhouse;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by silvana.albert on 10/19/15.
 */

class SolutionIter implements Iterable<Integer> {
    List<Integer> results = new ArrayList<>();

    public SolutionIter(Reader inp) {
        BufferedReader bufferedReader = new BufferedReader(inp);
        String line;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    Integer currentInt = Integer.parseInt(line.trim());
                    if (currentInt >= -1000000000 && currentInt <= 1000000000)
                        results.add(currentInt);
                } catch (NumberFormatException e) {
                   // ignored and moves to the next line
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Iterator<Integer> iterator() {
        return results.iterator();
    }
}


public class Test2 {


    public static void main(String[] args) {

        String line;
        InputStreamReader isr = null;
        try {
            InputStream fis = new FileInputStream("/Users/salbu/Desktop/itshappening/GeneHive/src/main/java/com/codility/powerhouse/test");
            isr = new InputStreamReader(fis, Charset.forName("UTF-8"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Integer x : new SolutionIter(isr)) {
            System.out.println(x);
        }

//        [137, -104, 0, 1, 0, -1]

    }
}
