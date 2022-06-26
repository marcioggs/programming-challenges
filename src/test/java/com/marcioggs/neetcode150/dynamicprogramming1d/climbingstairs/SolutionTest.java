package com.marcioggs.neetcode150.dynamicprogramming1d.climbingstairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(2, new Solution().climbStairs(2));
    assertEquals(3, new Solution().climbStairs(3));
    assertEquals(8, new Solution().climbStairs(5));
  }
}
