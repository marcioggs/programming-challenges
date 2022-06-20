package com.marcioggs.neetcode150.slidingwindow.besttimetobuyandsellstock;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 *
 *
 */
public class Solution {

  public int maxProfit(int[] prices) {
    if (prices.length < 2) {
      return 0;
    }

    int maxProfit = 0;
    int buyIndex = 0;
    int sellIndex = 1;

    while (sellIndex < prices.length) {
      int currentProfit = prices[sellIndex] - prices[buyIndex];
      maxProfit = Math.max(maxProfit, currentProfit);
      if (currentProfit < 0) {
        buyIndex = sellIndex;
      }
      sellIndex++;
    }

    return maxProfit;
  }
}
