package com.marcioggs.crackingthecodeinterview.chapter2.exercise8;


import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class Solution {
    public <T> SingleLinkedListNode<T> findStartOfLoop(SingleLinkedListNode<T> root) {
        SingleLinkedListNode<T> initial = new SingleLinkedListNode<T>(null, root);
        SingleLinkedListNode<T> slow = initial;
        SingleLinkedListNode<T> fast = initial;

        do {
            slow = slow.next;
            fast = fast.next != null ? fast.next.next : null;
        } while (fast != null && slow != fast);

        return fast;
    }
}
