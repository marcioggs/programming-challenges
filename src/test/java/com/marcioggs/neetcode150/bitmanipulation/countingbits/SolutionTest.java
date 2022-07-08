package com.marcioggs.neetcode150.bitmanipulation.countingbits;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void countBits() {
    assertArrayEquals(new int[] {0, 1, 1}, new Solution().countBits(2));
    assertArrayEquals(new int[] {0, 1, 1, 2, 1, 2}, new Solution().countBits(5));
  }
}
