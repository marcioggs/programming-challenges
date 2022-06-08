package com.marcioggs.crackingthecodeinterview.chapter2.exercise3;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but the
 * first and last node, not necessarily the exact middle) of a singly linked list, given only access
 * to that node. EXAMPLE lnput:the node c from the linked lista->b->c->d->e->f Result: nothing is
 * returned, but the new linked list looks like a->b->d->e->f
 */
public class Solution {

  public static <T> void deleteMiddleNode(SingleLinkedListNode<T> initial) {

    if (initial == null || initial.next == null || initial.next.next == null) {
      return;
    }

    SingleLinkedListNode<T> current = initial;
    SingleLinkedListNode<T> previous = null;
    SingleLinkedListNode<T> runner = initial;

    while (runner.next != null) {
      previous = current;
      current = current.next;
      runner = runner.next.next != null ? runner.next.next : runner.next;
    }

    previous.next = current.next;
  }
}
