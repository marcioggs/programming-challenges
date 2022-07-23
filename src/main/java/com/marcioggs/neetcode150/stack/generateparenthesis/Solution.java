package com.marcioggs.neetcode150.stack.generateparenthesis;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public static void main(String[] args) {
    System.out.println(new Solution().generateParenthesis(3));
  }

  public List<String> generateParenthesis(int n) {

    var allCombinations = new ArrayList<String>();

    generateCombinations("", n, 0, 0  , allCombinations);

    return allCombinations;
  }

  private void generateCombinations(
      String combination,
      int n,
      int usedLeftParenthesis,
      int usedRightParenthesis,
      List<String> allCombinations) {

    if (usedLeftParenthesis >= n && usedRightParenthesis >= n) {
      allCombinations.add(combination);
    } else {
      if (usedLeftParenthesis < n) {
        generateCombinations(
            combination + "(", n, usedLeftParenthesis + 1, usedRightParenthesis, allCombinations);
      }
      if (usedRightParenthesis < usedLeftParenthesis) {
        generateCombinations(
            combination + ")", n, usedLeftParenthesis, usedRightParenthesis + 1, allCombinations);
      }
    }
  }
}
