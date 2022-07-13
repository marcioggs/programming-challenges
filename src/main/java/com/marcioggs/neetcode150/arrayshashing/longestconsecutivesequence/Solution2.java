package com.marcioggs.neetcode150.arrayshashing.longestconsecutivesequence;

import java.util.HashSet;

public class Solution2 {

  public int longestConsecutive(int[] nums) {
    int best = 0;
    var numsSet = new HashSet<Integer>();

    for (int num : nums) {
      numsSet.add(num);
    }

    for (int num : numsSet) {
      if (numsSet.contains(num - 1)) {
        continue;
      }
      int count = 1;
      while (numsSet.contains(num + 1)) {
        count++;
        num++;
      }
      best = Math.max(best, count);
    }

    return best;
  }
}
