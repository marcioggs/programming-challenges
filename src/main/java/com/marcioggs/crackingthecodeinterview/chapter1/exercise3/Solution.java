package com.marcioggs.crackingthecodeinterview.chapter1.exercise3;

public class Solution {

  public String solution(String text, Integer textLength) {
    char[] chars = text.toCharArray();
    char[] urlfiedText = new char[chars.length];
    int firstUrlfiedTextChar = chars.length - 1;

    for (int i = textLength - 1; i >= 0; i--) {
      if (chars[i] == ' ') {
        urlfiedText[firstUrlfiedTextChar] = '0';
        urlfiedText[firstUrlfiedTextChar - 1] = '2';
        urlfiedText[firstUrlfiedTextChar - 2] = '%';
        firstUrlfiedTextChar -= 3;
      } else {
        urlfiedText[firstUrlfiedTextChar] = chars[i];
        firstUrlfiedTextChar--;
      }
    }

    return new String(urlfiedText);
  }
}
