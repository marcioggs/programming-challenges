package com.marcioggs.neetcode150.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashMap;

public class NSquaredSolution {

  public int lengthOfLongestSubstring(String s) {

    var textArray = s.toCharArray();
    var currentSubstringLetterIndex = new HashMap<Character, Integer>();
    var longestSubstringLength = 0;
    var currentSubstringLength = 0;

    for (int i = 0; i < textArray.length; i++) {
      var letter = textArray[i];
      var letterIndex = currentSubstringLetterIndex.get(letter);
      if (letterIndex == null) {
        currentSubstringLength++;
      } else {
        currentSubstringLetterIndex.values().removeIf(value -> value < letterIndex);
        currentSubstringLength = i - letterIndex;
      }
      currentSubstringLetterIndex.put(letter, i);
      longestSubstringLength = Math.max(longestSubstringLength, currentSubstringLength);
    }

    return longestSubstringLength;
  }
}
