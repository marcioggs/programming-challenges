package com.marcioggs.codility.trainings.exercise2.rectanglebuildergreaterarea;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(2, new Solution().solution(new int[]{1, 2, 5, 1, 1, 2, 3, 5, 1}, 5));
    assertEquals(0, new Solution().solution(new int[]{}, 5));
    assertEquals(0, new Solution().solution(new int[]{1, 2}, 5));
    assertEquals(0, new Solution().solution(new int[]{1, 2, 2}, 5));
    assertEquals(1, new Solution().solution(new int[]{2, 2, 2, 2}, 1));
    assertEquals(3, new Solution().solution(new int[]{2, 2, 2, 2, 2, 4, 4, 4, 4}, 1));
    assertEquals(0, new Solution().solution(new int[]{5, 5, 3, 3}, 16));
    assertEquals(1, new Solution().solution(new int[]{5, 5, 3, 3}, 15));
  }
}