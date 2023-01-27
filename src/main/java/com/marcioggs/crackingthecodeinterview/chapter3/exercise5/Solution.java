package com.marcioggs.crackingthecodeinterview.chapter3.exercise5;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public <T extends Comparable<T>> Deque<T> sortStack(Deque<T> stack) {
        if (stack == null) {
            return null;
        }

        Deque<T> auxStack = new ArrayDeque<>();

        while (!stack.isEmpty()) {
            T element = stack.pop();
            while (!auxStack.isEmpty() && element.compareTo(auxStack.peek()) < 0) {
                stack.push(auxStack.pop());
            }
            auxStack.push(element);
        }

        while (!auxStack.isEmpty()) {
            stack.push(auxStack.pop());
        }

        return stack;
    }
}
