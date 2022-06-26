package com.marcioggs.neetcode150.dynamicprogramming1d.mincostclimbingstairs;

public class BottomUpSolution {

  public int minCostClimbingStairs(int[] costs) {

    int[] dp = new int[costs.length];
    for (int i = 0; i < costs.length; i++) {
      if (i <= 1) {
        dp[i] = costs[i];
        continue;
      }
      dp[i] = Math.min(costs[i] + dp[i - 1], costs[i] + dp[i - 2]);
    }
    return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
  }
}
