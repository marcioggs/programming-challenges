package com.marcioggs.neetcode150.arrayshashing.productofarrayexceptself;

public class Solution {
  public int[] productExceptSelf(int[] nums) {
    var result = new int[nums.length];

    var prefix = new int[nums.length];
    for (var i = 0; i < nums.length; i++) {
      prefix[i] = (i == 0 ? 1 : prefix[i - 1]) * nums[i];
    }

    var suffix = new int[nums.length];
    for (var i = nums.length - 1; i >= 0; i--) {
      suffix[i] = (i == nums.length - 1 ? 1 : suffix[i + 1]) * nums[i];
    }

    for (var i = 0; i < nums.length; i++) {
      var leftProduct = (i == 0 ? 1 : prefix[i - 1]);
      var rightProduct = (i == nums.length - 1 ? 1 : suffix[i + 1]);
      result[i] = leftProduct * rightProduct;
    }

    return result;
  }
}
