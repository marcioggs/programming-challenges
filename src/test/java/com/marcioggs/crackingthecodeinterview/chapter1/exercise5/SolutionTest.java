package com.marcioggs.crackingthecodeinterview.chapter1.exercise5;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isOneEditAway() {
        assertEquals( false, new Solution().isOneEditAway("abc", "a"));
        assertEquals( false, new Solution().isOneEditAway("a", "abc"));
        assertEquals( true, new Solution().isOneEditAway("abc", "abc"));
        assertEquals( true, new Solution().isOneEditAway("abc", "axc"));
        assertEquals( true, new Solution().isOneEditAway("abc", "ac"));
        assertEquals( true, new Solution().isOneEditAway("ac", "abc"));
        assertEquals( false, new Solution().isOneEditAway("abc", "axx"));
    }
}