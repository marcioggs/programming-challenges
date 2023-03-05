package com.marcioggs.crackingthecodeinterview.chapter1.exercise8;

import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    @Test
    public void zeroMatrix() {
        int[][] matrix = new int[][] {{0, 2, 3}, {4, 5, 6}, {7, 0, 9}, {10, 11, 12}};
        int[][] expected = new int[][] {{0, 0, 0}, {0, 0, 6}, {0, 0, 0}, {0, 0, 12}};

        new Solution2().zeroMatrix(matrix);

        assertArrayEquals(expected, matrix);
    }
}