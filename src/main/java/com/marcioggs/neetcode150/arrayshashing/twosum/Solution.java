package com.marcioggs.neetcode150.arrayshashing.twosum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  // time complexity: o(n*logn)
  // space complexity: o(n)
  public int[] twoSum(int[] nums, int target) {

    int[] sortedNums = nums.clone();
    Arrays.sort(sortedNums);
    List<Integer> numsAsList = Arrays.stream(nums).boxed().collect(Collectors.toList());

    for (int i = 0; i < nums.length - 1; i++) {
      int difference = target - nums[i];
      int foundIndex = Arrays.binarySearch(sortedNums, difference);
      if (foundIndex >= 0) {
        if (nums[i] == difference) {
          int secondOccurrenceIndex = numsAsList.subList(i + 1, nums.length).indexOf(nums[i]);
          if (secondOccurrenceIndex >= 0) {
            return new int[] {i, secondOccurrenceIndex + i + 1};
          }
        } else {
          return new int[] {i, numsAsList.indexOf(difference)};
        }
      }
    }

    // Should never reach this line due to the constraints
    return null;
  }
}
