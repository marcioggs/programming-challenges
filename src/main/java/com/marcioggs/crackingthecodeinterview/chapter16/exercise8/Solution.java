package com.marcioggs.crackingthecodeinterview.chapter16.exercise8;

import java.text.MessageFormat;
import java.util.*;

public class Solution {

    private static Map<Integer, String> names = getNames();
    private static Map<Integer, String> teens = getTeens();
    private static Map<Integer, String> tens = getTens();
    private static Map<Integer, String> suffixes = getSuffixes();

    private static Map<Integer, String> getNames() {
        Map<Integer, String> names = new HashMap<>();

        names.put(1, "One");
        names.put(2, "Two");
        names.put(3, "Three");
        names.put(4, "Four");
        names.put(5, "Five");
        names.put(6, "Six");
        names.put(7, "Seven");
        names.put(8, "Eight");
        names.put(9, "Nine");

        return names;
    }

    private static Map<Integer, String> getTeens() {
        Map<Integer, String> teens = new HashMap<>();

        teens.put(10, "Ten");
        teens.put(11, "Eleven");
        teens.put(12, "Twelve");
        teens.put(13, "Thirteen");
        teens.put(14, "Fourteen");
        teens.put(15, "Fifteen");
        teens.put(16, "Sixteen");
        teens.put(17, "Seventeen");
        teens.put(18, "Eighteen");
        teens.put(19, "Nineteen");

        return teens;
    }

    private static Map<Integer, String> getTens() {
        Map<Integer, String> tens = new HashMap<>();

        tens.put(2, "Twenty");
        tens.put(3, "Thirty");
        tens.put(4, "Forty");
        tens.put(5, "Fifty");
        tens.put(6, "Sixty");
        tens.put(7, "Seventy");
        tens.put(8, "Eighty");
        tens.put(9, "Ninety");

        return tens;
    }

    private static Map<Integer, String> getSuffixes() {
        Map<Integer, String> suffixes = new HashMap<>();

        suffixes.put(4, "Thousand");
        suffixes.put(7, "Million");
        suffixes.put(10, "Billion");
        suffixes.put(13, "Trillion");
        suffixes.put(16, "Quadrillion");
        suffixes.put(19, "Quintillion");

        return suffixes;
    }

    public String getEnglishInt(int number) {
        StringBuilder englishInt = new StringBuilder();

        int currentNumber = number;
        int category = 0;
        int previousDigit = 0;

        while (currentNumber != 0) {
            int digit = currentNumber % 10;
            category++;

            if (digit == 0) {
                currentNumber /= 10;
                continue;
            }

            if (englishInt.length() > 0) {
                englishInt.insert(0, " ");
            }

            if (category % 3 == 2) {
                if (digit == 1) {
                    int deleteUntil = category == 2? englishInt.length() : englishInt.indexOf(" ", 1);
                    englishInt.delete(0,  deleteUntil);
                    englishInt.insert(0, teens.get((digit * 10 + previousDigit) % 20));
                } else {
                    englishInt.insert(0, tens.get(digit));
                }
            } else {
                if (category >= 22) {
                    throw new RuntimeException(MessageFormat.format("Suffix for category {0} was not found.", category));
                }
                String suffix = suffixes.get(category);
                if (suffix != null) {
                    englishInt.insert(0, " " + suffix);
                }
                if (category % 3 == 0) {
                   englishInt.insert(0, " Hundred");
                }
                englishInt.insert(0, names.get(digit));
            }

            currentNumber /= 10;
            previousDigit = digit;
        }

        if (number < 0) {
            englishInt.insert(0, "Minus ");
        }

        return englishInt.length() == 0? "Zero" : englishInt.toString();
    }

}
