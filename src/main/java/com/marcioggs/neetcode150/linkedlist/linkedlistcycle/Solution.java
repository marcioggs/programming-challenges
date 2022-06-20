package com.marcioggs.neetcode150.linkedlist.linkedlistcycle;

import com.marcioggs.neetcode150.linkedlist.ListNode;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class Solution {

  public boolean hasCycle(ListNode head) {

    Set<ListNode> readNodes = new HashSet<>();

    while (head != null) {
      if (readNodes.contains(head)) {
        return true;
      }
      readNodes.add(head);
      head = head.next;
    }

    return false;
  }
}
