package com.marcioggs.neetcode150.stack.daiytemperatures;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void dailyTemperatures() {

    assertArrayEquals(
        new int[] {1, 1, 4, 2, 1, 1, 0, 0},
        new Solution().dailyTemperatures(new int[] {73, 74, 75, 71, 69, 72, 76, 73}));
    assertArrayEquals(
        new int[] {1, 1, 1, 0}, new Solution().dailyTemperatures(new int[] {30, 40, 50, 60}));
    assertArrayEquals(
        new int[] {1, 1, 0}, new Solution().dailyTemperatures(new int[] {30, 60, 90}));
  }
}
