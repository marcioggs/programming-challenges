package com.marcioggs.crackingthetoptalinterview.chapter3.exercise1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(0, new Solution().solution(0));
        assertEquals(0, new Solution().solution(-1));

        assertEquals(1, new Solution().solution(100));
        assertEquals(1, new Solution().solution(50));
        assertEquals(1, new Solution().solution(25));
        assertEquals(1, new Solution().solution(10));
        assertEquals(1, new Solution().solution(5));
        assertEquals(1, new Solution().solution(1));

        assertEquals(2, new Solution().solution(150));
        assertEquals(2, new Solution().solution(35));
        assertEquals(2, new Solution().solution(6));

        assertEquals(3, new Solution().solution(126));

        assertEquals(4, new Solution().solution(4));
        assertEquals(12, new Solution().solution(1015));
    }
}