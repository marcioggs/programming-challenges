package com.marcioggs.neetcode150.stack.carfleet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void carFleet() {
    assertEquals(6, new Solution().carFleet(10, new int[] {8,3,7,4,6,5}, new int[] {4,4,4,4,4,4}));

    assertEquals(
        3, new Solution().carFleet(12, new int[] {10, 8, 0, 5, 3}, new int[] {2, 4, 1, 1, 3}));
    assertEquals(1, new Solution().carFleet(10, new int[] {3}, new int[] {3}));
    assertEquals(1, new Solution().carFleet(100, new int[] {0, 2, 4}, new int[] {4, 2, 1}));
    assertEquals(2, new Solution().carFleet(10, new int[] {6, 8}, new int[] {3, 2}));
  }
}
