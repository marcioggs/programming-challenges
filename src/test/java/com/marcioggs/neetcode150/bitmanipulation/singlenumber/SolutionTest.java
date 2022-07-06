package com.marcioggs.neetcode150.bitmanipulation.singlenumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void singleNumber() {
    assertEquals(1, new Solution().singleNumber(new int[] {2, 2, 1}));
    assertEquals(4, new Solution().singleNumber(new int[] {4, 1, 2, 1, 2}));
    assertEquals(1, new Solution().singleNumber(new int[] {1}));
  }
}
