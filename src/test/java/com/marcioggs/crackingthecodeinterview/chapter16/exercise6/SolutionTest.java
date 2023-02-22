package com.marcioggs.crackingthecodeinterview.chapter16.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void findSmallestDifferenceElements() {

        int[] smallestDifferenceElements = new Solution().findSmallestDifferenceElements(new int[]{1, 3, 15, 11, 2}, new int[]{23, 127, 235, 19, 8});
        assertEquals(smallestDifferenceElements[0], 11);
        assertEquals(smallestDifferenceElements[1], 8);
    }

    @Test
    public void findSmallestDifferenceElements2() {

        int[] smallestDifferenceElements = new Solution().findSmallestDifferenceElements(null, null);
        assertEquals(smallestDifferenceElements, null);
    }

    @Test
    public void findSmallestDifferenceElements3() {

        int[] smallestDifferenceElements = new Solution().findSmallestDifferenceElements(new int[]{}, new int[]{});
        assertEquals(smallestDifferenceElements, null);
    }
}