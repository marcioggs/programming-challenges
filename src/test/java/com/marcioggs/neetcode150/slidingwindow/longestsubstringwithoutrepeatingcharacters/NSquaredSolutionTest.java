package com.marcioggs.neetcode150.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import static org.junit.Assert.*;

import org.junit.Test;

public class NSquaredSolutionTest {

  @Test
  public void lengthOfLongestSubstring() {
    assertEquals(1, new NSquaredSolution().lengthOfLongestSubstring("bbbbb"));
    assertEquals(3, new NSquaredSolution().lengthOfLongestSubstring("pwwkew"));
    assertEquals(5, new NSquaredSolution().lengthOfLongestSubstring("tmmzuxt"));
    assertEquals(3, new NSquaredSolution().lengthOfLongestSubstring("abcabcbb"));
  }
}