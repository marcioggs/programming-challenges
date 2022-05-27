package com.marcioggs.codility.trainings.exercise4.treeheight;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        Solution.Tree node20 = new Solution.Tree();
        node20.x = 20;

        Solution.Tree node21 = new Solution.Tree();
        node21.x = 21;

        Solution.Tree node3 = new Solution.Tree();
        node3.x = 3;
        node3.l = node20;
        node3.r = node21;

        Solution.Tree node1 = new Solution.Tree();
        node1.x = 1;

        Solution.Tree node10 = new Solution.Tree();
        node10.x = 10;
        node10.l = node1;

        Solution.Tree node5 = new Solution.Tree();
        node5.x = 5;
        node5.l = node3;
        node5.r = node10;

        assertEquals(2, new Solution().solution(node5));
    }

}