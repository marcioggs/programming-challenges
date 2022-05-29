package com.marcioggs.crackingthetoptalinterview.chapter3.exercise4;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertTrue(new Solution().areBracketsBalanced("([4*{2+3}])"));
        assertFalse(new Solution().areBracketsBalanced("{[3}"));
        assertFalse(new Solution().areBracketsBalanced("{[])"));
        assertFalse(new Solution().areBracketsBalanced("]["));
    }

}