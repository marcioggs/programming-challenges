package com.marcioggs.neetcode150.bitmanipulation.singlenumber;

public class Solution {

  public int singleNumber(int[] nums) {
    var singleNumber = 0;
    for (int num : nums) {
      singleNumber ^= num;
    }
    return singleNumber;
  }
}
