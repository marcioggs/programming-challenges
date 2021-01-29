package com.marcioggs.crackingthecodeinterview.chapter2.exercise5;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

/**
 * Sum Lists: You have two numbers represented by a linked list, where each node contains a single
 * digit. The digits are stored in reverse order, such that the 1 's digit is at the head of the
 * list. Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * <p>EXAMPLE
 *
 * <p>Input: (7-> 1 -> 6) + (5 -> 9 -> 2).That is,617 + 295.
 *
 * <p>Output: 2 -> 1 -> 9. That is, 912.
 */
public class Solution {

  public SingleLinkedListNode<Integer> sumLists(
      SingleLinkedListNode<Integer> op1List, SingleLinkedListNode<Integer> op2List) {

    Integer op1 = this.getIntegerFromList(op1List);
    Integer op2 = this.getIntegerFromList(op2List);

    return this.getListFromInteger(op1 + op2);
  }

  private int getIntegerFromList(SingleLinkedListNode<Integer> node) {

    if (node.next == null) {
      return node.value;
    } else {
      return node.value + (this.getIntegerFromList(node.next) * 10);
    }
  }

  private SingleLinkedListNode<Integer> getListFromInteger(int number) {

    int numberDiv10 = number / 10;

    if (numberDiv10 < 1) {
      return new SingleLinkedListNode<>(number, null);
    } else {
      return new SingleLinkedListNode<>(number % 10, this.getListFromInteger(numberDiv10));
    }
  }
}
