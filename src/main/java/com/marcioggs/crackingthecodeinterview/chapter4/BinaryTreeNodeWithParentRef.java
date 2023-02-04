package com.marcioggs.crackingthecodeinterview.chapter4;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BinaryTreeNodeWithParentRef<T> extends BinaryTreeNode<T>{

  private BinaryTreeNodeWithParentRef<T> parent;

  public BinaryTreeNodeWithParentRef(T value, BinaryTreeNode<T> left, BinaryTreeNode<T> right, BinaryTreeNodeWithParentRef<T> parent) {
    this.setValue(value);
    this.setLeft(left);
    this.setRight(right);
    this.setParent(parent);
  }
}
