package com.marcioggs.crackingthecodeinterview.chapter1.exercise7;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void rotate902x2() {
        int[][] given = new int[][] {{1, 2}, {3, 4}};
        int[][] expected = new int[][] {{3, 1}, {4, 2}};

        int[][] actual = new Solution().rotate90(given);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void rotate903x3() {
        int[][] given = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = new int[][] {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        int[][] actual = new Solution().rotate90(given);

        assertArrayEquals(expected, actual);
    }
}