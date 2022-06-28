package com.marcioggs.neetcode150.greedy.maximumsubarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(4, new Solution().maxSubArray(new int[] {-1, 1, 2, 1}));
    assertEquals(
        6,
        new Solution2()
            .maxSubArray(
                new int[] {
                  -2, 1, -3, 4, -1, 2, 1, -5,
                }));
    assertEquals(
        1,
        new Solution2()
            .maxSubArray(
                new int[] {
                  1,
                }));
    assertEquals(23, new Solution().maxSubArray(new int[] {5, 4, -1, 7, 8}));
    assertEquals(-1, new Solution().maxSubArray(new int[] {-1}));
    assertEquals(-1, new Solution().maxSubArray(new int[] {-1, -10}));
  }
}
