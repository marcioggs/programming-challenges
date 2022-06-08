package com.marcioggs.codility.trainings.exercise3.tennistournament;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(2, new Solution().solution(5, 3));
    assertEquals(3, new Solution().solution(10, 3));
  }

}