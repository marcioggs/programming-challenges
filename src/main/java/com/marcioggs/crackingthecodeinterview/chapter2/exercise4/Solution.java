package com.marcioggs.crackingthecodeinterview.chapter2.exercise4;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class Solution {

  public void partitionOnValue(SingleLinkedListNode<Integer> initial, Integer value) {
    SingleLinkedListNode<Integer> current = initial;
    SingleLinkedListNode<Integer> lastNodeLeftSide = null;
    SingleLinkedListNode<Integer> firstNodeRightSide = null;
    SingleLinkedListNode<Integer> lastNodeRightSide = null;

    while (current != null) {
      if (current.value < value) {
        if (lastNodeLeftSide != null) {
          lastNodeLeftSide.next = current;
        }
        lastNodeLeftSide = current;
      } else {
        if (firstNodeRightSide == null) {
          firstNodeRightSide = current;
        }
        if (lastNodeRightSide != null) {
          lastNodeRightSide.next = current;
        }
        lastNodeRightSide = current;
      }

      current = current.next;
    }

    if (lastNodeLeftSide != null) {
      lastNodeLeftSide.next = firstNodeRightSide;
    }

    if (lastNodeRightSide != null) {
      lastNodeRightSide.next = null;
    }
  }
}
