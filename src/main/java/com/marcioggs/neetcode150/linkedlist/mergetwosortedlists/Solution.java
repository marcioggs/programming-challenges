package com.marcioggs.neetcode150.linkedlist.mergetwosortedlists;

import com.marcioggs.neetcode150.linkedlist.ListNode;

public class Solution {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode dummyNode = new ListNode(0);
    ListNode mergedListTail = dummyNode;

    while (list1 != null && list2 != null) {
      if (list1.val <= list2.val) {
        mergedListTail.next = list1;
        mergedListTail = list1;
        list1 = list1.next;
      } else {
        mergedListTail.next = list2;
        mergedListTail = list2;
        list2 = list2.next;
      }
    }

    if (list1 != null) {
      mergedListTail.next = list1;
    } else if (list2 != null) {
      mergedListTail.next = list2;
    }

    return dummyNode.next;
  }
}
