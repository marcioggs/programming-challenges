package com.marcioggs.crackingthecodeinterview.chapter3.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {


    @Test
    public void testMyQueue() {

        MyQueue<Integer> queue = new MyQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        assertEquals(Integer.valueOf(1), queue.remove());
        assertEquals(Integer.valueOf(2), queue.remove());
        assertEquals(Integer.valueOf(3), queue.remove());
        assertEquals(Integer.valueOf(4), queue.remove());

        assertThrows(
                IllegalStateException.class,
                queue::remove
        );
    }
}