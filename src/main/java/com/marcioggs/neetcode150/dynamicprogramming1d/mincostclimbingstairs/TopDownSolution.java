package com.marcioggs.neetcode150.dynamicprogramming1d.mincostclimbingstairs;

import java.util.HashMap;
import java.util.Map;

public class TopDownSolution {

  Map<Integer, Integer> cachedResults = new HashMap<>();

  public int minCostClimbingStairs(int[] costs) {
    return Math.min(min(costs, costs.length - 1), min(costs, costs.length - 2));
  }

  private int min(int[] costs, int index) {
    if (index < 0) {
      return 0;
    }

    Integer cachedResult = cachedResults.get(index);
    if (cachedResult != null) {
      return cachedResult;
    }

    int result =
        Math.min(costs[index] + min(costs, index - 1), costs[index] + min(costs, index - 2));

    cachedResults.put(index, result);

    return result;
  }
}
