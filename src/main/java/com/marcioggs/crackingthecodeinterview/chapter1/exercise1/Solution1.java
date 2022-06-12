package com.marcioggs.crackingthecodeinterview.chapter1.exercise1;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

  // time: o(n)
  // space: o(n)
  public boolean isUnique(String text) {
    char[] chars = text.toCharArray();

    Set<Character> uniqueChars = new HashSet<>();

    for (char character : chars) {
      if (uniqueChars.contains(character)) {
        return false;
      }
      uniqueChars.add(character);
    }

    return true;
  }
}
