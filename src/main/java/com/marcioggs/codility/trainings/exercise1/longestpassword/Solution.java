package com.marcioggs.codility.trainings.exercise1.longestpassword;

import java.util.Arrays;
import java.util.Optional;

/**
 * You would like to set a password for a bank account. However, there are three restrictions on the
 * format of the password:
 * <p>
 * it has to contain only alphanumerical characters (a−z, A−Z, 0−9); there should be an even number
 * of letters; there should be an odd number of digits. You are given a string S consisting of N
 * characters. String S can be divided into words by splitting it at, and removing, the spaces. The
 * goal is to choose the longest word that is a valid password. You can assume that if there are K
 * spaces in string S then there are exactly K + 1 words.
 * <p>
 * For example, given "test 5 a0A pass007 ?xy1", there are five words and three of them are valid
 * passwords: "5", "a0A" and "pass007". Thus the longest password is "pass007" and its length is 7.
 * Note that neither "test" nor "?xy1" is a valid password, because "?" is not an alphanumerical
 * character and "test" contains an even number of digits (zero).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(String S); }
 * <p>
 * that, given a non-empty string S consisting of N characters, returns the length of the longest
 * word from the string that is a valid password. If there is no such word, your function should
 * return −1.
 * <p>
 * For example, given S = "test 5 a0A pass007 ?xy1", your function should return 7, as explained
 * above.
 * <p>
 * Assume that:
 * <p>
 * N is an integer within the range [1..200]; string S consists only of printable ASCII characters
 * and spaces. In your solution, focus on correctness. The performance of your solution will not be
 * the focus of the assessment.
 * <p>
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication
 * or disclosure prohibited.
 * <p>
 * https://app.codility.com/programmers/trainings/1/longest_password/
 */
public class Solution {

  public int getLongestValidPasswordLength(String passwordsText) {

    String[] passwords = passwordsText.split(" ");

    Optional<String> longestPassword =
        Arrays.stream(passwords)
            .filter(this::containsOnlyAlphanumericalChars)
            .filter(this::hasEvenNumberOfLetters)
            .filter(this::hasOddNumberOfDigits)
            .min(this::orderByLengthDesc);

    return longestPassword.map(String::length).orElse(-1);
  }

  private boolean containsOnlyAlphanumericalChars(String text) {
    return text.matches("^[a-zA-Z0-9]+$");
  }

  private boolean hasEvenNumberOfLetters(String text) {
    return text.replaceAll("[0-9]*", "").length() % 2 == 0;
  }

  private boolean hasOddNumberOfDigits(String text) {
    return text.replaceAll("[a-zA-Z]*", "").length() % 2 == 1;
  }

  private int orderByLengthDesc(String text1, String text2) {
    return text2.length() - text1.length();
  }
}
