package com.marcioggs.neetcode150.binarysearch.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(4, new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 9));
    assertEquals(0, new Solution().search(new int[] {1}, 1));
    assertEquals(-1, new Solution().search(new int[] {1}, 2));
    assertEquals(-1, new Solution().search(new int[] {-1, 0, 3, 5, 9, 12}, 2));
  }
}
