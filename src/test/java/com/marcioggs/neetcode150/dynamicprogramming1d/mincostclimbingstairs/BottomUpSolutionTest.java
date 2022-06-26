package com.marcioggs.neetcode150.dynamicprogramming1d.mincostclimbingstairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BottomUpSolutionTest {

  @Test
  public void test() {
    assertEquals(15, new BottomUpSolution().minCostClimbingStairs(new int[] {10, 15, 20}));
    assertEquals(
        6,
        new BottomUpSolution()
            .minCostClimbingStairs(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
  }
}
