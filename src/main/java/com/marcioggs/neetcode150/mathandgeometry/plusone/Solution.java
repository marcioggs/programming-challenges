package com.marcioggs.neetcode150.mathandgeometry.plusone;

import java.util.LinkedList;
import java.util.List;

public class Solution {

  public int[] plusOne(int[] digits) {

    List<Integer> result = new LinkedList<>();

    boolean accumulatedOne = true;
    for (int i = digits.length - 1; i >= 0; i--) {
      if (accumulatedOne) {
        if (digits[i] != 9) {
          result.add(0, digits[i] + 1);
          accumulatedOne = false;
        } else {
          result.add(0, 0);
          if (i == 0) {
            result.add(0, 1);
          }
          // 1 is kept accumulated by not changing accumulatedOne
        }
      } else {
        result.add(0, digits[i]);
      }
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}
