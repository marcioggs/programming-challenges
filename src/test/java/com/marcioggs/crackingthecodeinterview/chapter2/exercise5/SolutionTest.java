package com.marcioggs.crackingthecodeinterview.chapter2.exercise5;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

  @Test
  public void test() {
    SingleLinkedListNode<Integer> l1e3 = new SingleLinkedListNode<>(6, null);
    SingleLinkedListNode<Integer> l1e2 = new SingleLinkedListNode<>(1, l1e3);
    SingleLinkedListNode<Integer> l1e1 = new SingleLinkedListNode<>(7, l1e2);

    SingleLinkedListNode<Integer> l2e3 = new SingleLinkedListNode<>(2, null);
    SingleLinkedListNode<Integer> l2e2 = new SingleLinkedListNode<>(9, l2e3);
    SingleLinkedListNode<Integer> l2e1 = new SingleLinkedListNode<>(5, l2e2);

    SingleLinkedListNode<Integer> result = new Solution().sumLists(l1e1, l2e1);

    assertEquals(Integer.valueOf(2), result.value);
    assertEquals(Integer.valueOf(1), result.next.value);
    assertEquals(Integer.valueOf(9), result.next.next.value);
  }
}
