package com.marcioggs.crackingthecodeinterview.chapter2.exercise1;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class Solution2 {

    public <T> void removeDuplicates(SingleLinkedListNode<T> root) {
        SingleLinkedListNode<T> primary = root;

        while (primary != null) {

            SingleLinkedListNode<T> secondary = primary;

            while (secondary != null && secondary.next != null) {
                if (primary.value.equals(secondary.next.value)) {
                    secondary.next = secondary.next.next;
                }
                secondary = secondary.next;
            }

            primary = primary.next;
        }

    }
}