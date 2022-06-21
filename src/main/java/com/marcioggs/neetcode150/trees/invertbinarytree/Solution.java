package com.marcioggs.neetcode150.trees.invertbinarytree;

import com.marcioggs.neetcode150.trees.TreeNode;

/** https://leetcode.com/problems/invert-binary-tree */
public class Solution {

  public TreeNode invertTree(TreeNode node) {

    if (node == null) {
      return null;
    }

    this.invertTree(node.left);
    this.invertTree(node.right);

    TreeNode tmp = node.left;
    node.left = node.right;
    node.right = tmp;

    return node;
  }
}
