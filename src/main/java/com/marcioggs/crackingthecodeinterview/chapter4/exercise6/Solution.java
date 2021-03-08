package com.marcioggs.crackingthecodeinterview.chapter4.exercise6;

import com.marcioggs.crackingthecodeinterview.chapter4.BinarySearchTreeNodeWithParentRef;

/**
 * Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary
 * search tree. You may assume that each node has a link to its parent.
 */
public class Solution {

  public <T> BinarySearchTreeNodeWithParentRef<T> findNextNode(
      BinarySearchTreeNodeWithParentRef<T> currentNode) {

    if (currentNode.getRight() != null) {
      currentNode = currentNode.getRight();
      while (currentNode.getLeft() != null) {
        currentNode = currentNode.getLeft();
      }
      return currentNode;
    } else if (currentNode.getParent() == null) {
      return null;
    } else if (currentNode.getParent().getLeft() == currentNode) {
      return currentNode.getParent();
    } else {
      while (currentNode.getParent().getRight() == currentNode) {
        currentNode = currentNode.getParent();
        if (currentNode.getParent() == null) {
          return null;
        }
      }
      return currentNode.getParent();
    }
  }
}
