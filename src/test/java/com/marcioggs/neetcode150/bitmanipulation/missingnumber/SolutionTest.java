package com.marcioggs.neetcode150.bitmanipulation.missingnumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void missingNumber() {
    assertEquals(2, new Solution().missingNumber(new int[] {3, 0, 1}));
    assertEquals(2, new Solution().missingNumber(new int[] {0, 1}));
    assertEquals(8, new Solution().missingNumber(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}));
  }
}
