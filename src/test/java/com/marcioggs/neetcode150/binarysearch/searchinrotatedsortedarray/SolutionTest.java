package com.marcioggs.neetcode150.binarysearch.searchinrotatedsortedarray;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void search() {
    assertEquals(4, new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 0));
    assertEquals(-1, new Solution().search(new int[] {4, 5, 6, 7, 0, 1, 2}, 3));
    assertEquals(-1, new Solution().search(new int[] {1}, 0));
    assertEquals(4, new Solution().search(new int[] {4, 5, 6, 7, 8, 1, 2, 3}, 8));
    assertEquals(1, new Solution().search(new int[] {1, 3}, 3));
  }
}
