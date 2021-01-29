package com.marcioggs.crackingthecodeinterview.chapter2.exercise4;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

/**
 * Partition: Write code to partition a linked list around a value x, such that all nodes less than
 * x come before all nodes greater than or equal to x. If x is contained within the list, the values
 * of x only need to be after the elements less than x (see below). The partition element x can
 * appear anywhere in the "right partition"; it does not need to appear between the left and right
 * partitions.
 *
 * <p>EXAMPLE
 *
 * <p>Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition= 5]
 *
 * <p>Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
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
