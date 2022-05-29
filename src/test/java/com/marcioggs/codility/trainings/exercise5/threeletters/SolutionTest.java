package com.marcioggs.codility.trainings.exercise5.threeletters;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals("", new Solution().solution(0,0));
        assertEquals("a", new Solution().solution(1,0));
        assertEquals("b", new Solution().solution(0,1));
        assertEquals("aa", new Solution().solution(2,0));
        assertEquals("bb", new Solution().solution(0,2));

        assertEquals("ab", new Solution().solution(1,1));
        assertEquals("abab", new Solution().solution(2,2));
        assertEquals("ababab", new Solution().solution(3,3));

        assertEquals("abb", new Solution().solution(1,2));
        assertEquals("babb", new Solution().solution(1,3));
        assertEquals("bbabb", new Solution().solution(1,4));

        assertEquals("aab", new Solution().solution(2,1));
        assertEquals("aaba", new Solution().solution(3,1));
        assertEquals("aabaa", new Solution().solution(4,1));

        assertEquals("abbabab", new Solution().solution(3,4));
        assertEquals("aababab", new Solution().solution(4,3));
    }

}