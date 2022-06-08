package com.marcioggs.codility.trainings.exercise4.strsymmetrypoint;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(3, new Solution().solution("racecar"));
    assertEquals(-1, new Solution().solution("abba"));
    assertEquals(-1, new Solution().solution("abcdef"));
  }

}