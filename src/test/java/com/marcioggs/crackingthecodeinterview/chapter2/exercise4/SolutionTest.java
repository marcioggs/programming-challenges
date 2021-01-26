package com.marcioggs.crackingthecodeinterview.chapter2.exercise4;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void mixedValuesTestCase() {
    SingleLinkedListNode<Integer> el7 = new SingleLinkedListNode<>(1, null);
    SingleLinkedListNode<Integer> el6 = new SingleLinkedListNode<>(2, el7);
    SingleLinkedListNode<Integer> el5 = new SingleLinkedListNode<>(10, el6);
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(5, el5);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(8, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(5, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(3, el2);

    new Solution().partitionOnValue(el1, 5);

    assertTrue(isCorrectlyPartitioned(el1, 5));
  }

  @Test
  public void onlyHigherValuesTestCase() {
    SingleLinkedListNode<Integer> el7 = new SingleLinkedListNode<>(10, null);
    SingleLinkedListNode<Integer> el6 = new SingleLinkedListNode<>(9, el7);
    SingleLinkedListNode<Integer> el5 = new SingleLinkedListNode<>(8, el6);
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(7, el5);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(6, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(5, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(5, el2);

    new Solution().partitionOnValue(el1, 5);

    assertTrue(isCorrectlyPartitioned(el1, 5));
  }

  @Test
  public void onlyLowerValuesTestCase() {
    SingleLinkedListNode<Integer> el7 = new SingleLinkedListNode<>(1, null);
    SingleLinkedListNode<Integer> el6 = new SingleLinkedListNode<>(2, el7);
    SingleLinkedListNode<Integer> el5 = new SingleLinkedListNode<>(3, el6);
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(1, el5);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(2, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(3, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

    new Solution().partitionOnValue(el1, 5);

    assertTrue(isCorrectlyPartitioned(el1, 5));
  }

  @Test
  public void oneHigherValueTestCase() {
    SingleLinkedListNode<Integer> el7 = new SingleLinkedListNode<>(1, null);
    SingleLinkedListNode<Integer> el6 = new SingleLinkedListNode<>(2, el7);
    SingleLinkedListNode<Integer> el5 = new SingleLinkedListNode<>(3, el6);
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(9, el5);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(2, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(3, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

    new Solution().partitionOnValue(el1, 5);

    assertTrue(isCorrectlyPartitioned(el1, 5));
  }

  @Test
  public void oneLowerValueTestCase() {
    SingleLinkedListNode<Integer> el7 = new SingleLinkedListNode<>(10, null);
    SingleLinkedListNode<Integer> el6 = new SingleLinkedListNode<>(9, el7);
    SingleLinkedListNode<Integer> el5 = new SingleLinkedListNode<>(8, el6);
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(7, el5);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(1, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(5, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(5, el2);

    new Solution().partitionOnValue(el1, 5);

    assertTrue(isCorrectlyPartitioned(el1, 5));
  }

  private boolean isCorrectlyPartitioned(
      SingleLinkedListNode<Integer> node, Integer partitionValue) {

    boolean isCorrectlyPartitioned = true;
    boolean startedRightSide = false;

    while (node.next != null) {
      if (!startedRightSide && node.value >= partitionValue) {
        startedRightSide = true;
      }

      if (startedRightSide && node.value < partitionValue) {
        isCorrectlyPartitioned = false;
        break;
      }

      node = node.next;
    }

    return isCorrectlyPartitioned;
  }
}
