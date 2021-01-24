package com.marcioggs.crackingthecodeinterview.chapter2;

/**
 * Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
 * the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
 * that node.
 * EXAMPLE
 * lnput:the node c from the linked lista->b->c->d->e->f
 * Result: nothing is returned, but the new linked list looks like a->b->d->e->f
 */
public class Solution {

    public static <T> void deleteMiddleNode(LinkedListNode<T> initial) {

        if (initial == null || initial.next == null || initial.next.next == null) {
            return;
        }

        LinkedListNode<T> current = initial;
        LinkedListNode<T> previous = null;
        LinkedListNode<T> runner = initial;

        while (runner.next != null) {
            previous = current;
            current = current.next;
            runner = runner.next.next != null ? runner.next.next : runner.next;
        }

        previous.next = current.next;
    }
}
