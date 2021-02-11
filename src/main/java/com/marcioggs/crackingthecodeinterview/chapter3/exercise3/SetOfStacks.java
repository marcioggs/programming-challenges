package com.marcioggs.crackingthecodeinterview.chapter3.exercise3;

import java.util.*;

public class SetOfStacks<T> {

  private List<Stack<T>> stacks;

  private int stackLimit;

  public SetOfStacks(int stackLimit) {
    if (stackLimit <= 0) {
      throw new IllegalArgumentException();
    }
    this.stacks = new ArrayList<>();
    this.stacks.add(new Stack<>());
    this.stackLimit = stackLimit;
  }

  public T push(T item) {
    Stack<T> lastStack = this.getLastStack();

    if (lastStack.size() == this.stackLimit) {
      lastStack = new Stack<>();
      this.stacks.add(lastStack);
    }

    return lastStack.push(item);
  }

  private Stack<T> getLastStack() {
    return this.stacks.get(this.stacks.size() - 1);
  }

  public T pop() {
    Stack<T> lastStack = this.getLastStack();

    T popped = lastStack.pop();

    if (lastStack.size() == 0 && this.stacks.size() > 1) {
      this.stacks.remove(lastStack);
    }

    return popped;
  }

  public T popAt(int index) {
    if (index > this.stacks.size() - 1) {
      throw new IllegalArgumentException();
    }
    return this.stacks.get(index).pop();
  }
}
