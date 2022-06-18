package com.marcioggs.neetcode150.twopointers;

/**
 * https://leetcode.com/problems/valid-palindrome/
 *
 * Runtime: 31 ms, faster than 37.82% of Java online submissions for Valid Palindrome
 *
 * Memory Usage: 47.3 MB, less than 22.15% of Java online submissions for Valid Palindrome.
 */
public class Solution {
  public boolean isPalindrome(String s) {

    s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
        return false;
      }
    }

    return true;
  }
}
