package com.marcioggs.neetcode150.mathandgeometry.happynumber;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void isHappy() {
    assertEquals(false, new Solution().isHappy(123));
    assertEquals(true, new Solution().isHappy(19));
    assertEquals(false, new Solution().isHappy(2));
  }
}