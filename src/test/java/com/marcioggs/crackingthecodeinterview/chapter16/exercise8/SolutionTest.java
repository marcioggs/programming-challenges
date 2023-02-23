package com.marcioggs.crackingthecodeinterview.chapter16.exercise8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void getEnglishInt() {
        assertEquals("Zero", new Solution().getEnglishInt(0));
        assertEquals("Five", new Solution().getEnglishInt(5));
        assertEquals("Ten", new Solution().getEnglishInt(10));
        assertEquals("Fifteen", new Solution().getEnglishInt(15));
        assertEquals("Twenty", new Solution().getEnglishInt(20));
        assertEquals("Thirty Five", new Solution().getEnglishInt(35));
        assertEquals("One Hundred", new Solution().getEnglishInt(100));
        assertEquals("One Hundred Five", new Solution().getEnglishInt(105));
        assertEquals("One Hundred Ten", new Solution().getEnglishInt(110));
        assertEquals("One Hundred Fifteen", new Solution().getEnglishInt(115));
        assertEquals("One Hundred Forty", new Solution().getEnglishInt(140));
        assertEquals("One Hundred Fifty Five", new Solution().getEnglishInt(155));
        assertEquals("Two Thousand", new Solution().getEnglishInt(2_000));
        assertEquals("Two Thousand Six", new Solution().getEnglishInt(2_006));
        assertEquals("Two Thousand Seventy Six", new Solution().getEnglishInt(2_076));
        assertEquals("Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(2_876));
        assertEquals("Thirty Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(32_876));
        assertEquals("Four Hundred Thirty Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(432_876));
        assertEquals("Five Million Four Hundred Thirty Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(5_432_876));
        assertEquals("Fifteen Million Four Hundred Thirty Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(15_432_876));
        assertEquals("Nine Hundred Fifteen Million Four Hundred Thirty Two Thousand Eight Hundred Seventy Six", new Solution().getEnglishInt(915_432_876));
    }
}