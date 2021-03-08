package com.marcioggs.crackingthecodeinterview.chapter4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BinarySearchTreeNodeWithParentRef<T> {

  private T value;
  private BinarySearchTreeNodeWithParentRef<T> parent;
  private BinarySearchTreeNodeWithParentRef<T> left;
  private BinarySearchTreeNodeWithParentRef<T> right;
}
