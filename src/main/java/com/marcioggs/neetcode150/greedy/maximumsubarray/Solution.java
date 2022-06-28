package com.marcioggs.neetcode150.greedy.maximumsubarray;

public class Solution {

  public int maxSubArray(int[] nums) {

    int maxSubArray = 0;
    boolean maxSubArrayWasInitialized = false;
    int currentMaxSubArray = 0;

    for (int num : nums) {
      currentMaxSubArray += num;

      boolean currentMaxSubArrayWasReset = false;
      if (currentMaxSubArray < 0) {
        currentMaxSubArray = 0;
        currentMaxSubArrayWasReset = true;
      }

      maxSubArray =
          Math.max(
              maxSubArrayWasInitialized ? maxSubArray : num,
              currentMaxSubArrayWasReset ? num : currentMaxSubArray);

      maxSubArrayWasInitialized = true;
    }

    return maxSubArray;
  }
}
