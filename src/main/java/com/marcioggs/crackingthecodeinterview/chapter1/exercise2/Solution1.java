package com.marcioggs.crackingthecodeinterview.chapter1.exercise2;

import java.util.Arrays;

public class Solution1 {

  // time: o(n*logn)
  public  boolean isPermutation(String text1, String text2) {
    if (text1.length() != text2.length()) {
      return false;
    }

    char[] chars1 = text1.toCharArray();
    char[] chars2 = text2.toCharArray();

    Arrays.sort(chars1);
    Arrays.sort(chars2);

    return Arrays.equals(chars1, chars2);
  }
}
