package com.marcioggs.crackingthecodeinterview.chapter1.exercise2;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Solution2Test {

  @Test
  public void test() {
    assertTrue(new Solution2().isPermutation("aaa", "aaa"));
    assertTrue(new Solution2().isPermutation("abc", "cba"));
    assertTrue(new Solution2().isPermutation("a", "a"));
    assertTrue(new Solution2().isPermutation("abc", "abc"));
    assertFalse(new Solution2().isPermutation("abc", "aaa"));
    assertFalse(new Solution2().isPermutation("abc", "abca"));
    assertFalse(new Solution2().isPermutation("abca", "abc"));
  }
}
