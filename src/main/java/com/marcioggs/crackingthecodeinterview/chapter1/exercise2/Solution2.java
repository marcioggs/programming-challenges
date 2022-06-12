package com.marcioggs.crackingthecodeinterview.chapter1.exercise2;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {

  // time: o(n)
  // space: o(n)
  public boolean isPermutation(String text1, String text2) {
    if (text1.length() != text2.length()) {
      return false;
    }

    Map<Character, Integer> text1CharCountMap = getCharCountMap(text1.toCharArray());
    Map<Character, Integer> text2CharCountMap = getCharCountMap(text2.toCharArray());

    text1CharCountMap.forEach(
        (key1, value1) -> {
          text2CharCountMap.compute(
              key1,
              (key2, value2) -> {
                if (value2 == null) {
                  return -1;
                }
                return value2.equals(value1) ? null : value2 - value1;
              });
        });

    return text2CharCountMap.isEmpty();
  }

  private Map<Character, Integer> getCharCountMap(char[] text) {
    Map<Character, Integer> charCountMap = new HashMap<>();

    for (Character character : text) {
      charCountMap.compute(
          character,
          (key, value) -> {
            if (value == null) {
              return 1;
            } else {
              return value + 1;
            }
          });
    }

    return charCountMap;
  }
}
