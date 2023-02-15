package com.marcioggs.crackingthecodeinterview.chapter10.exercise2;

import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        String[] words = new String[] {"aabb", "aacc", "bbaa", "ccaa"};
        System.out.println(new Solution2().groupAnagrams(words));
    }

    public List<String> groupAnagrams(String[] words) {

        Map<String, List<String>> anagramsGroupedBySortedWord = new HashMap<>();

        for (String word : words) {
            anagramsGroupedBySortedWord.computeIfAbsent(sortWord(word), key -> new ArrayList<>()).add(word);
        }

        List<String> groupedAnagrams = new ArrayList<>();

        anagramsGroupedBySortedWord.forEach((String key, List<String> value) -> groupedAnagrams.addAll(value));

        return groupedAnagrams;
    }

    private String sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}