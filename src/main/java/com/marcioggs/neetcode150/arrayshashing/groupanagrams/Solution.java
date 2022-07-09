package com.marcioggs.neetcode150.arrayshashing.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {

  public List<List<String>> groupAnagrams(String[] strs) {
    var groupedAnagrams = new HashMap<String, List<String>>();

    for (String str : strs) {
      var strSortedLetters = str.toCharArray();
      Arrays.sort(strSortedLetters);

      var foundAnagrams =
          groupedAnagrams.computeIfAbsent(
              String.valueOf(strSortedLetters), key -> new ArrayList<>());

      foundAnagrams.add(str);
    }

    return groupedAnagrams.values().stream().toList();
  }
}
