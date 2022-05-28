package com.marcioggs.codility.trainings.exercise2.dwarfsrafting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void simple() {
        assertEquals(6, new Solution().solution(4, "1B 1C 4B 1D 2A", "3B 2D"));
        assertEquals(16, new Solution().solution(4, "", ""));
        assertEquals(8, new Solution().solution(4, "1B 1C 4B 1D 2A", ""));
        assertEquals(14, new Solution().solution(4, "", "3B 2D"));
    }

    @Test
    public void twoDigitsColumn() {
        assertEquals(138, new Solution().solution(12, "11A 11B", "11C 11D"));
    }
    @Test
    public void moreOccupancyThanSeats() {
        assertEquals(-1, new Solution().solution(2, "", "1A 1A 1B 2A 2B"));
    }

    @Test
    public void impossibleToBalance() {
        assertEquals(-1, new Solution().solution(4, "1A 1B 2A", "3C 3D"));
    }

    @Test
    public void invalidInputs() {
        assertEquals(-1, new Solution().solution(5, "1B 1C 4B 1D 2A", "3B 2D"));
        assertEquals(-1, new Solution().solution(-1, "1B 1C 4B 1D 2A", "3B 2D"));
        assertEquals(-1, new Solution().solution(0, "1B 1C 4B 1D 2A", "3B 2D"));
        assertEquals(-1, new Solution().solution(1, "1B 1C 4B 1D 2A", "3B 2D"));
        assertEquals(-1, new Solution().solution(4, null, "3B 2D"));
        assertEquals(-1, new Solution().solution(4, "1B 1C 4B 1D 2A", null));
    }

}