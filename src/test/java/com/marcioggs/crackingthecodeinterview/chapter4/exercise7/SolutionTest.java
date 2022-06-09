package com.marcioggs.crackingthecodeinterview.chapter4.exercise7;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void test() {
    assertEquals(
        "e, f, a, b, d, c",
        new Solution()
            .findBuildOrder(
                new String[] {
                  "a", "b", "c", "d", "e", "f",
                },
                new String[][] {{"a", "d"}, {"f", "b"}, {"b", "d"}, {"f", "a"}, {"d", "c"}}));

    assertEquals(
        "",
        new Solution()
            .findBuildOrder(new String[] {"a", "b"}, new String[][] {{"a", "b"}, {"b", "a"}}));
  }
}
