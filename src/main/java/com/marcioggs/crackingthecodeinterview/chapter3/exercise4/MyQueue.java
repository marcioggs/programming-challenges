package com.marcioggs.crackingthecodeinterview.chapter3.exercise4;

import java.util.Deque;
import java.util.ArrayDeque;

public class MyQueue<T> {
    private final Deque<T> head = new ArrayDeque<>();
    private final Deque<T> tail = new ArrayDeque<>();

    public void add(T element) {
        tail.push(element);

        while (!head.isEmpty()) {
            tail.push(head.pop());
        }

        head.push(element);

        while (tail.size() != head.size()) {
            head.push(tail.pop());
        }
    }

    public T remove() throws IllegalStateException {
        if (head.isEmpty()) {
            throw new IllegalStateException("No element left to remove.");
        }

        T removed = head.pop();

        while (!tail.isEmpty()) {
            head.push(tail.pop());
        }

        head.pop();

        while (head.size() != tail.size()) {
            tail.push(head.pop());
        }

        return removed;
    }
}