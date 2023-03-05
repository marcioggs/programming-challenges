package com.marcioggs.crackingthecodeinterview.chapter2.exercise1;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void removeDuplicates1() {
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, null);

        new Solution().removeDuplicates(first);

        assertEquals(1, (int) first.value);
        assertNull(first.next);
    }

    @Test
    public void removeDuplicates2() {
        SingleLinkedListNode<Integer> second = new SingleLinkedListNode<>(2, null);
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, second);

        new Solution().removeDuplicates(first);

        assertEquals(1, (int) first.value);
        assertEquals(2, (int) first.next.value);
        assertNull(first.next.next);
    }

    @Test
    public void removeDuplicates3() {
        SingleLinkedListNode<Integer> second = new SingleLinkedListNode<>(1, null);
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, second);

        new Solution().removeDuplicates(first);

        assertEquals(1, (int) first.value);
        assertNull(first.next);
    }

    @Test
    public void removeDuplicates4() {
        SingleLinkedListNode<Integer> fourth = new SingleLinkedListNode<>(3, null);
        SingleLinkedListNode<Integer> third = new SingleLinkedListNode<>(1, fourth);
        SingleLinkedListNode<Integer> second = new SingleLinkedListNode<>(2, third);
        SingleLinkedListNode<Integer> first = new SingleLinkedListNode<>(1, second);

        new Solution().removeDuplicates(first);

        assertEquals(1, (int) first.value);
        assertEquals(2, (int) first.next.value);
        assertEquals(3, (int) first.next.next.value);
        assertNull(first.next.next.next);
    }
}