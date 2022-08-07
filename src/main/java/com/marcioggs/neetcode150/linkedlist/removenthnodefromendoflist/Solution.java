package com.marcioggs.neetcode150.linkedlist.removenthnodefromendoflist;

import com.marcioggs.neetcode150.linkedlist.ListNode;

public class Solution {

  public ListNode removeNthFromEnd(ListNode head, int n) {

    ListNode beforeSlow = null;
    ListNode slow = head;
    ListNode fast = head;
    ListNode result;

    for (int i = 0; i < n - 1; i++) {
      fast = fast.next;
    }

    while (fast.next != null) {
      beforeSlow = slow;
      slow = slow.next;
      fast = fast.next;
    }

    if (beforeSlow == null) {
      result = head.next;
    } else {
      beforeSlow.next = slow.next;
      result = head;
    }

    return result;
  }
}
