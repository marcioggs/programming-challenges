package com.marcioggs.neetcode150.twopointers.permutationinstring;

import java.util.HashMap;

public class Solution {

  public boolean checkInclusion(String s1, String s2) {

    var s1Chars = s1.toCharArray();
    var s2Chars = s2.toCharArray();
    var s1CharFrequencyMap = getCharFrequencyMap(s1Chars);
    var slidingWindowCharFrequencyMap = new HashMap<Character, Integer>();

    for (int i = 0; i < s2Chars.length; i++) {
      slidingWindowCharFrequencyMap.merge(s2Chars[i], 1, Integer::sum);

      if (i >= s1Chars.length) {
        slidingWindowCharFrequencyMap.compute(
            s2Chars[i - s1Chars.length], (key, val) -> val.equals(1) ? null : val - 1);
      }

      if (s1CharFrequencyMap.equals(slidingWindowCharFrequencyMap)) {
        return true;
      }
    }

    return false;
  }

  private HashMap<Character, Integer> getCharFrequencyMap(char[] chars) {
    var map = new HashMap<Character, Integer>();

    for (char letter : chars) {
      map.merge(letter, 1, Integer::sum);
    }

    return map;
  }
}
