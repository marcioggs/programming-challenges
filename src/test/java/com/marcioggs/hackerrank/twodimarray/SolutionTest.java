package com.marcioggs.hackerrank.twodimarray;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class SolutionTest
{
    @Test
    public void testCase0() {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                       {0, 1, 0, 0, 0, 0},
                       {1, 1, 1, 0, 0, 0},
                       {0, 0, 2, 4, 4, 0},
                       {0, 0, 0, 2, 0, 0},
                       {0, 0, 1, 2, 4, 0}};

        assertEquals(19, Solution.hourglassSum(arr));
    }

    @Test
    public void testCase1() {
        int[][] arr = {{1, 1, 1, 0, 0, 0},
                       {0, 1, 0, 0, 0, 0},
                       {1, 1, 1, 0, 0, 0},
                       {0, 9, 2, -4, -4, 0},
                       {0, 0, 0, - 2, 0, 0},
                       {0, 0, -1, -2, -4, 0}};

        assertEquals(13, Solution.hourglassSum(arr));
    }

    @Test
    public void testCase5() {
        int[][] arr = {{-1, -1, +0, -9, -2, -2},
                       {-2, -1, -6, -8, -2, -5},
                       {-1, -1, -1, -2, -3, -4},
                       {-1, -9, -2, -4, -4, -5},
                       {-7, -3, -3, -2, -9, -9},
                       {-1, -3, -1, -2, -4, -5}};

        assertEquals(-6, Solution.hourglassSum(arr));
    }
}
