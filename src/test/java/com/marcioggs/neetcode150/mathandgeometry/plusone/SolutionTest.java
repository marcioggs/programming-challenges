package com.marcioggs.neetcode150.mathandgeometry.plusone;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void plusOne() {
    assertArrayEquals(new int[] {1, 2, 4}, new Solution().plusOne(new int[] {1, 2, 3}));
    assertArrayEquals(new int[] {4, 3, 2, 2}, new Solution().plusOne(new int[] {4, 3, 2, 1}));
    assertArrayEquals(new int[] {1, 0}, new Solution().plusOne(new int[] {9}));
    assertArrayEquals(new int[] {1, 0, 0, 0}, new Solution().plusOne(new int[] {9, 9, 9}));
  }
}
