package com.marcioggs.crackingthecodeinterview.chapter4.exercise5;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;

public class Solution {

    public <T extends Comparable<T>> boolean isBST(BinaryTreeNode<T> node) {
        return (node.getLeft() == null || (node.getLeft().getValue().compareTo(node.getValue()) < 0 && isBST(node.getLeft()))) &&
               (node.getRight() == null || (node.getRight().getValue().compareTo(node.getValue()) > 0  && isBST(node.getRight())));
    }
}