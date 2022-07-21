package com.marcioggs.neetcode150.twopointers.longestrepeatingcharacterreplacement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void characterReplacement() {

    assertEquals(0, new Solution().characterReplacement("", 1));
    assertEquals(1, new Solution().characterReplacement("A", 1));
    assertEquals(2, new Solution().characterReplacement("AB", 1));
    assertEquals(2, new Solution().characterReplacement("AA", 1));
    assertEquals(3, new Solution().characterReplacement("ABA", 1));
    assertEquals(3, new Solution().characterReplacement("ABBA", 1));
    assertEquals(4, new Solution().characterReplacement("ABAB", 2));
    assertEquals(4, new Solution().characterReplacement("AABABBA", 1));
    assertEquals(4, new Solution().characterReplacement("ABBB", 1));
    assertEquals(4, new Solution().characterReplacement("AAAA", 2));
    assertEquals(4, new Solution().characterReplacement("ABBB", 2));
    assertEquals(
        7,
        new Solution()
            .characterReplacement(
                "KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF",
                4));
  }
}
