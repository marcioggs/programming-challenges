package com.marcioggs.neetcode150.heappriorityqueue.laststoneweight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(1, new Solution().lastStoneWeight(new int[] {2, 7, 4, 1, 8, 1}));
    assertEquals(0, new Solution().lastStoneWeight(new int[] {2, 2}));
  }
}
