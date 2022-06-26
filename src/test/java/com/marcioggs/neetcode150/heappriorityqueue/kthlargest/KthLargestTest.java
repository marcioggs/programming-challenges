package com.marcioggs.neetcode150.heappriorityqueue.kthlargest;

import static org.junit.Assert.assertEquals;

import com.marcioggs.neetcode150.heappriorityqueue.kthlargest.KthLargest;
import org.junit.Test;

public class KthLargestTest {

  @Test
  public void test() {
    KthLargest kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
    assertEquals(4, kthLargest.add(3));
    assertEquals(5, kthLargest.add(5));
    assertEquals(5, kthLargest.add(10));
    assertEquals(8, kthLargest.add(9));
    assertEquals(8, kthLargest.add(4));
  }
}
