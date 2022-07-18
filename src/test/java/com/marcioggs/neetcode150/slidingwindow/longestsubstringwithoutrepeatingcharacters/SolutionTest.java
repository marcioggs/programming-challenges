package com.marcioggs.neetcode150.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void lengthOfLongestSubstring() {
    assertEquals(6, new Solution().lengthOfLongestSubstring("zabazdef"));
    assertEquals(3, new Solution().lengthOfLongestSubstring("abcabcbb"));
    assertEquals(3, new Solution().lengthOfLongestSubstring("pwwkew"));
    assertEquals(5, new Solution().lengthOfLongestSubstring("tmmzuxt"));
    assertEquals(1, new Solution().lengthOfLongestSubstring("bbbbb"));
  }
}
