package com.marcioggs.codility.trainings.exercise5.paritydegree;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(3, new Solution().solution(24));
    assertEquals(3, new Solution().solution(8));
    assertEquals(0, new Solution().solution(9));
    assertEquals(0, new Solution().solution(-5));
  }
}