package com.marcioggs.crackingthecodeinterview.chapter4.exercise3;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;

import java.util.*;

public class Solution {

    public <T> List<LinkedList<BinaryTreeNode<T>>> getBinaryTreeLevels(BinaryTreeNode<T> root) {
        if (root == null) {
            return null;
        }

        List<LinkedList<BinaryTreeNode<T>>> levels = new ArrayList<>();
        LinkedList<BinaryTreeNode<T>> currentLevel = new LinkedList<>();
        Queue<BinaryTreeNode<T>> toVisitCurrentLevel = new ArrayDeque<>();
        Queue<BinaryTreeNode<T>> toVisitNextLevel = new ArrayDeque<>();

        levels.add(currentLevel);
        toVisitCurrentLevel.add(root);

        while (!toVisitCurrentLevel.isEmpty()) {
            BinaryTreeNode<T> node = toVisitCurrentLevel.remove();
            currentLevel.add(node);
            if (node.getLeft() != null) {
                toVisitNextLevel.add(node.getLeft());
            }
            if (node.getRight() != null) {
                toVisitNextLevel.add(node.getRight());
            }

            if (toVisitCurrentLevel.isEmpty() && !toVisitNextLevel.isEmpty()) {
                toVisitCurrentLevel = toVisitNextLevel;
                toVisitNextLevel = new ArrayDeque<>();
                currentLevel = new LinkedList<>();
                levels.add(currentLevel);
            }
        }

        return levels;
    }
}
