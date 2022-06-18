package com.marcioggs.neetcode150.twopointers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(true, new Solution().isPalindrome("A man, a plan, a canal: Panama"));
    assertEquals(false, new Solution().isPalindrome("race a car"));
    assertEquals(true, new Solution().isPalindrome(" "));
  }
}
