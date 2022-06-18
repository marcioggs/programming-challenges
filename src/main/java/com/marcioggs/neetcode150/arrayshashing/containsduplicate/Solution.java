package com.marcioggs.neetcode150.arrayshashing.containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/submissions/
 *
 * <p>Runtime: 8 ms, faster than 84.28% of Java online submissions for Contains Duplicate.
 *
 * <p>Memory Usage: 69.9 MB, less than 40.36% of Java online submissions for Contains Duplicate.
 */
public class Solution {

  public boolean containsDuplicate(int[] nums) {
    Set<Integer> foundNumbers = new HashSet<>();

    for (Integer num : nums) {
      if (!foundNumbers.contains(num)) {
        foundNumbers.add(num);
      } else {
        return true;
      }
    }

    return false;
  }
}
