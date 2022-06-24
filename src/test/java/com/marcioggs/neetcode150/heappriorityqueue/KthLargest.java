package com.marcioggs.neetcode150.heappriorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargest {

  int k;
  PriorityQueue<Integer> orderedNumbers;

  public KthLargest(int k, int[] nums) {
    this.k = k;
    orderedNumbers = new PriorityQueue<>(Comparator.comparingInt(a -> a));
    for (int num : nums) {
      orderedNumbers.add(num);
    }
    while (orderedNumbers.size() > k) {
      orderedNumbers.poll();
    }
  }

  public int add(int val) {
    orderedNumbers.add(val);

    if (orderedNumbers.size() > k) {
      orderedNumbers.poll();
    }

    return orderedNumbers.peek();
  }
}
