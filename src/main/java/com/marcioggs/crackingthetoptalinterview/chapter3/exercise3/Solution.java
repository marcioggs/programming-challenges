package com.marcioggs.crackingthetoptalinterview.chapter3.exercise3;

/**
 * Duplicate characters: Find the top most repeated character in a string. For instance, given a string 'hello world',
 * the top most repeated character is 'l' because it can be found 3 times in the string.
 */
public class Solution {

    public char solution(String text) {

        if (text == null) {
            return ' ';
        }

        text = text.replaceAll("[^a-z]+", "");

        if (text.length() == 0) {
            return ' ';
        }

        int[] lettersFrequency = new int[26];

        for (char letter : text.toCharArray()) {
            int letterIndex = letter - 'a';
            lettersFrequency[letterIndex]++;
        }

        int highestLetterFrequencyIndex = 0;

        for (int i = 1; i < lettersFrequency.length; i++) {
            if (lettersFrequency[i] > lettersFrequency[highestLetterFrequencyIndex]) {
                highestLetterFrequencyIndex = i;
            }
        }

        return (char) ('a' + highestLetterFrequencyIndex);
    }
}
