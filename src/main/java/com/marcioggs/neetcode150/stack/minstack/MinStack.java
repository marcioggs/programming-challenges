package com.marcioggs.neetcode150.stack.minstack;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * https://leetcode.com/problems/min-stack/
 *
 * <p>Runtime: 6 ms, faster than 75.94% of Java online submissions for Min Stack.
 *
 * <p>Memory Usage: 48 MB, less than 73.10% of Java online submissions for Min Stack.
 */
public class MinStack {

  Deque<Integer> stack = new ArrayDeque<>();
  List<Integer> mins = new ArrayList<>();

  public MinStack() {}

  public void push(int val) {
    if (getMinInternal() == null || val <= getMinInternal()) {
      mins.add(val);
    }
    stack.push(val);
  }

  public void pop() {
    Integer popped = stack.pop();
    if (popped.equals(getMinInternal())) {
      mins.remove(mins.size() - 1);
    }
  }

  public int top() {
    Integer peeked = stack.peek();
    return peeked == null ? 0 : peeked;
  }

  public int getMin() {
    return getMinInternal() == null ? 0 : getMinInternal();
  }

  private Integer getMinInternal() {
    return mins.isEmpty() ? null : mins.get(mins.size() - 1);
  }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj = new MinStack();
 * obj.push(val); obj.pop(); int param_3 = obj.top(); int param_4 = obj.getMin();
 */
