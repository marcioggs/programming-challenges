package com.marcioggs.codility.trainings.exercise4.firstunique;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(5, new Solution().solution(new int[]{4, 10, 5, 4, 2, 10}));
        assertEquals(4, new Solution().solution(new int[]{1, 4, 3, 3, 1, 2}));
        assertEquals(-1, new Solution().solution(new int[]{6, 4, 4, 6}));
    }
}