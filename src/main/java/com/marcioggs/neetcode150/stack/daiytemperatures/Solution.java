package com.marcioggs.neetcode150.stack.daiytemperatures;

import java.util.ArrayDeque;

public class Solution {

  public int[] dailyTemperatures(int[] temperatures) {

    var result = new int[temperatures.length];
    var stack = new ArrayDeque<Integer>();
    for (int i = 0; i < temperatures.length; i++) {
      while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
        int index = stack.pop();
        result[index] = i - index;
      }
      stack.push(i);
    }
    return result;
  }
}
