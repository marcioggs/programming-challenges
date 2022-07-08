package com.marcioggs.neetcode150.bitmanipulation.reversebits;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void reverseBits() {
    assertEquals(
        Integer.parseInt("00111001011110000010100101000000", 2),
        new Solution().reverseBits(Integer.parseInt("00000010100101000001111010011100", 2)));
    assertEquals(-1073741825, new Solution().reverseBits(-3));
  }
}
