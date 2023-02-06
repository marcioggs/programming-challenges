package com.marcioggs.crackingthecodeinterview.chapter4.exercise4;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSimpleCases() {
        assertEquals(true, new Solution().isBalancedBinaryTree(null));
        assertEquals(true, new Solution().isBalancedBinaryTree(new BinaryTreeNode<Integer>()));
    }

    @Test
    public void testSimpleCases2() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>();
        node1.setLeft(node2);

        assertEquals(true, new Solution().isBalancedBinaryTree(node1));
    }

    @Test
    public void testSimpleCases3() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>();
        node1.setLeft(node2);
        node1.setRight(node3);

        assertEquals(true, new Solution().isBalancedBinaryTree(node1));
    }

    @Test
    public void testSimpleCases4() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>();
        node1.setLeft(node2);
        node2.setRight(node3);

        assertEquals(false, new Solution().isBalancedBinaryTree(node1));
    }
}