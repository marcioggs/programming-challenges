package com.marcioggs.crackingthecodeinterview.chapter10.exercise2;

import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        String[] words = new String[] {"aabb", "aacc", "bbaa", "ccaa"};
        new Solution1().groupAnagrams(words);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public void groupAnagrams(String[] words) {
        Arrays.sort(words, new AnagramComparator());
    }

    private static class AnagramComparator implements Comparator<String> {
        public int compare(String word1, String word2) {
            return getSortedLetters(word1).compareTo(getSortedLetters(word2));
        }

        private String getSortedLetters(String word) {
            char[] sortedLetters = word.toCharArray();
            Arrays.sort(sortedLetters);
            return Arrays.toString(sortedLetters);
        }
    }
}