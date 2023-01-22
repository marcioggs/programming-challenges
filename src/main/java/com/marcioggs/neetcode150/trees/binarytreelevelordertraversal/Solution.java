package com.marcioggs.neetcode150.trees.binarytreelevelordertraversal;

import com.marcioggs.neetcode150.trees.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> allLevels = new ArrayList<>();

        if (root == null) {
            return allLevels;
        }

        List<Integer> currentLevel = new ArrayList<>();
        allLevels.add(currentLevel);

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        int nodesInCurrentLevel = queue.size();

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            currentLevel.add(node.val);
            nodesInCurrentLevel--;
            if (nodesInCurrentLevel ==  0 && !queue.isEmpty()) {
                currentLevel = new ArrayList<>();
                allLevels.add(currentLevel);
                nodesInCurrentLevel = queue.size();
            }
        }

        return allLevels;
    }
}
