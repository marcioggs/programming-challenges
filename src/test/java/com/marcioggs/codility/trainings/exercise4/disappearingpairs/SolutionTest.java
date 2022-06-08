package com.marcioggs.codility.trainings.exercise4.disappearingpairs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals("AC", new Solution().solution("ACCAABBC"));
    assertEquals("", new Solution().solution("ABCBBCBA"));
  }

}