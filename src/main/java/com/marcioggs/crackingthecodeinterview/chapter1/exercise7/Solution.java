package com.marcioggs.crackingthecodeinterview.chapter1.exercise7;

public class Solution {

    public int[][] rotate90(int[][] source) {
        if (source == null) {
            return null;
        }
        int n = source.length;

        int[][] target = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                target[j][n - 1 - i] = source[i][j];
            }
        }

        return target;
    }
}
