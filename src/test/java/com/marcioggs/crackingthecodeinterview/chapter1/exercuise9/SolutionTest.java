package com.marcioggs.crackingthecodeinterview.chapter1.exercuise9;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isRotation() {
        assertEquals(false, new Solution().isRotation(null, null));
        assertEquals(false, new Solution().isRotation("a", null));
        assertEquals(false, new Solution().isRotation(null, "a"));

        assertEquals(true, new Solution().isRotation("a", "a"));
        assertEquals(true, new Solution().isRotation("ab", "ba"));
        assertEquals(false, new Solution().isRotation("abc", "ca"));

        assertEquals(true, new Solution().isRotation("waterbottle", "erbottlewat"));
    }
}