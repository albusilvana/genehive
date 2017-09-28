package com.StringProcessing;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by silvana.albert on 10/26/15.
 */
public class Test1 {
    public static void main(String[] args) {
        String str = "DoDELIMNotDELIMDoDELIMThis";
        StringTokenizer st = new StringTokenizer(str, "DELIM");
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            System.out.println(s + " , ");

        }
        System.out.printf("%1$s %2$s %s", "A", "B", "C");
        String s = "o brother, where art thou! boo man!";
        String rex = "b";
        String replace = "b";
        Pattern p = Pattern.compile(rex);
        Matcher m = p.matcher(s);
        boolean b = false;
        while (b = m.find()) {
            System.out.println(m.start());
        }

        String val = m.replaceAll(replace);
        System.out.println(val);


        System.out.printf("\"%-5c\"", 'c');
//        System.out.printf("\"%+0d\"",100);
        System.out.printf("\"$%(,9.2f\"", -1222.2);
        System.out.printf("%b", 100);
        System.out.printf("\"%c\"", new Character('d'));
        System.out.printf("%s", new Object());
//        System.out.printf("\"%f\"", -100);


        System.out.printf("%1$s %s %<s", "A", "B", "C");
        String[] ss = "1 dan 2 dave 3 dick".split("\\d");
        System.out.println();
        System.out.println("name:jhon;;sex:m;;".split(";"));
        System.out.println(new Boolean("1"));
        System.out.println( new Boolean("t"));
        System.out.println(new Boolean("TrUe"));

        String str1 = "tokens\twith tabs and \r\nnew lines.";
        StringTokenizer stringTokenizer = new StringTokenizer(str1);
        System.out.print(stringTokenizer.countTokens());
        System.out.printf("%b", "false");

    }
}
