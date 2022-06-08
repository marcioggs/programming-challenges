package com.marcioggs.crackingthetoptalinterview.chapter3.exercise4;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Balanced brackets: given a mathematical operation,find out if the brackets are placed such that
 * the equation is valid. There are 3 types of brackets: (,[,{. For example, ([4*{2+3}]) is
 * balanced, but {[3} is unbalanced.
 */
public class Solution {

  public boolean areBracketsBalanced(String text) {
    Deque<Character> pendingOpenBrackets = new ArrayDeque<>();

    for (char letter : text.toCharArray()) {

      if (letter == '(' || letter == '[' || letter == '{') {
        pendingOpenBrackets.push(letter);
      } else if (letter == ')') {
        if (pendingOpenBrackets.isEmpty() || pendingOpenBrackets.pop() != '(') {
          return false;
        }
      } else if (letter == ']') {
        if (pendingOpenBrackets.isEmpty() || pendingOpenBrackets.pop() != '[') {
          return false;
        }
      } else if (letter == '}') {
        if (pendingOpenBrackets.isEmpty() || pendingOpenBrackets.pop() != '{') {
          return false;
        }
      }
    }

    return pendingOpenBrackets.isEmpty();
  }
}
