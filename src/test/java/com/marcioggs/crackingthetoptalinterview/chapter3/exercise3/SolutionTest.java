package com.marcioggs.crackingthetoptalinterview.chapter3.exercise3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(' ', new Solution().solution(""));
    assertEquals(' ', new Solution().solution(null));
    assertEquals(' ', new Solution().solution("123"));

    assertEquals('a', new Solution().solution("123aaabb"));
    assertEquals('l', new Solution().solution("hello world"));
    assertEquals('a', new Solution().solution("aaaaabbbb"));

    assertEquals('a',
        new Solution().solution("cccaaabbb")); // returns the first letter alphabetically on tie
    assertEquals('z', new Solution().solution("yyyyzzzzzzxxxx"));
  }

  public void unimplementedCases() {
    assertEquals('l', new Solution().solution("HELLO WORLD")); // Upper case
  }
}