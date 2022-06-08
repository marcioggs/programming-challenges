package com.marcioggs.codility.trainings.exercise2.rectanglebuildergreaterarea;

import java.util.HashMap;
import java.util.Map;

/**
 * Halfling Woolly Proudhoof is an eminent sheep herder. He wants to build a pen (enclosure) for his
 * new flock of sheep. The pen will be rectangular and built from exactly four pieces of fence (so,
 * the pieces of fence forming the opposite sides of the pen must be of equal length). Woolly can
 * choose these pieces out of N pieces of fence that are stored in his barn. To hold the entire
 * flock, the area of the pen must be greater than or equal to a given threshold X.
 * <p>
 * Woolly is interested in the number of different ways in which he can build a pen. Pens are
 * considered different if the sets of lengths of their sides are different. For example, a pen of
 * size 1×4 is different from a pen of size 2×2 (although both have an area of 4), but pens of sizes
 * 1×2 and 2×1 are considered the same.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int[] A, int X); }
 * <p>
 * that, given an array A of N integers (containing the lengths of the available pieces of fence)
 * and an integer X, returns the number of different ways of building a rectangular pen satisfying
 * the above conditions. The function should return −1 if the result exceeds 1,000,000,000.
 * <p>
 * For example, given X = 5 and the following array A:
 * <p>
 * A[0] = 1 A[1] = 2 A[2] = 5 A[3] = 1 A[4] = 1 A[5] = 2 A[6] = 3 A[7] = 5 A[8] = 1
 * <p>
 * <p>
 * the function should return 2. The figure above shows available pieces of fence (on the left) and
 * possible to build pens (on the right). The pens are of sizes 1x5 and 2x5. Pens of sizes 1×1 and
 * 1×2 can be built, but are too small in area. It is not possible to build pens of sizes 2×3 or
 * 3×5, as there is only one piece of fence of length 3.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [0..100,000]; X is an integer within the range
 * [1..1,000,000,000]; each element of array A is an integer within the range [1..1,000,000,000].
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication
 * or disclosure prohibited.
 * <p>
 * <a
 * href="https://app.codility.com/programmers/trainings/2/rectangle_builder_greater_area/">Codility</a>
 */
public class Solution {

  public int solution(int[] fenceLengths, int minRectangleArea) {
    long differentWays = 0;

    Map<Integer, Integer> amountPerFenceLength = new HashMap<>();

    for (int fenceLength : fenceLengths) {
      amountPerFenceLength.compute(fenceLength, (key, value) -> {
        if (value == null) {
          return 1;
        } else {
          return value + 1;
        }
      });
    }

    Integer[] faceLengthsWithPair =
        amountPerFenceLength.entrySet().stream().filter((a) -> a.getValue() > 1)
            .map(Map.Entry::getKey)
            .toArray(Integer[]::new);

    for (int i = 0; i < faceLengthsWithPair.length - 1; i++) {
      for (int j = i + 1; j < faceLengthsWithPair.length; j++) {
        if (faceLengthsWithPair[i] * faceLengthsWithPair[j] >= minRectangleArea) {
          differentWays++;
        }
      }
    }

    Integer[] faceLengthsWithFours =
        amountPerFenceLength.entrySet().stream().filter((a) -> a.getValue() >= 4)
            .map(Map.Entry::getKey)
            .toArray(Integer[]::new);

    for (Integer faceLengthsWithFour : faceLengthsWithFours) {
      if (faceLengthsWithFour * faceLengthsWithFour >= minRectangleArea) {
        differentWays++;
      }
    }

    return differentWays > 1000000000 ? -1 : (int) differentWays;
  }
}
