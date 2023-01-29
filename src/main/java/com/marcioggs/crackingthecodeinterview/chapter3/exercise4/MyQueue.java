package com.marcioggs.crackingthecodeinterview.chapter3.exercise4;

import java.util.Deque;
import java.util.ArrayDeque;

public class MyQueue<T> {
    private final Deque<T> head = new ArrayDeque<>();
    private final Deque<T> tail = new ArrayDeque<>(); // 54321

    public void add(T element) {
        while (!head.isEmpty()) {
            tail.push(head.pop());
        }

        tail.push(element);
    }

    public T remove() throws IllegalStateException {
        while (!tail.isEmpty()) {
            head.push(tail.pop());
        }
        if (head.isEmpty()) {
            throw new IllegalStateException("No element left to remove.");
        }
        return head.pop();
    }
}