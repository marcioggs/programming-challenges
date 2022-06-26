package com.marcioggs.neetcode150.dynamicprogramming1d.climbingstairs;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  private final Map<Integer, Integer> cachedResults = new HashMap<>();

  public int climbStairs(int target) {

    return this.climbStairs(0, target);
  }

  private int climbStairs(int n, int target) {

    if (n == target) {
      return 1;
    }
    if (n > target) {
      return 0;
    }

    Integer cachedResult = cachedResults.get(n);
    if (cachedResult != null) {
      return cachedResult;
    }

    int result = climbStairs(n + 1, target) + climbStairs(n + 2, target);

    cachedResults.put(n, result);

    return result;
  }
}
