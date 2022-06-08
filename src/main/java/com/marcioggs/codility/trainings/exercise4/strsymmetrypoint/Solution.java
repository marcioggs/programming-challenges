package com.marcioggs.codility.trainings.exercise4.strsymmetrypoint;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a string S, returns the index (counting from 0) of a character such that the part of
 * the string to the left of that character is a reversal of the part of the string to its right.
 * The function should return −1 if no such index exists.
 * <p>
 * Note: reversing an empty string (i.e. a string whose length is zero) gives an empty string.
 * <p>
 * For example, given a string:
 * <p>
 * "racecar"
 * <p>
 * the function should return 3, because the substring to the left of the character "e" at index 3
 * is "rac", and the one to the right is "car".
 * <p>
 * Given a string:
 * <p>
 * "x"
 * <p>
 * the function should return 0, because both substrings are empty.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * the length of string S is within the range [0..2,000,000]. Copyright 2009–2022 by Codility
 * Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 *
 * <a href="https://app.codility.com/programmers/trainings/4/str_symmetry_point/">...</a>
 */
public class Solution {

  public int solution(String text) {

    if (text.length() % 2 == 0) {
      return -1;
    }

    Deque<Character> stack = new ArrayDeque<>();

    for (int i = 0; i < text.length() / 2; i++) {
      stack.push(text.charAt(i));
    }

    for (int i = text.length() / 2 + 1;
        i < text.length();
        i++) {
      if (stack.pop() != text.charAt(i)) {
        return -1;
      }
    }

    return text.length() / 2;
  }
}
