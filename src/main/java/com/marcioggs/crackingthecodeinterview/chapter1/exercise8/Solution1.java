package com.marcioggs.crackingthecodeinterview.chapter1.exercise8;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public void zeroMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        for (int row : rows) {
            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }

        for (int col : cols) {
            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}
