package com.marcioggs.crackingthecodeinterview.chapter3.exercise5;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void sortStack() {
        assertEquals(null, new Solution().sortStack(null));
        assertEquals(0, new Solution().sortStack(new ArrayDeque<Integer>()).size());

        Deque<Integer> stack = new Solution().sortStack(new ArrayDeque<>(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Integer.valueOf(1), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(true, stack.isEmpty());

        stack = new Solution().sortStack(new ArrayDeque<>(Arrays.asList(4, 3, 2, 1)));
        assertEquals(Integer.valueOf(1), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(true, stack.isEmpty());

        stack = new Solution().sortStack(new ArrayDeque<>(Arrays.asList(4, 1, 3, 2)));
        assertEquals(Integer.valueOf(1), stack.pop());
        assertEquals(Integer.valueOf(2), stack.pop());
        assertEquals(Integer.valueOf(3), stack.pop());
        assertEquals(Integer.valueOf(4), stack.pop());
        assertEquals(true, stack.isEmpty());
    }
}