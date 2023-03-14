package com.marcioggs.crackingthecodeinterview.chapter2.exercise1;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public <T> void removeDuplicates(SingleLinkedListNode<T> root) {
        if (root == null) {
            return;
        }
        Set<T> found = new HashSet<>();
        SingleLinkedListNode<T> node = root;

        while (node != null && node.next != null) {
            found.add(node.value);
            if (found.contains(node.next.value)) {
                node.next = node.next.next;
            }
            node = node.next;
        }
    }
}
