package com.marcioggs.codility.trainings.exercise3.tennistournament;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void test() {
        assertEquals(2, new Solution().solution(5, 3));
        assertEquals(3, new Solution().solution(10, 3));
    }

}