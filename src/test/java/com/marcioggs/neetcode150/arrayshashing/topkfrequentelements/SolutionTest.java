package com.marcioggs.neetcode150.arrayshashing.topkfrequentelements;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void topKFrequent() {
    assertArrayEquals(
        new int[] {1, 2}, new Solution().topKFrequent(new int[] {1, 1, 1, 2, 2, 3}, 2));
    assertArrayEquals(new int[] {1}, new Solution().topKFrequent(new int[] {1}, 1));
  }
}
