package com.marcioggs.neetcode150.linkedlist.reverselinkedlist;

/**
 * https://leetcode.com/problems/reverse-linked-list
 *
 * <p>Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
 *
 * <p>Memory Usage: 43.1 MB, less than 34.16% of Java online submissions for Reverse Linked List.
 */
public class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode reversedHead = null;

    do {
      reversedHead = new ListNode(head.val, reversedHead);
      head = head.next;
    } while (head != null);

    return reversedHead;
  }
}
