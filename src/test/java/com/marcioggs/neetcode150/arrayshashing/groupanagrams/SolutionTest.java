package com.marcioggs.neetcode150.arrayshashing.groupanagrams;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void groupAnagrams() {

    assertEquals(
        3,
        new Solution()
            .groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"})
            .size());
  }
}
