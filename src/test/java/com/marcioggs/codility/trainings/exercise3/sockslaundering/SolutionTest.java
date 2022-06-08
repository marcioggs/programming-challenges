package com.marcioggs.codility.trainings.exercise3.sockslaundering;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(2, new Solution().solution(10, new int[]{}, new int[]{1, 1, 2, 2, 3}));
    assertEquals(2, new Solution().solution(10, new int[]{5}, new int[]{1, 1, 2, 2, 3}));
    assertEquals(2, new Solution().solution(10, new int[]{1, 1, 2, 2, 3}, new int[]{}));
    assertEquals(2, new Solution().solution(2, new int[]{1, 1, 2, 2, 3}, new int[]{5}));
    assertEquals(3, new Solution().solution(3, new int[]{1, 1, 1, 1, 1}, new int[]{1}));
    assertEquals(1, new Solution().solution(2, new int[]{1}, new int[]{1, 2, 2, 2, 2, 2}));
    assertEquals(1,
        new Solution().solution(2, new int[]{}, new int[]{1, 1, 2, 2, 2, 2, 2, 2, 3, 3}));
  }
}