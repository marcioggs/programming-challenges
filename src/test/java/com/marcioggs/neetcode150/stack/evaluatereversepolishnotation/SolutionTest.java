package com.marcioggs.neetcode150.stack.evaluatereversepolishnotation;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void evalRPN() {

    assertEquals(9, new Solution().evalRPN(new String [] {"2","1","+","3","*"}));
    assertEquals(6, new Solution().evalRPN(new String [] {"4","13","5","/","+"}));
    assertEquals(22, new Solution().evalRPN(new String [] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
  }
}