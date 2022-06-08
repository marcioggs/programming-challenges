package com.marcioggs.codility.trainings.exercise1.longestpassword;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void getLongestValidPasswordLength() {
    assertEquals(7, new Solution().getLongestValidPasswordLength("test 5 a0A pass007 ?xy1"));
  }

  @Test
  public void shouldIgnoreStringsWithNonAlphanumericalChars() {
    assertEquals(7,
        new Solution().getLongestValidPasswordLength("test 5 a0A pass007 ?xy1aaaaaaaaa"));
  }

  @Test
  public void shouldIgnoreStringsWithOddNumberOfLetters() {
    assertEquals(7,
        new Solution().getLongestValidPasswordLength("test 5 a0A pass007 aaaaaaaaaaaaa"));
  }

  @Test
  public void shouldIgnoreStringsWithEvenNumberOfDigits() {
    assertEquals(7,
        new Solution().getLongestValidPasswordLength("test 5 a0A pass007 111111111111"));
  }

  @Test
  public void shouldReturnMinusOneIfNoValidPassword() {
    assertEquals(-1, new Solution().getLongestValidPasswordLength("?aaa ?bbb"));
  }
}