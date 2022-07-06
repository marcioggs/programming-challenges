package com.marcioggs.neetcode150.bitmanipulation.numberofonebits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void hammingWeight() {
    assertEquals(
        31, new Solution().hammingWeight(-3));
    assertEquals(
        3, new Solution().hammingWeight(Integer.parseInt("00000000000000000000000000001011", 2)));
    assertEquals(
        1, new Solution().hammingWeight(Integer.parseInt("00000000000000000000000010000000", 2)));

  }
}
