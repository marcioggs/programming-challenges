package com.marcioggs.hackerrank.twodimarray;

import java.util.Arrays;

/**
 * Platform: HackerRank Challenge: Practice > Interview Preparation Kit > Arrays > 2D Array - DS
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D%5B%5D=arrays&isFullScreen=true
 */
public class Solution {

  /**
   * Return the maximum hourglass sum for a given array. Ideally the hourglassRelativeIndexes should
   * be received as a parameter, but was kept within the class to run on the challenge platform. g
   *
   * @param arr Array
   * @return Max hourglass sum
   */
  static int hourglassSum(int[][] arr) {
    int[][] hourglassRelativeIndexes = {{0, 0}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};
    int maxHourglassSum = Integer.MIN_VALUE;
    int currentHourglassSum = 0;

    int maxColForward = getMaxValueFromPosition(hourglassRelativeIndexes, 0);
    int maxLineForward = getMaxValueFromPosition(hourglassRelativeIndexes, 1);

    for (int i = 0; i < arr.length - maxLineForward; i++) {
      for (int j = 0; j < arr[i].length - maxColForward; j++) {
        for (int[] hourglassRelativeIndex : hourglassRelativeIndexes) {
          currentHourglassSum += arr[i + hourglassRelativeIndex[0]][j + hourglassRelativeIndex[1]];
        }

        if (currentHourglassSum > maxHourglassSum) {
          maxHourglassSum = currentHourglassSum;
        }
        currentHourglassSum = 0;
      }
    }

    return maxHourglassSum;
  }

  /**
   * Get the max value of a specific dimension in a two dimension array array. e.g.: Array: {{5, 6},
   * {7, 8}} Dimension: 1 Max value: 8
   *
   * @param arr       Two dimension array
   * @param dimension Dimension, starting with 0
   * @return Max value
   */
  static int getMaxValueFromPosition(int[][] arr, int dimension) {
    return Arrays.stream(arr)
        .reduce((prev, next) -> prev[dimension] > next[dimension] ? prev : next).get()[dimension];
  }
}
