package com.marcioggs.neetcode150.arrayshashing.longestconsecutivesequence;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Solution2Test {

  @Test
  public void longestConsecutive() {
    assertEquals(
        4,
        new Solution2()
            .longestConsecutive(
                new int[] {-7, -1, 3, -9, -4, 7, -3, 2, 4, 9, 4, -9, 8, -7, 5, -1, -7}));
    assertEquals(7, new Solution2().longestConsecutive(new int[] {1, 2, 3, 5, 6, 7, 4}));
    assertEquals(7, new Solution2().longestConsecutive(new int[] {5, 6, 7, 1, 2, 3, 4}));
    assertEquals(4, new Solution2().longestConsecutive(new int[] {100, 4, 200, 1, 3, 2}));
    assertEquals(9, new Solution2().longestConsecutive(new int[] {0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));
    assertEquals(4, new Solution2().longestConsecutive(new int[] {9, 8, 6, 7}));
  }
}
