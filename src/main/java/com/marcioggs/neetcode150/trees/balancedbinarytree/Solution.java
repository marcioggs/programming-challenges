package com.marcioggs.neetcode150.trees.balancedbinarytree;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution {

  boolean isBalanced = true;

  public boolean isBalanced(TreeNode root) {
    this.traverse(root);
    return isBalanced;
  }

  private int traverse(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int leftDepth = this.traverse(node.left);
    int rightDepth = this.traverse(node.right);

    if (Math.abs(leftDepth - rightDepth) > 1) {
      isBalanced = false;
    }

    return Math.max(leftDepth, rightDepth) + 1;
  }
}
