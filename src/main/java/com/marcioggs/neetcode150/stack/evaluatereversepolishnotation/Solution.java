package com.marcioggs.neetcode150.stack.evaluatereversepolishnotation;

import java.util.ArrayDeque;

public class Solution {
  public int evalRPN(String[] tokens) {

    var lastOperands = new ArrayDeque<Integer>();

    for (String token : tokens) {
      if (!isOperator(token)) {
        lastOperands.push(Integer.parseInt(token));
      } else {
        var operand2 = lastOperands.pop();
        var operand1 = lastOperands.pop();
        var result = switch (token) {
          case "+" -> operand1 + operand2;
          case "-" -> operand1 - operand2;
          case "*" -> operand1 * operand2;
          default -> operand1 / operand2;
        };
        lastOperands.push(result);
      }
    }

    return lastOperands.pop();
  }

  private boolean isOperator(String token) {
    return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
  }
}
