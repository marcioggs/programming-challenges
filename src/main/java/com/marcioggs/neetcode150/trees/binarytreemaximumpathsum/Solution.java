package com.marcioggs.neetcode150.trees.binarytreemaximumpathsum;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution {

    private int maxPathSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        recursiveMaxPathSum(root);
        return maxPathSum;
    }

    public int recursiveMaxPathSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = Integer.max(recursiveMaxPathSum(node.left), 0);
        int rightSum = Integer.max(recursiveMaxPathSum(node.right), 0);

        int currentSum = node.val + leftSum + rightSum;
        maxPathSum = Integer.max(currentSum, maxPathSum);

        return node.val + Integer.max(leftSum, rightSum);
    }
}
