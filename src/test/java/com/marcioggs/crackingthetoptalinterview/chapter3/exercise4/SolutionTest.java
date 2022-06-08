package com.marcioggs.crackingthetoptalinterview.chapter3.exercise4;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertTrue(new Solution().areBracketsBalanced("([4*{2+3}])"));
    assertFalse(new Solution().areBracketsBalanced("{[3}"));
    assertFalse(new Solution().areBracketsBalanced("{[])"));
    assertFalse(new Solution().areBracketsBalanced("]["));
  }

}