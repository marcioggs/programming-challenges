package com.marcioggs.neetcode150.mathandgeometry.happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {

  public boolean isHappy(int n) {

    Set<Integer> seenNs = new HashSet<>();
    seenNs.add(n);

    while (n != 1) {
      int newN = 0;

      while (n > 0) {
        int log10 = (int) Math.log10(n);
        int power = (int) Math.pow(10, log10);
        byte singleDigit = (byte) (n / power);
        n -= singleDigit * power;
        newN += Math.pow(singleDigit, 2);
      }

      if (seenNs.contains(newN)) {
        return false;
      }
      seenNs.add(newN);

      n = newN;
    }

    return true;
  }
}
