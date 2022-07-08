package com.marcioggs.neetcode150.bitmanipulation.reversebits;

public class Solution {
  public int reverseBits(int n) {
    var result = 0;
    for (var i = 31; i >= 0; i--) {
      var offset = i - 31;
      var tmp = n << offset; // clean bytes to the  left
      tmp = tmp >>> 31; // clean bytes to the right
      tmp = tmp << offset; // move to the correct position
      result = result | tmp;
    }
    return result;
  }
}
