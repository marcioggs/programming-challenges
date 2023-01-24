package com.marcioggs.crackingthecodeinterview.chapter1.exercise6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void compress() {

        assertEquals(null, new Solution().compress(null));
        assertEquals("abc", new Solution().compress("abc"));
        assertEquals("a3b3a3", new Solution().compress("aaabbbaaa"));
        assertEquals("a3b3c3d1", new Solution().compress("aaabbbcccd"));
        assertEquals("a3b1c3", new Solution().compress("aaabccc"));
    }
}