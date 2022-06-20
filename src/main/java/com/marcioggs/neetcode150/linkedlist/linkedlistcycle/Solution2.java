package com.marcioggs.neetcode150.linkedlist.linkedlistcycle;

import com.marcioggs.neetcode150.linkedlist.ListNode;

/** https://leetcode.com/problems/linked-list-cycle/ */
public class Solution2 {

  public boolean hasCycle(ListNode head) {
    if (head == null) return false;

    ListNode slow = head;
    ListNode fast = head.next != null ? head.next.next : null;

    while (fast != null && fast != slow) {
      slow = slow.next;
      fast = fast.next != null ? fast.next.next : null;
    }

    return slow == fast;
  }
}
