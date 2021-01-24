package com.marcioggs.crackingthecodeinterview.chapter2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void singleElementShouldNotBeChanged() {
        LinkedListNode<Integer> el1 = new LinkedListNode<>(1, null);

        Solution.deleteMiddleNode(el1);

        assertEquals(el1.value, Integer.valueOf(1));
        assertNull(el1.next);
    }

    @Test
    public void twoElementsShouldNotBeChanged() {
        LinkedListNode<Integer> el2 = new LinkedListNode<>(2, null);
        LinkedListNode<Integer> el1 = new LinkedListNode<>(1, el2);

        Solution.deleteMiddleNode(el1);

        assertEquals(el1.value, Integer.valueOf(1));
        assertEquals(el1.next, el2);
        assertEquals(el2.value, Integer.valueOf(2));
        assertNull(el2.next);
    }

    @Test
    public void threeElementsShouldRemoveSecondElement() {
        LinkedListNode<Integer> el3 = new LinkedListNode<>(3, null);
        LinkedListNode<Integer> el2 = new LinkedListNode<>(2, el3);
        LinkedListNode<Integer> el1 = new LinkedListNode<>(1, el2);

        Solution.deleteMiddleNode(el1);

        assertEquals(el1.value, Integer.valueOf(1));
        assertEquals(el1.next, el3);
        assertEquals(el3.value, Integer.valueOf(3));
        assertNull(el3.next);
    }

    @Test
    public void fourElementsShouldRemoveThirdElement() {
        LinkedListNode<Integer> el4 = new LinkedListNode<>(4, null);
        LinkedListNode<Integer> el3 = new LinkedListNode<>(3, el4);
        LinkedListNode<Integer> el2 = new LinkedListNode<>(2, el3);
        LinkedListNode<Integer> el1 = new LinkedListNode<>(1, el2);

        Solution.deleteMiddleNode(el1);

        assertEquals(el1.value, Integer.valueOf(1));
        assertEquals(el1.next, el2);
        assertEquals(el2.value, Integer.valueOf(2));
        assertEquals(el2.next, el4);
        assertEquals(el4.value, Integer.valueOf(4));
        assertNull(el4.next);
    }
}


