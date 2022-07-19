package com.marcioggs.neetcode150.twopointers.longestrepeatingcharacterreplacement;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SlowSolutionTest {

  @Test
  public void characterReplacement() {

    assertEquals(0, new SlowSolution().characterReplacement("", 1));
    assertEquals(1, new SlowSolution().characterReplacement("A", 1));
    assertEquals(2, new SlowSolution().characterReplacement("AB", 1));
    assertEquals(2, new SlowSolution().characterReplacement("AA", 1));
    assertEquals(3, new SlowSolution().characterReplacement("ABA", 1));
    assertEquals(3, new SlowSolution().characterReplacement("ABBA", 1));
    assertEquals(4, new SlowSolution().characterReplacement("ABAB", 2));
    assertEquals(4, new SlowSolution().characterReplacement("AABABBA", 1));
    assertEquals(4, new SlowSolution().characterReplacement("ABBB", 1));
    assertEquals(4, new SlowSolution().characterReplacement("AAAA", 2));
    assertEquals(4, new SlowSolution().characterReplacement("ABBB", 2));
    assertEquals(
        7,
        new SlowSolution()
            .characterReplacement(
                "KRSCDCSONAJNHLBMDQGIFCPEKPOHQIHLTDIQGEKLRLCQNBOHNDQGHJPNDQPERNFSSSRDEQLFPCCCARFMDLHADJADAGNNSBNCJQOF",
                4));
  }
}
