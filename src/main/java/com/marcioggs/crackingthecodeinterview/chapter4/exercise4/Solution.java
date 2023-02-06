package com.marcioggs.crackingthecodeinterview.chapter4.exercise4;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class Solution {

    public <T> boolean isBalancedBinaryTree(BinaryTreeNode<T> rootNode) {

        AtomicInteger minLevel = new AtomicInteger(Integer.MAX_VALUE);
        AtomicInteger maxLevel = new AtomicInteger(Integer.MIN_VALUE);

        findMinAndMaxLevel(rootNode, 0, minLevel, maxLevel);

        return maxLevel.get() - minLevel.get() <= 1;
    }

    private <T> void findMinAndMaxLevel(BinaryTreeNode<T> node, int level, AtomicInteger minLevel, AtomicInteger maxLevel) {
        if (node == null) {
            minLevel.set(Math.min(level, minLevel.get()));
            maxLevel.set(Math.max(level, maxLevel.get()));
        } else {
            findMinAndMaxLevel(node.getLeft(), level + 1, minLevel, maxLevel);
            findMinAndMaxLevel(node.getRight(), level + 1, minLevel, maxLevel);
        }
    }
}
