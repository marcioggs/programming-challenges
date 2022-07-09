package com.marcioggs.neetcode150.arrayshashing.topkfrequentelements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;

public class Solution {

  public int[] topKFrequent(int[] nums, int k) {
    var numFrequency = new HashMap<Integer, Integer>();

    for (int num : nums) {
      numFrequency.merge(num, 1, Integer::sum);
    }

    return numFrequency.entrySet().stream()
        .sorted(Comparator.comparingInt((Entry<Integer, Integer> e) -> e.getValue()).reversed())
        .mapToInt(Entry::getKey)
        .limit(k)
        .toArray();
  }
}
