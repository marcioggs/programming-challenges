package com.marcioggs.crackingthecodeinterview.chapter4.exercise5;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class SolutionTest {

    @Test
    public void isBST1() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);

        node1.setRight(node2);
        node1.setLeft(node3);

        assertEquals(false, new Solution().isBST(node1));
    }

    @Test
    public void isBST2() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>(3);

        node2.setRight(node1);
        node2.setLeft(node3);

        assertEquals(false, new Solution().isBST(node2));
    }

    @Test
    public void isBST3() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);

        assertEquals(true, new Solution().isBST(node1));
    }

    @Test
    public void isBST4() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);

        node1.setRight(node2);

        assertEquals(true, new Solution().isBST(node2));
    }

    @Test
    public void isBST5() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);

        node2.setRight(node1);

        assertEquals(false, new Solution().isBST(node2));
    }

    @Test
    public void isBST6() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(1);
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(2);

        node1.setLeft(node2);

        assertEquals(false, new Solution().isBST(node1));
    }
}