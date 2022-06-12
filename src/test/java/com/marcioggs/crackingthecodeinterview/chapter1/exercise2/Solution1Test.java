package com.marcioggs.crackingthecodeinterview.chapter1.exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Solution1Test {

  @Test
  public void test() {
    assertTrue(new Solution1().isPermutation("abc", "cba"));
    assertTrue(new Solution1().isPermutation("aaa", "aaa"));
    assertTrue(new Solution1().isPermutation("a", "a"));
    assertTrue(new Solution1().isPermutation("abc", "abc"));
    assertFalse(new Solution1().isPermutation("abc", "aaa"));
    assertFalse(new Solution1().isPermutation("abc", "abca"));
    assertFalse(new Solution1().isPermutation("abca", "abc"));
  }
}
