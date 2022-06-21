package com.marcioggs.neetcode150.trees.diameterofbinarytree;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution {

  int maxDiameter = 0;

  public int diameterOfBinaryTree(TreeNode root) {

    this.traverse(root);

    return maxDiameter;
  }

  public int traverse(TreeNode node) {

    if (node == null) {
      return 0;
    }

    int leftDepth = this.traverse(node.left);
    int rightDepth = this.traverse(node.right);

    maxDiameter = Math.max(maxDiameter, leftDepth + rightDepth);

    return Math.max(leftDepth, rightDepth) + 1;
  }
}
