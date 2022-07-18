package com.marcioggs.neetcode150.slidingwindow.longestsubstringwithoutrepeatingcharacters;

import java.util.HashSet;

public class Solution {

  public int lengthOfLongestSubstring(String s) {

    if (s.length() <= 1) {
      return s.length();
    }

    var begin = 0;
    var currentSubstringLetters = new HashSet<Character>();
    var textArray = s.toCharArray();
    var longestSubstringLength = 0;

    currentSubstringLetters.add(textArray[0]);

    for (int end = 1; end < textArray.length; end++) {
      var letter = textArray[end];

      if (!currentSubstringLetters.contains(letter)) {
        currentSubstringLetters.add(letter);
      } else {
        var indexToDelete = begin;
        while (textArray[indexToDelete] != letter) {
          currentSubstringLetters.remove(textArray[indexToDelete]);
          indexToDelete++;
        }
        begin = indexToDelete + 1;
      }

      longestSubstringLength = Math.max(longestSubstringLength, end - begin + 1);
    }

    return longestSubstringLength;
  }
}
