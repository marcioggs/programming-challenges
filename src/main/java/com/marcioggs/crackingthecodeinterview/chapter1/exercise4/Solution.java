package com.marcioggs.crackingthecodeinterview.chapter1.exercise4;

import java.util.HashMap;
import java.util.Map;

public class Solution {

  public boolean solution(String text) {

    Map<Character, Integer> lettersCount = this.buildLettersCountMap(text);

    boolean foundOddLetterCount = false;

    for (Integer letterCount : lettersCount.values()) {
      if (letterCount % 2 == 1) {
        if (foundOddLetterCount) {
          return false;
        } else {
          foundOddLetterCount = true;
        }
      }
    }

    return true;
  }

  private Map<Character, Integer> buildLettersCountMap(String text) {

    Map<Character, Integer> lettersCount = new HashMap<>();

    for (char letter : text.toLowerCase().toCharArray()) {
      if (letter == ' ') {
        continue;
      }
      lettersCount.merge(letter, 1, Integer::sum);
    }

    return lettersCount;
  }
}
