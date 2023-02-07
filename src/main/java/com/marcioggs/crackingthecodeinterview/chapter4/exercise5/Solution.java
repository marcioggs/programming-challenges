package com.marcioggs.crackingthecodeinterview.chapter4.exercise5;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;

public class Solution {

    public <T extends Comparable<T>> boolean isBST(BinaryTreeNode<T> node) {
        return isBST(node, null, null);
    }

    private <T extends Comparable<T>> boolean isBST(BinaryTreeNode<T> node, T minValue, T maxValue) {
        if (node == null) {
            return true;
        }

        if ((minValue != null && node.getValue().compareTo(minValue) < 0) ||
                (maxValue != null && node.getValue().compareTo(maxValue) > 0)) {
            return false;
        }

        return isBST(node.getLeft(), minValue, node.getValue()) && isBST(node.getRight(), node.getValue(), maxValue);
    }
}