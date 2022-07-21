package com.marcioggs.neetcode150.twopointers.longestrepeatingcharacterreplacement;

import java.util.HashMap;

public class Solution {

  public int characterReplacement(String s, int k) {

    var start = 0;
    var end = 0;
    var chars = s.toCharArray();
    var charWindowFrequency = new HashMap<Character, Integer>();
    var maxWindowFrequency = 0;
    var maxFrequency = 0;

    while (end < chars.length) {
      var windowSize = end - start + 1;
      var charFrequency = charWindowFrequency.merge(chars[end], 1, Integer::sum);
      maxWindowFrequency = Math.max(maxWindowFrequency, charFrequency);
      var maxWindowReplaced = Math.min(windowSize, maxWindowFrequency + k);
      maxFrequency = Math.max(maxFrequency, maxWindowReplaced);

      if (windowSize - maxWindowFrequency - k > 0) {
        charWindowFrequency.merge(chars[start], -1, Integer::sum);
        //maxWindowFrequency =
         //   charWindowFrequency.values().stream().mapToInt(Integer::intValue).max().getAsInt();
        start++;
      }

      end++;
    }

    return maxFrequency;
  }
}
