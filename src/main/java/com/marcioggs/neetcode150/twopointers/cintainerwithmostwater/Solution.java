package com.marcioggs.neetcode150.twopointers.cintainerwithmostwater;

public class Solution {

  public int maxArea(int[] height) {
    var maxArea = 0;

    var left = 0;
    var right = height.length - 1;

    while (left < right) {
      var currentArea = Math.min(height[left], height[right]) * (right - left);
      maxArea = Math.max(maxArea, currentArea);

      if (height[left] > height[right]) {
        right--;
      } else {
        left++;
      }
    }

    return maxArea;
  }
}
