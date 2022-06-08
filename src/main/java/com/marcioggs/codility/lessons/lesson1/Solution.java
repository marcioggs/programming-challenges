package com.marcioggs.codility.lessons.lesson1;

/**
 * https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 */
public class Solution {

  public int solution(int number) {
    int longestGap = 0;
    int currentGap = 0;
    boolean gapStarted = false;

    for (char currentChar : Integer.toBinaryString(number).toCharArray()) {
      boolean isZero = currentChar == '0';

      if (!gapStarted && isZero) {
        continue;
      } else {
        gapStarted = true;
      }

      if (isZero) {
        currentGap++;
      } else {
        longestGap = Math.max(currentGap, longestGap);
        currentGap = 0;
      }
    }

    return longestGap;
  }
}