package com.marcioggs.neetcode150.greedy.jumpgame;

class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Integer currentIndex = nums.length - 1; // 1

        while (currentIndex != null && !currentIndex.equals(0)) {
            currentIndex = findReachingIndex(nums, currentIndex);
        }

        return currentIndex != null;
    }

    private Integer findReachingIndex(int[] nums, int targetIndex) { // 1
        int currentIndex = targetIndex - 1; // 0

        while (currentIndex >= 0) {
            if (nums[currentIndex] >= targetIndex - currentIndex) {
                return currentIndex;
            }
            currentIndex--;
        }

        return null;
    }
}
