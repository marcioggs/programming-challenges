package com.marcioggs.neetcode150.trees.maximumdepthofbynarytree;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution {
  public int maxDepth(TreeNode node) {

    if (node == null) {
      return 0;
    }

    int leftDepth = this.maxDepth(node.left);
    int rightDepth = this.maxDepth(node.right);

    return Math.max(leftDepth, rightDepth) + 1;
  }
}
