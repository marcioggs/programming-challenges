package com.marcioggs.crackingthecodeinterview.chapter2.exercise2;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class RecursiveSolution {

    public <T> SingleLinkedListNode<T> returnKthToLast(SingleLinkedListNode<T> root, int k) {
        if (root == null) {
            return null;
        }
        IndexAndNode<T> indexAndNode = findKthToLast(root, k);
        return indexAndNode.node;
    }

    private <T> IndexAndNode<T> findKthToLast(SingleLinkedListNode<T> node, int k) {
        IndexAndNode<T> indexAndNode =
                node.next != null ?
                        findKthToLast(node.next, k) :
                        new IndexAndNode<>(0, null);

        if (k == indexAndNode.index) {
            indexAndNode.node = node;
        }
        indexAndNode.incrementIndex();

        return indexAndNode;
    }

    public static class IndexAndNode<T> {
        private int index;
        private SingleLinkedListNode<T> node;

        public IndexAndNode(int index, SingleLinkedListNode<T> node) {
            this.index = index;
            this.node = node;
        }

        public void incrementIndex() {
            this.index++;
        }
    }
}