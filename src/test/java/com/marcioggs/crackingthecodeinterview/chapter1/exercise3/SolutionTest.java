package com.marcioggs.crackingthecodeinterview.chapter1.exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals("Mr%20John%20Smith", new Solution().solution("Mr John Smith    ", 13));
    assertEquals("", new Solution().solution("", 0));
    assertEquals("a%20%20b", new Solution().solution("a  b    ", 4));
    assertEquals("%20a", new Solution().solution(" a  ", 2));
  }
}
