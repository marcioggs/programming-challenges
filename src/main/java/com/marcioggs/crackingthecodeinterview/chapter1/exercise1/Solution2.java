package com.marcioggs.crackingthecodeinterview.chapter1.exercise1;

import java.util.Arrays;

public class Solution2 {

  // time: o(n * log n)
  // space: o(1)
  public boolean isUnique(String text) {
    char[] chars = text.toCharArray();
    Arrays.sort(chars); // n * log n

    for (int i = 0; i < chars.length - 1; i++) {
      if (chars[i] == chars[i + 1]) {
        return false;
      }
    }

    return true;
  }
}
