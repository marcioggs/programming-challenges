package com.marcioggs.crackingthecodeinterview.chapter1.exercuise9;

public class Solution {

    public boolean isRotation(String s1, String s2) {
        return s1 != null && s2 != null &&
                s1.length() == s2.length() &&
                isSubstring(s1 + s1, s2);
    }

    private boolean isSubstring(String complete, String partial) {
        return complete.contains(partial);
    }
}
