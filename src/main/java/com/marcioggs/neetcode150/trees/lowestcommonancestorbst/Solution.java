package com.marcioggs.neetcode150.trees.lowestcommonancestorbst;

import com.marcioggs.neetcode150.trees.TreeNode;
import java.util.ArrayList;
import java.util.List;

/** https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/ */
public class Solution {

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> pTreePath = this.findTreePath(root, p);
    List<TreeNode> qTreePath = this.findTreePath(root, q);

    for (TreeNode pTreePathNode : pTreePath) {
      for (TreeNode qTreePathNode : qTreePath) {
        if (pTreePathNode.val == qTreePathNode.val) {
          return pTreePathNode;
        }
      }
    }
    return null;
  }

  private List<TreeNode> findTreePath(TreeNode node, TreeNode nodeToFind) {
    if (node == null) {
      return null;
    }
    if (node.val == nodeToFind.val) {
      ArrayList<TreeNode> treePath = new ArrayList<>();
      treePath.add(node);
      return treePath;
    }

    List<TreeNode> treePath = this.findTreePath(node.left, nodeToFind);
    if (treePath == null) {
      treePath = this.findTreePath(node.right, nodeToFind);
    }
    if (treePath != null) {
      treePath.add(node);
      return treePath;
    }

    return null;
  }
}
