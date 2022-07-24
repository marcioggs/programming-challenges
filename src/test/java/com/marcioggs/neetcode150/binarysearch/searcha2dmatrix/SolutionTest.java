package com.marcioggs.neetcode150.binarysearch.searcha2dmatrix;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void searchMatrix() {

    assertEquals(
        true,
        new Solution()
            .searchMatrix(new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
    assertEquals(
        false,
        new Solution()
            .searchMatrix(new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
  }
}
