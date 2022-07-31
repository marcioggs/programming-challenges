package com.marcioggs.neetcode150.binarysearch.searchinrotatedsortedarray;

public class Solution {

  public int search(int[] nums, int target) {
    var left = 0;
    var right = nums.length - 1;

    while (left <= right) {
      var mid = (left + right) / 2;
      if (target == nums[mid]) {
        return mid;
      }
      if (nums[mid] < nums[right]) {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      } else {
        if (target < nums[mid] && target >= nums[left]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      }
    }

    return -1;
  }
}
