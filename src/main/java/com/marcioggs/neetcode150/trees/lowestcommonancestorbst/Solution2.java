package com.marcioggs.neetcode150.trees.lowestcommonancestorbst;

import com.marcioggs.neetcode150.trees.TreeNode;

public class Solution2 {
  public TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {

    TreeNode lower = p.val < q.val? p : q;
    TreeNode higher = p.val > q.val? p : q;

    if (node == null) {
      return null;
    }

    if (node.val >= lower.val && node.val <= higher.val) {
      return node;
    }

    if (node.val > lower.val && node.val > higher.val) {
      return lowestCommonAncestor(node.left, p, q);
    }

    return lowestCommonAncestor(node.right, p, q);
  }
}
