package com.marcioggs.neetcode150.arrayshashing.validanagram;

/**
 * https://leetcode.com/problems/valid-anagram/submissions/
 *
 * <p>Runtime: 3 ms, faster than 94.14% of Java online submissions for Valid Anagram.
 *
 * <p>Memory Usage: 44.4 MB, less than 44.38% of Java online submissions for Valid Anagram.
 */
class Solution {
  public static void main(String[] args) {
    new Solution().isAnagram("abcabczzz", "abcabczzz");
  }

  // time complexity: o(s+t)
  // space complexity: o(1)
  public boolean isAnagram(String s, String t) {
    int aIndex = 'a';
    int zIndex = 'z';
    int[] charCountMap = new int[zIndex - aIndex + 1];

    if (s.length() != t.length()) {
      return false;
    }

    for (char sChar : s.toCharArray()) {
      charCountMap[sChar - aIndex]++;
    }

    for (char tChar : t.toCharArray()) {
      if (charCountMap[tChar - aIndex] <= 0) {
        return false;
      }
      charCountMap[tChar - aIndex]--;
    }

    return true;
  }
}
