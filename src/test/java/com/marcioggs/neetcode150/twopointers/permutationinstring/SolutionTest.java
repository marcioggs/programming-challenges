package com.marcioggs.neetcode150.twopointers.permutationinstring;

import static org.junit.Assert.*;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void checkInclusion() {
   assertEquals(true, new Solution().checkInclusion("adc", "dcda"));
   assertEquals(true, new Solution().checkInclusion("ab", "eidbaooo"));
   assertEquals(false, new Solution().checkInclusion("ab", "eidboaoo"));
  }
}