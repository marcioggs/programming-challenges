package com.marcioggs.crackingthecodeinterview.chapter1.exercise1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Solution1Test {

  @Test
  public void test() {
    assertTrue(new Solution1().isUnique("a"));
    assertTrue(new Solution1().isUnique("abc"));
    assertFalse(new Solution1().isUnique("abca"));
    assertFalse(new Solution1().isUnique("aaa"));
  }
}
