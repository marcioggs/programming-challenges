package com.marcioggs.crackingthecodeinterview.chapter2.exercise7;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findIntersection() {
        SingleLinkedListNode<Integer> el4 = new SingleLinkedListNode<>(4, null);
        SingleLinkedListNode<Integer> el3 = new SingleLinkedListNode<>(3, el4);
        SingleLinkedListNode<Integer> el2 = new SingleLinkedListNode<>(2, el3);
        SingleLinkedListNode<Integer> el1 = new SingleLinkedListNode<>(1, el2);

        SingleLinkedListNode<Integer> el9 = new SingleLinkedListNode<>(9, el3);

        assertEquals(el3, new Solution().findIntersection(el1, el9));
    }
}