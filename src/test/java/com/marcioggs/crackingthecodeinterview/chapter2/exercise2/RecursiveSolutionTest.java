package com.marcioggs.crackingthecodeinterview.chapter2.exercise2;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveSolutionTest {

    @Test
    public void returnKthToLast1() {
        SingleLinkedListNode<Integer> fourth = new SingleLinkedListNode<>(4, null);
        SingleLinkedListNode<Integer> third = new SingleLinkedListNode<>(3, fourth);
        SingleLinkedListNode<Integer> second = new SingleLinkedListNode<>(2, third);
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, second);

        assertEquals(fourth, new RecursiveSolution().returnKthToLast(first, 0));
    }

    @Test
    public void returnKthToLast2() {
        SingleLinkedListNode<Integer> fourth = new SingleLinkedListNode<>(4, null);
        SingleLinkedListNode<Integer> third = new SingleLinkedListNode<>(3, fourth);
        SingleLinkedListNode<Integer> second = new SingleLinkedListNode<>(2, third);
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, second);

        assertEquals(second, new RecursiveSolution().returnKthToLast(first, 2));
    }
}