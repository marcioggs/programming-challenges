package com.marcioggs.neetcode150.twopointers.cintainerwithmostwater;

public class BruteForceSolution {

  public int maxArea(int[] height) {
    var maxArea = 0;
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        var currentArea = Math.min(height[i], height[j]) * (j - i);
        maxArea = Math.max(maxArea, currentArea);
      }
    }
    return maxArea;
  }
}
