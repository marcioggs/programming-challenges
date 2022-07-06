package com.marcioggs.neetcode150.bitmanipulation.numberofonebits;

public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {

    var hammingWeight = 0;

    while (n != 0) {
      if ((n & 1) == 1) { // equivalent to: n % 2 == 1
        hammingWeight++;
      }
      n >>>= 1;
    }

    return hammingWeight;
  }
}
