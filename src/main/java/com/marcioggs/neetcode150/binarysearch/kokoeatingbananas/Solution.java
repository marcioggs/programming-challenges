package com.marcioggs.neetcode150.binarysearch.kokoeatingbananas;

import java.util.Arrays;

public class Solution {

  public int minEatingSpeed(int[] piles, int h) {

    var low = 1;
    var high = Arrays.stream(piles).max().getAsInt();
    Integer minK = null;
    Integer maxHours = null;

    while (low <= high) {
      var mid = (low + high) / 2;
      var hours = calculateHours(piles, mid);

      if (hours <= h) {
        if (maxHours == null || hours >= maxHours) {
          maxHours = hours;
          minK = minK == null ? mid : Math.min(minK, mid);
        }

        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    return minK == null ? 0 : minK;
  }

  private int calculateHours(int[] piles, int k) {
    var hours = 0;
    for (var pile : piles) {
      hours += (int) Math.ceil((double) pile / k);
    }
    return hours;
  }
}
