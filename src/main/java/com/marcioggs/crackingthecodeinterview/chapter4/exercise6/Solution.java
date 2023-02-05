package com.marcioggs.crackingthecodeinterview.chapter4.exercise6;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNodeWithParentRef;

/**
 * Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary
 * search tree. You may assume that each node has a link to its parent.
 */
public class Solution {

  public static void main(String[] args) {
    System.out.println(Math.ceil((double)(1 - 0 ) / 2));
  }

  public <T> BinaryTreeNodeWithParentRef<T> findNextNode(
      BinaryTreeNodeWithParentRef<T> currentNode) {

    if (currentNode.getRight() != null) {
      currentNode = (BinaryTreeNodeWithParentRef<T>) currentNode.getRight();
      while (currentNode.getLeft() != null) {
        currentNode = (BinaryTreeNodeWithParentRef<T>) currentNode.getLeft();
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
