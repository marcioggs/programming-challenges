package com.marcioggs.crackingthecodeinterview.chapter1.exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertTrue(new Solution().solution("Tact Coa"));
    assertTrue(new Solution().solution(""));
    assertTrue(new Solution().solution("aaabaaa"));
    assertTrue(new Solution().solution("aa ab a aa"));
    assertTrue(new Solution().solution("aaabbaaa"));
  }
}