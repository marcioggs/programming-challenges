package com.marcioggs.neetcode150.slidingwindow.besttimetobuyandsellstock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(0, new Solution().maxProfit(new int[] {3, 2, 1}));
    assertEquals(5, new Solution().maxProfit(new int[] {7, 1, 5, 3, 6, 4}));
    assertEquals(4, new Solution().maxProfit(new int[] {1, 5}));
  }
}
