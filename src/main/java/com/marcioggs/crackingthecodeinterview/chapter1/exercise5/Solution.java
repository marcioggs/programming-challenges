package com.marcioggs.crackingthecodeinterview.chapter1.exercise5;

public class Solution {
    public boolean isOneEditAway(String string1, String string2) {
            if (Math.abs(string1.length() - string2.length()) > 1) {
                return false;
            }

            boolean edited = false;
            char[] shortest = string1.length() < string2.length()? string1.toCharArray() : string2.toCharArray();
            char[] largest = string2.length() > string1.length()? string2.toCharArray() : string1.toCharArray();

            for (int largestIndex = 0, shortestIndex = 0; largestIndex < largest.length; largestIndex++, shortestIndex++) {
                if (largest[largestIndex] != shortest[shortestIndex]) {
                    if (edited) {
                        return false;
                    }
                    edited = true;
                    if (largest.length != shortest.length) {
                        shortestIndex--;
                    }
                }
            }

            return true;
    }
}
