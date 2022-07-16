package com.marcioggs.neetcode150.twopointers.twosumtwo;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void twoSum() {
    assertArrayEquals(new int[] {1, 2}, new Solution().twoSum(new int[] {2, 7, 11, 15}, 9));
    assertArrayEquals(new int[] {1, 3}, new Solution().twoSum(new int[] {2, 3, 4}, 6));
    assertArrayEquals(new int[] {1, 2}, new Solution().twoSum(new int[] {-1, 0}, -1));
  }
}
