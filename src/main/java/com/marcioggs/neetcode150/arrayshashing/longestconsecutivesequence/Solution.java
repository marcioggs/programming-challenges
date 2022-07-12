package com.marcioggs.neetcode150.arrayshashing.longestconsecutivesequence;

import java.util.HashMap;

public class Solution {

  public int longestConsecutive(int[] nums) {
    var seqStartMap = new HashMap<Integer, Integer[]>();
    var seqEndMap = new HashMap<Integer, Integer[]>();

    for (int num : nums) { // 4
      if (seqEndMap.containsKey(num - 1)) { // 3
        var endSeq = num;
        Integer[] seqStartNumberAndCount = seqEndMap.get(num - 1); // 123

        if (seqStartMap.containsKey(num + 1)) {
          endSeq = seqStartMap.get(num + 1)[0];
          // merge entries
          seqStartNumberAndCount[1] += seqStartMap.get(num + 1)[1];
          seqEndMap.remove(seqStartMap.get(num + 1)[0]);
          seqStartMap.remove(num + 1);
        }

        seqEndMap.remove(num - 1);
        seqEndMap.put(
            endSeq, new Integer[] {seqStartNumberAndCount[0], seqStartNumberAndCount[1] + 1});
        seqStartMap.put(
            seqStartNumberAndCount[0], new Integer[] {endSeq, seqStartNumberAndCount[1] + 1});
      } else if (seqStartMap.containsKey(num + 1)) {
        Integer[] seqEndNumberAndCount = seqStartMap.get(num + 1);
        seqStartMap.remove(num + 1);
        seqStartMap.put(num, new Integer[] {seqEndNumberAndCount[0], seqEndNumberAndCount[1] + 1});
        seqEndMap.put(seqEndNumberAndCount[0], new Integer[] {num, seqEndNumberAndCount[1] + 1});
      } else {
        seqStartMap.put(num, new Integer[] {num, 1});
        seqEndMap.put(num, new Integer[] {num, 1});
      }
    }

    return seqStartMap.values().stream()
        .mapToInt(seqEndNumberAndCount -> seqEndNumberAndCount[1])
        .reduce(Integer::max)
        .orElse(0);
  }
}
