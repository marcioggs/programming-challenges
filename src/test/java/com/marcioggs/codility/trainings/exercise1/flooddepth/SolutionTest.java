package com.marcioggs.codility.trainings.exercise1.flooddepth;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void check() {
        // Sample
        assertEquals(2, new Solution().solution(new int[]{1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2}));
        // Same height
        assertEquals(0, new Solution().solution(new int[]{1, 1, 1}));
        // Mountain
        assertEquals(0, new Solution().solution(new int[]{0, 1, 0}));
        // Valley
        assertEquals(1, new Solution().solution(new int[]{1, 0, 1}));
        // Right peak
        assertEquals(0, new Solution().solution(new int[]{0, 1, 2}));
        // Left peak
        assertEquals(0, new Solution().solution(new int[]{2, 1, 0}));
        // Higher left wall
        assertEquals(1, new Solution().solution(new int[]{2, 1, 3}));
        // Higher right wall
        assertEquals(1, new Solution().solution(new int[]{3, 1, 2}));
        // Descending mountains
        assertEquals(1, new Solution().solution(new int[]{3, 1, 2, 0, 1}));
        // Ascending mountains
        assertEquals(1, new Solution().solution(new int[]{1, 0, 2, 1, 3}));
    }
}