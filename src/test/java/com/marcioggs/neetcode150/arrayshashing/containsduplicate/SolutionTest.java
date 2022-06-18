package com.marcioggs.neetcode150.arrayshashing.containsduplicate;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(true, new Solution().containsDuplicate(new int[] {1, 2, 3, 1}));
    assertEquals(false, new Solution().containsDuplicate(new int[] {1, 2, 3, 4}));
    assertEquals(true, new Solution().containsDuplicate(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
  }
}
