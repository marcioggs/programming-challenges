package com.marcioggs.crackingthecodeinterview.chapter16.exercise10;

import org.junit.Test;

import static org.junit.Assert.*;

import static com.marcioggs.crackingthecodeinterview.chapter16.exercise10.Solution.Person;

public class SolutionTest {

    @Test
    public void getMostPopulousYear() {
        assertEquals(1, new Solution().getMostPopulousYear(new Person[] {new Person(1, 2)}));
        assertEquals(2, new Solution().getMostPopulousYear(new Person[] {new Person(1, 10), new Person(1, 10), new Person(1, 10), new Person(2, 10)}));
    }
}