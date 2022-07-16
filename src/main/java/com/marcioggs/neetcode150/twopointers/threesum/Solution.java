package com.marcioggs.neetcode150.twopointers.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public static void main(String[] args) {
    List<List<Integer>> lists = new Solution().threeSum(new int[] {0, 0, 0, 0});
    // List<List<Integer>> lists = new Solution().threeSum(new int[] {-1, 0, 1, 2, -1, -4});
    System.out.println(lists);
  }

  public List<List<Integer>> threeSum(int[] nums) {
    var result = new ArrayList<List<Integer>>();
    var sortedNums = Arrays.stream(nums).sorted().toArray(); // n logn

    for (int i = 0; i < sortedNums.length - 2; i++) { // n
      if (i > 0 && sortedNums[i - 1] == sortedNums[i]) {
        continue;
      }
      twoSum(sortedNums, i + 1, -sortedNums[i], result);
    }

    return result;
  }

  private void twoSum(
      int[] sortedNums, int beginIndex, int target, ArrayList<List<Integer>> result) {
    var low = beginIndex;
    var high = sortedNums.length - 1;

    while (low < high) {
      if (low > beginIndex && sortedNums[low - 1] == sortedNums[low]) {
        low++;
        continue;
      }
      if (sortedNums[low] + sortedNums[high] == target) {
        result.add(Arrays.asList(-target, sortedNums[low], sortedNums[high]));
        low++;
      } else if (sortedNums[low] + sortedNums[high] > target) {
        high--;
      } else {
        low++;
      }
    }
  }
}
