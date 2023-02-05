package com.marcioggs.crackingthecodeinterview.chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BinaryTreeNode<T> {

  private T value;
  private BinaryTreeNode<T> left;
  private BinaryTreeNode<T> right;

  public BinaryTreeNode(T value) {
    this.value = value;
  }
}
