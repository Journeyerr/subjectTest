package com.showmebug.demo.util;

import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Collectors;

public class TestUtil {



    public static void main(String[] args) {


        boolean test3 = test3("javscripts", "javascript");
        boolean test3_1 = test3("scriptingjava", "javascript");
//        String this_is_another_test = sbuject2(123456789);
//        String this_is_another_test = sbuject1("This is another test");

        System.out.println(test3);
        System.out.println(test3_1);

    }

    public static Boolean test3(String s1, String s2) {

//        boolean test3 = test3("rkqodlw", "world");
//        boolean test3 = test3("katas", "steak");

        if (Objects.isNull(s1) || Objects.isNull(s2)) {
            return false;
        }

        for (int i = 0; i < s2.length(); i++) {
            if (s1.indexOf(s2.charAt(i)) < 0) {
                return false;
            }
            s1 = s1.replaceFirst(String.valueOf(s2.charAt(i)), "");
        }

        return true;
    }



    public static String test2(int number) {

//        String test2 = test2(123456789);

        return String.valueOf(number)
                .chars()
                .mapToObj( v -> String.valueOf(Character.getNumericValue(v)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining());
    }



    public static String test1(String s) {

//        String test1 = test1("This is another test");

        String[] s1 = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (String s2 : s1) {
            if (s2.length() > 5) {
                s2 = new StringBuilder(s2).reverse().toString();
            }
            stringBuilder.append(s2).append(" ");
        }

        return stringBuilder.toString();
    }


}
