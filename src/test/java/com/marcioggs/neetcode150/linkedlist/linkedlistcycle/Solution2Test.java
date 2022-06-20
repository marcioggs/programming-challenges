package com.marcioggs.neetcode150.linkedlist.linkedlistcycle;

import static org.junit.Assert.assertTrue;

import com.marcioggs.neetcode150.linkedlist.ListNode;
import org.junit.Test;

public class Solution2Test {

  @Test
  public void test() {

    ListNode three = new ListNode(3);
    ListNode two = new ListNode(2);
    ListNode zero = new ListNode(0);
    ListNode four = new ListNode(-4);

    three.next = two;
    two.next = zero;
    zero.next = four;
    four.next = two;

    assertTrue(new Solution2().hasCycle(three));
  }
}
