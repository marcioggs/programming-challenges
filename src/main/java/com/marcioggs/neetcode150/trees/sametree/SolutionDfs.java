package com.marcioggs.neetcode150.trees.sametree;

import com.marcioggs.neetcode150.trees.TreeNode;

public class SolutionDfs {

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p == null || q == null) {
      return false;
    }
    if (p.val != q.val) {
      return false;
    }

    return this.isSameTree(p.left, q.left) && this.isSameTree(p.right, q.right);
  }
}
