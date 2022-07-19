package com.marcioggs.neetcode150.twopointers.longestrepeatingcharacterreplacement;

public class SlowSolution {

  public int characterReplacement(String s, int k) {
    if (s.length() <= 1) {
      return s.length();
    }

    var chars = s.toCharArray();
    var start = 0;
    var end = 1;
    var maxLength = 0;
    var replacedAmount = 0;
    var firstReplacedIndex = -1;

    while (start < chars.length - 1) {
      while (end < chars.length && (chars[start] == chars[end] || replacedAmount < k)) {
        if (chars[start] != chars[end]) {
          if (firstReplacedIndex < 0) {
            firstReplacedIndex = end;
          }
          replacedAmount++;
        }
        end++;
      }
      maxLength =
          replacedAmount < k && start > 0
              ? Math.max(maxLength, end - Math.max(0, start - k + replacedAmount))
              : Math.max(maxLength, end - start);

      start =
          replacedAmount > 0 ? firstReplacedIndex : end >= chars.length ? chars.length : start + 1;
      end = start + 1;
      replacedAmount = 0;
      firstReplacedIndex = -1;
    }

    return maxLength;
  }
}
