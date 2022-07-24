package com.marcioggs.neetcode150.binarysearch.searcha2dmatrix;

public class Solution {

  public boolean searchMatrix(int[][] matrix, int target) {

    var lines2d = matrix.length;
    var cols2d = matrix[0].length;
    var cells = lines2d * cols2d;
    var low1d = 0;
    var high1d = cells - 1;

    while (low1d <= high1d) {
      int mid1d = low1d + ((high1d - low1d) / 2);
      int[] mid2d = map(cols2d, mid1d);
      var element = matrix[mid2d[0]][mid2d[1]];
      if (element == target) {
        return true;
      }
      if (element < target) {
        low1d = mid1d + 1;
      } else {
        high1d = mid1d - 1;
      }
    }

    return false;
  }

  private int[] map(int cols, int index) {
    return new int[] {index / cols, index % cols};
  }
}
