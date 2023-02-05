package com.marcioggs.crackingthecodeinterview.chapter4.exercise3;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getBinaryTreeLevels() {
        assertEquals(null, new Solution().getBinaryTreeLevels(null));
    }

    @Test
    public void getBinaryTreeLevels2() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        List<LinkedList<BinaryTreeNode<Integer>>> levels = new Solution().getBinaryTreeLevels(node1);

        assertEquals(1, levels.size());
        assertEquals(1, levels.get(0).size());
        assertEquals(node1, levels.get(0).get(0));
    }

    @Test
    public void getBinaryTreeLevels3() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>();
        node1.setLeft(node2);
        node1.setRight(node3);
        List<LinkedList<BinaryTreeNode<Integer>>> levels = new Solution().getBinaryTreeLevels(node1);

        assertEquals(2, levels.size());
        assertEquals(1, levels.get(0).size());
        assertEquals(2, levels.get(1).size());
        assertEquals(node1, levels.get(0).get(0));
        assertEquals(node2, levels.get(1).get(0));
        assertEquals(node3, levels.get(1).get(1));
    }

    @Test
    public void getBinaryTreeLevels4() {
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node3 = new BinaryTreeNode<>();
        node1.setLeft(node2);
        node1.setRight(node3);
        BinaryTreeNode<Integer> node4 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node5 = new BinaryTreeNode<>();
        BinaryTreeNode<Integer> node6 = new BinaryTreeNode<>();
        node2.setLeft(node4);
        node2.setRight(node5);
        node3.setRight(node6);
        List<LinkedList<BinaryTreeNode<Integer>>> levels = new Solution().getBinaryTreeLevels(node1);

        assertEquals(3, levels.size());
        assertEquals(1, levels.get(0).size());
        assertEquals(2, levels.get(1).size());
        assertEquals(3, levels.get(2).size());
        assertEquals(node1, levels.get(0).get(0));
        assertEquals(node2, levels.get(1).get(0));
        assertEquals(node3, levels.get(1).get(1));
        assertEquals(node4, levels.get(2).get(0));
        assertEquals(node5, levels.get(2).get(1));
        assertEquals(node6, levels.get(2).get(2));
    }
}