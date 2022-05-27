package com.marcioggs.codility.trainings.exercise4.strsymmetrypoint;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(3, new Solution().solution("racecar"));
        assertEquals(-1, new Solution().solution("abba"));
        assertEquals(-1, new Solution().solution("abcdef"));
    }

}