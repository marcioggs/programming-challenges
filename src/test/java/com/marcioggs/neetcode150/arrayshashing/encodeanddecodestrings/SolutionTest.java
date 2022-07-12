package com.marcioggs.neetcode150.arrayshashing.encodeanddecodestrings;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    List<String> words = Arrays.asList("25#aaaaaaaaaa", "37#bbbbbbbbbbb", "49#ccc");
    var encoded = new Solution().encode(words);
    assertEquals(words, new Solution().decode(encoded));
  }
}
