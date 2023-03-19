package com.marcioggs.crackingthecodeinterview.chapter2.exercise8;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findStartOfLoopNull() {
        assertEquals(null, new Solution().findStartOfLoop(null));
    }

    @Test
    public void findStartOfLoopSingleWithoutLoop() {
        assertEquals(null, new Solution().findStartOfLoop(new SingleLinkedListNode<>(1, null)));
    }

    @Test
    public void findStartOfLoopSingleWithLoop() {
        SingleLinkedListNode<Integer> one = new SingleLinkedListNode<>(1, null);
        one.next = one;
        assertSame(one, new Solution().findStartOfLoop(one));
    }

    @Test
    public void findStartOfLoop() {
        SingleLinkedListNode<Integer> two = new SingleLinkedListNode<>(2, null);
        SingleLinkedListNode<Integer> one = new SingleLinkedListNode<>(1, two);

        assertSame(null, new Solution().findStartOfLoop(one));
    }

    @Test
    public void findStartOfLoop2() {
        SingleLinkedListNode<Character> e = new SingleLinkedListNode<>('E', null);
        SingleLinkedListNode<Character> d = new SingleLinkedListNode<>('D', e);
        SingleLinkedListNode<Character> c = new SingleLinkedListNode<>('C', d);
        SingleLinkedListNode<Character> b = new SingleLinkedListNode<>('B', c);
        SingleLinkedListNode<Character> a = new SingleLinkedListNode<>('A', b);
        e.next = c;

        assertSame(c, new Solution().findStartOfLoop(a));
    }
}