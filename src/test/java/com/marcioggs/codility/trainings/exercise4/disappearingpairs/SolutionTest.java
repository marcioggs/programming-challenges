package com.marcioggs.codility.trainings.exercise4.disappearingpairs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals("AC", new Solution().solution("ACCAABBC"));
        assertEquals("", new Solution().solution("ABCBBCBA"));
    }

}