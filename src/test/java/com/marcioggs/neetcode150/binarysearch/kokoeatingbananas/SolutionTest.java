package com.marcioggs.neetcode150.binarysearch.kokoeatingbananas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

  @Test
  public void minEatingSpeed() {

    assertEquals(4, new Solution().minEatingSpeed(new int[] {3, 6, 7, 11}, 8));
    assertEquals(30, new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 5));
    assertEquals(23, new Solution().minEatingSpeed(new int[] {30, 11, 23, 4, 20}, 6));
    assertEquals(2, new Solution().minEatingSpeed(new int[] {312884470}, 312884469));
    assertEquals(
        3, new Solution().minEatingSpeed(new int[] {805306368, 805306368, 805306368}, 1000000000));

    assertEquals(
        14,
        new Solution()
            .minEatingSpeed(
                new int[] {
                  332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673,
                  679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097,
                  692137887, 718203285, 629455728, 941802184
                },
                823855818));
  }
}
