package com.marcioggs.neetcode150.bitmanipulation.countingbits;

public class Solution {
  public int[] countBits(int n) {
    var result = new int[n + 1];

    result[0] = 0;

    for (var i = 1; i <= n; i++) {
      result[i] = result[i - (int) Math.pow(2, log2(i))] + 1;
    }

    return result;
  }

  private int log2(int x) {
    return (int) (Math.log(x) / Math.log(2));
  }
}
