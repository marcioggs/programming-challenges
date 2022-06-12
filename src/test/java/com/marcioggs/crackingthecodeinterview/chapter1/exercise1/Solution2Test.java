package com.marcioggs.crackingthecodeinterview.chapter1.exercise1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Solution2Test {

  @Test
  public void test() {
    assertTrue(new Solution2().isUnique("a"));
    assertTrue(new Solution2().isUnique("abc"));
    assertFalse(new Solution2().isUnique("abca"));
    assertFalse(new Solution2().isUnique("aaa"));
  }
}
