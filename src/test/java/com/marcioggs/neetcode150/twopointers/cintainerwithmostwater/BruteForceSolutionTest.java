package com.marcioggs.neetcode150.twopointers.cintainerwithmostwater;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BruteForceSolutionTest {

  @Test
  public void maxArea() {
    assertEquals(49, new BruteForceSolution().maxArea(new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7}));
    assertEquals(1, new BruteForceSolution().maxArea(new int[] {1, 1}));
  }
}
