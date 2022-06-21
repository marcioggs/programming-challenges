package com.marcioggs.neetcode150.trees.sametree;

import com.marcioggs.neetcode150.trees.TreeNode;
import java.util.Deque;
import java.util.LinkedList;

public class SolutionBfs {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    Deque<TreeNode> queueP = new LinkedList<>();
    Deque<TreeNode> queueQ = new LinkedList<>();
    queueP.push(p);
    queueQ.push(q);

    while (queueP.size() > 0 && queueQ.size() > 0) {

      TreeNode nodeP = queueP.pop();
      TreeNode nodeQ = queueQ.pop();

      if ((nodeP == null && nodeQ != null) || (nodeP != null && nodeQ == null)) {
        return false;
      }

      if (nodeP == null && nodeQ == null) {
        continue;
      }

      if (nodeP.val != nodeQ.val) {
        return false;
      }

      queueP.push(nodeP.left);
      queueQ.push(nodeQ.left);
      queueP.push(nodeP.right);
      queueQ.push(nodeQ.right);
    }

    return true;
  }
}
