package com.serverless;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.*;

public class ResponderModel {
    private final String teamName = "Equipo1";

    public String answer(String question) {
        if ("".equals(question)) {
            return teamName;
        }
        Matcher nameMatcher = Pattern.compile(".*what is your name").matcher(question);
        if (nameMatcher.matches()) {
            return teamName;
        }
        Matcher sumMatcher = Pattern.compile(".*what is (\\d+) plus (\\d+)").matcher(question);
        if (sumMatcher.matches()) {
            return String.valueOf(Integer.parseInt(sumMatcher.group(1)) + Integer.parseInt(sumMatcher.group(2)));
        }
        Matcher maxMatcherOfTwo = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+)").matcher(question);
        if (maxMatcherOfTwo.matches()) {
            if (Integer.parseInt(maxMatcherOfTwo.group(1)) > Integer.parseInt(maxMatcherOfTwo.group(2))) {
                return String.valueOf(Integer.parseInt(maxMatcherOfTwo.group(1)));
            } else {
                return String.valueOf(Integer.parseInt(maxMatcherOfTwo.group(2)));
            }
        }
        Matcher maxMatcherOfFour = Pattern.compile(".*which of the following numbers is the largest: (\\d+), (\\d+), (\\d+), (\\d+)").matcher(question);
        if (maxMatcherOfFour.matches()) {
            int max = Integer.parseInt(maxMatcherOfFour.group(1));
            if (Integer.parseInt(maxMatcherOfFour.group(2)) > max) {
                max = Integer.parseInt(maxMatcherOfFour.group(2));
            }
            if (Integer.parseInt(maxMatcherOfFour.group(3)) > max) {
                max = Integer.parseInt(maxMatcherOfFour.group(3));
            }
            if (Integer.parseInt(maxMatcherOfFour.group(4)) > max) {
                max = Integer.parseInt(maxMatcherOfFour.group(4));
            }
            return String.valueOf(max);
            //return String.valueOf(Math.max(Integer.parseInt(maxMatcherOfTwo.group(1)),Integer.parseInt(maxMatcherOfTwo.group(2)),Integer.parseInt(maxMatcherOfTwo.group(3)),Integer.parseInt(maxMatcherOfTwo.group(4))));
        }

        Matcher multipliedMatcherOfTwo = Pattern.compile(".*what is (\\d+) multiplied by (\\d+)").matcher(question);
        if (multipliedMatcherOfTwo.matches()) {
            return String.valueOf(Integer.parseInt(multipliedMatcherOfTwo.group(1)) * Integer.parseInt(multipliedMatcherOfTwo.group(2)));
        }
        return teamName;
    }
}