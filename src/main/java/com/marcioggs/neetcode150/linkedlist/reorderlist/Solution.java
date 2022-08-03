package com.marcioggs.neetcode150.linkedlist.reorderlist;

import com.marcioggs.neetcode150.linkedlist.ListNode;
import java.util.ArrayList;

public class Solution {
  public void reorderList(ListNode head) {
    var nodes = new ArrayList<ListNode>();
    var tmpNode = head;

    while (tmpNode != null) {
      nodes.add(tmpNode);
      tmpNode = tmpNode.next;
    }

    var left = 0;
    var right = nodes.size() - 1;
    var tail = -1;

    while (left <= right) {
      if (left > 0) {
        nodes.get(tail).next = nodes.get(left);
      }
      nodes.get(left).next = nodes.get(right);
      tail = right;

      left++;
      right--;
    }

    nodes.get(tail).next = null;
  }
}
