package com.marcioggs.neetcode150.trees.subtreeofanothertree;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution {

  public boolean isSubtree(TreeNode root, TreeNode subRoot) {
    if (root == null) {
      return false;
    }

    return this.isSameTree(root, subRoot)
        || isSubtree(root.left, subRoot)
        || isSubtree(root.right, subRoot);
  }

  public boolean isSameTree(TreeNode node1, TreeNode node2) {
    if (node1 == null && node2 == null) {
      return true;
    }
    if (node1 == null || node2 == null) {
      return false;
    }
    if (node1.val != node2.val) {
      return false;
    }

    return this.isSameTree(node1.left, node2.left) && this.isSameTree(node1.right, node2.right);
  }
}
