package com.marcioggs.crackingthecodeinterview.chapter2.exercise7;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class Solution {

    public <T> SingleLinkedListNode<T> findIntersection(SingleLinkedListNode<T> list1head, SingleLinkedListNode<T> list2head) {
        LastNodeAndSize<T> list1LastNodeAndSize = getLastNodeAndSize(list1head);
        LastNodeAndSize<T> list2LastNodeAndSize = getLastNodeAndSize(list2head);

        if (list1LastNodeAndSize.lastNode != list2LastNodeAndSize.lastNode) {
            return null;
        }

        if (list1LastNodeAndSize.size > list2LastNodeAndSize.size) {
               list1head = advanceBy(list1head, list1LastNodeAndSize.size -  list2LastNodeAndSize.size);
         }

         if (list2LastNodeAndSize.size > list1LastNodeAndSize.size) {
                list2head = advanceBy(list2head, list2LastNodeAndSize.size -  list1LastNodeAndSize.size);
         }

         while (list1head != list2head) {
            list1head = list1head.next;
            list2head = list2head.next;
         }

        return list1head;
    }

    private <T> LastNodeAndSize<T> getLastNodeAndSize(SingleLinkedListNode<T> node) {
            SingleLinkedListNode<T> lastNode = null;
            int size = 0;

            while (node != null) {
                   lastNode = node;
                   size++;
                   node = node.next;
            }

            return new LastNodeAndSize<>(lastNode, size);
    }

    private static class LastNodeAndSize<T> {
        private final SingleLinkedListNode<T> lastNode;
        private final int size;

        public LastNodeAndSize(SingleLinkedListNode<T> lastNode, int size) {
            this.lastNode = lastNode;
            this.size = size;
        }
    }

    private <T> SingleLinkedListNode<T> advanceBy(SingleLinkedListNode<T> node, int n) {
        for (int i = 0; i < n; i++) {
            node = node.next;
        }

        return node;
    }
}