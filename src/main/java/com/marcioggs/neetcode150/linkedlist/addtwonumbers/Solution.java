package com.marcioggs.neetcode150.linkedlist.addtwonumbers;

import com.marcioggs.neetcode150.linkedlist.ListNode;

public class Solution {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode resultHead = null;
    int remainder = 0;
    ListNode previousNode = null;

    while (l1 != null || l2 != null) {

      var l1Val = l1 == null ? 0 : l1.val;
      var l2Val = l2 == null ? 0 : l2.val;
      var totalVal = l1Val + l2Val + remainder;
      int resultVal = totalVal % 10;
      remainder = totalVal / 10;

      var resultNode = new ListNode(resultVal);
      if (resultHead == null) {
        resultHead = resultNode;
      }
      if (previousNode != null) {
        previousNode.next = resultNode;
      }
      previousNode = resultNode;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }

    if (remainder > 0) {
      previousNode.next = new ListNode(remainder);
    }

    return resultHead;
  }
}
