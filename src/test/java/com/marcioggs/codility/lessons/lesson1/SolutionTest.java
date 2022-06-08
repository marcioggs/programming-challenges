package com.marcioggs.codility.lessons.lesson1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {

    assertEquals(0, new Solution().solution(Integer.parseInt("1", 2)));
    assertEquals(0, new Solution().solution(Integer.parseInt("0", 2)));
    assertEquals(0, new Solution().solution(Integer.parseInt("11111", 2)));
    assertEquals(0, new Solution().solution(Integer.parseInt("00000", 2)));
    assertEquals(0, new Solution().solution(Integer.parseInt("00001", 2)));
    assertEquals(0, new Solution().solution(Integer.parseInt("10000", 2)));
    assertEquals(3, new Solution().solution(Integer.parseInt("10001", 2)));
    assertEquals(3, new Solution().solution(Integer.parseInt("10001001", 2)));
    assertEquals(2, new Solution().solution(Integer.parseInt("00001001", 2)));

    assertEquals(2, new Solution().solution(9));
    assertEquals(4, new Solution().solution(529));
    assertEquals(0, new Solution().solution(15));
    assertEquals(0, new Solution().solution(32));
  }

}