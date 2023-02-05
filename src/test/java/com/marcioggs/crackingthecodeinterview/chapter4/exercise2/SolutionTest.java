package com.marcioggs.crackingthecodeinterview.chapter4.exercise2;


import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void shouldWorkWithOneElement() {

        BinaryTreeNode<Integer> minHeightBinarySearchTree = new Solution().buildBinarySearchTreeWithMinimalHeight(new int[]{1});

        assertEquals(1, (int) minHeightBinarySearchTree.getValue());
        assertEquals(null, minHeightBinarySearchTree.getLeft());
        assertEquals(null, minHeightBinarySearchTree.getRight());
    }

    @Test
    public void shouldWorkWithTwoElements() {

        BinaryTreeNode<Integer> minHeightBinarySearchTree = new Solution().buildBinarySearchTreeWithMinimalHeight(new int[]{1, 2});

        assertEquals(2, (int) minHeightBinarySearchTree.getValue());
        assertEquals(1, (int) minHeightBinarySearchTree.getLeft().getValue());
        assertEquals(null, minHeightBinarySearchTree.getRight());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getRight());
    }

    @Test
    public void shouldWorkWithThreeElements() {

        BinaryTreeNode<Integer> minHeightBinarySearchTree = new Solution().buildBinarySearchTreeWithMinimalHeight(new int[]{1, 2, 3});

        assertEquals(2, (int) minHeightBinarySearchTree.getValue());
        assertEquals(1, (int) minHeightBinarySearchTree.getLeft().getValue());
        assertEquals(3, (int) minHeightBinarySearchTree.getRight().getValue());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getRight());
        assertEquals(null, minHeightBinarySearchTree.getRight().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getRight().getRight());
    }

    @Test
    public void shouldWorkWithFourElements() {

        BinaryTreeNode<Integer> minHeightBinarySearchTree = new Solution().buildBinarySearchTreeWithMinimalHeight(new int[]{1, 2, 3, 4});

        assertEquals(3, (int) minHeightBinarySearchTree.getValue());
        assertEquals(2, (int) minHeightBinarySearchTree.getLeft().getValue());
        assertEquals(4, (int) minHeightBinarySearchTree.getRight().getValue());
        assertEquals(1, (int) minHeightBinarySearchTree.getLeft().getLeft().getValue());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getRight());
        assertEquals(null, minHeightBinarySearchTree.getRight().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getRight().getRight());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft().getRight());
    }

    @Test
    public void shouldWorkWithFiveElements() {

        BinaryTreeNode<Integer> minHeightBinarySearchTree = new Solution().buildBinarySearchTreeWithMinimalHeight(new int[]{1, 2, 3, 4, 5});

        assertEquals(3, (int) minHeightBinarySearchTree.getValue());

        assertEquals(2, (int) minHeightBinarySearchTree.getLeft().getValue());
        assertEquals(5, (int) minHeightBinarySearchTree.getRight().getValue());

        assertEquals(1, (int) minHeightBinarySearchTree.getLeft().getLeft().getValue());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getRight());

        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getLeft().getLeft().getRight());

        assertEquals(4, (int) minHeightBinarySearchTree.getRight().getLeft().getValue());
        assertEquals(null, minHeightBinarySearchTree.getRight().getRight());

        assertEquals(null, minHeightBinarySearchTree.getRight().getLeft().getLeft());
        assertEquals(null, minHeightBinarySearchTree.getRight().getLeft().getRight());
    }
}