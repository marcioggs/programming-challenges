package com.marcioggs.crackingthecodeinterview.chapter2.exercise3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void singleElementShouldNotBeChanged() {
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, null);

    Solution.deleteMiddleNode(el1);

    assertEquals(el1.value, Integer.valueOf(1));
    assertNull(el1.next);
  }

  @Test
  public void twoElementsShouldNotBeChanged() {
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(2, null);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

    Solution.deleteMiddleNode(el1);

    assertEquals(el1.value, Integer.valueOf(1));
    assertEquals(el1.next, el2);
    assertEquals(el2.value, Integer.valueOf(2));
    assertNull(el2.next);
  }

  @Test
  public void threeElementsShouldRemoveSecondElement() {
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(3, null);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(2, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

    Solution.deleteMiddleNode(el1);

    assertEquals(el1.value, Integer.valueOf(1));
    assertEquals(el1.next, el3);
    assertEquals(el3.value, Integer.valueOf(3));
    assertNull(el3.next);
  }

  @Test
  public void fourElementsShouldRemoveThirdElement() {
    SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(4, null);
    SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(3, el4);
    SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(2, el3);
    SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

    Solution.deleteMiddleNode(el1);

    assertEquals(el1.value, Integer.valueOf(1));
    assertEquals(el1.next, el2);
    assertEquals(el2.value, Integer.valueOf(2));
    assertEquals(el2.next, el4);
    assertEquals(el4.value, Integer.valueOf(4));
    assertNull(el4.next);
  }
}


