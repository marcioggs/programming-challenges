package com.marcioggs.neetcode150.arrayshashing.validanagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(true, new Solution().isAnagram("anagram", "nagaram"));
    assertEquals(false, new Solution().isAnagram("rat", "car"));
    assertEquals(false, new Solution().isAnagram("rat", "rata"));
  }

}