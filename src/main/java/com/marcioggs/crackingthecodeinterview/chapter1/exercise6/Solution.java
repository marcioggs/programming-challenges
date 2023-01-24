package com.marcioggs.crackingthecodeinterview.chapter1.exercise6;

public class Solution {
    public String compress(String text) {
        if (text == null) {
            return null;
        }
        char[] chars = text.toCharArray();

        int currentCharCount = 0;
        StringBuilder compressed = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (currentCharCount == 0) {
                compressed.append(chars[i]);
            }
            currentCharCount++;
            if (i == chars.length - 1 || chars[i] != chars[i + 1]) {
                compressed.append(currentCharCount);
                currentCharCount = 0;
            }
        }

        return compressed.toString().length() < text.length()? compressed.toString() : text;
    }
}
