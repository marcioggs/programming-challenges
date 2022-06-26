package com.marcioggs.neetcode150.heappriorityqueue.laststoneweight;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {

  public int lastStoneWeight(int[] stones) {
    PriorityQueue<Integer> orderedHeaviestStones = new PriorityQueue<>(Comparator.reverseOrder());

    for (int stone : stones) {
      orderedHeaviestStones.add(stone);
    }

    while (orderedHeaviestStones.size() > 1) {
      int firstHeaviestStone = orderedHeaviestStones.poll();
      int secondHeaviestStone = orderedHeaviestStones.poll();

      if (firstHeaviestStone != secondHeaviestStone) {
        orderedHeaviestStones.add(firstHeaviestStone - secondHeaviestStone);
      }
    }

    return orderedHeaviestStones.peek() != null ? orderedHeaviestStones.poll() : 0;
  }
}
