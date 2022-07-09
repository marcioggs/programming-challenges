package com.marcioggs.neetcode150.arrayshashing.productofarrayexceptself;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void productExceptSelf() {
    assertArrayEquals(
        new int[] {24, 12, 8, 6}, new Solution().productExceptSelf(new int[] {1, 2, 3, 4}));
    assertArrayEquals(
        new int[] {0, 0, 9, 0, 0}, new Solution().productExceptSelf(new int[] {-1, 1, 0, -3, 3}));
  }
}
