package com.marcioggs.crackingthecodeinterview.chapter4.exercise6;

import static org.junit.Assert.assertEquals;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNodeWithParentRef;
import org.junit.Before;
import org.junit.Test;

/**
 * The following BST is used on the tests.
 *
 * <pre>{@code
 *        6
 *      /   \
 *    2      7
 *   / \      \
 * 1    4      9
 *     / \    /
 *    3   5  8
 * }</pre>
 */
public class SolutionTest {

  private BinaryTreeNodeWithParentRef<Integer> node1;
  private BinaryTreeNodeWithParentRef<Integer> node2;
  private BinaryTreeNodeWithParentRef<Integer> node3;
  private BinaryTreeNodeWithParentRef<Integer> node4;
  private BinaryTreeNodeWithParentRef<Integer> node5;
  private BinaryTreeNodeWithParentRef<Integer> node6;
  private BinaryTreeNodeWithParentRef<Integer> node7;
  private BinaryTreeNodeWithParentRef<Integer> node8;
  private BinaryTreeNodeWithParentRef<Integer> node9;

  @Before
  public void setup() {
    node1 = new BinaryTreeNodeWithParentRef<>(1, null, null, null);
    node2 = new BinaryTreeNodeWithParentRef<>(2, null, null, null);
    node3 = new BinaryTreeNodeWithParentRef<>(3, null, null, null);
    node4 = new BinaryTreeNodeWithParentRef<>(4, null, null, null);
    node5 = new BinaryTreeNodeWithParentRef<>(5, null, null, null);
    node6 = new BinaryTreeNodeWithParentRef<>(6, null, null, null);
    node7 = new BinaryTreeNodeWithParentRef<>(7, null, null, null);
    node8 = new BinaryTreeNodeWithParentRef<>(8, null, null, null);
    node9 = new BinaryTreeNodeWithParentRef<>(9, null, null, null);

    node6.setLeft(node2);
    node6.setRight(node7);
    node2.setLeft(node1);
    node2.setRight(node4);
    node2.setParent(node6);
    node1.setParent(node2);
    node4.setParent(node2);
    node4.setLeft(node3);
    node4.setRight(node5);
    node3.setParent(node4);
    node5.setParent(node4);
    node7.setRight(node9);
    node7.setParent(node6);
    node9.setLeft(node8);
    node9.setParent(node7);
    node8.setParent(node9);
  }

  @Test
  public void testCases() {
    assertEquals(node2.getValue(), new Solution().findNextNode(node1).getValue());
    assertEquals(node3.getValue(), new Solution().findNextNode(node2).getValue());
    assertEquals(node4.getValue(), new Solution().findNextNode(node3).getValue());
    assertEquals(node5.getValue(), new Solution().findNextNode(node4).getValue());
    assertEquals(node6.getValue(), new Solution().findNextNode(node5).getValue());
    assertEquals(node7.getValue(), new Solution().findNextNode(node6).getValue());
    assertEquals(node8.getValue(), new Solution().findNextNode(node7).getValue());
    assertEquals(node9.getValue(), new Solution().findNextNode(node8).getValue());
    assertEquals(null, new Solution().findNextNode(node9));
  }
}
