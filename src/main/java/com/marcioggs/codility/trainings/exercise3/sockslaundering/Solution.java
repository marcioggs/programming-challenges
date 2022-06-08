package com.marcioggs.codility.trainings.exercise3.sockslaundering;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Bob is about to go on a trip. But first he needs to take care of his supply of socks. Each sock
 * has its own color. Bob wants to take as many pairs of clean socks as possible (both socks in the
 * pair should be of the same color).
 * <p>
 * Socks are divided into two drawers: clean and dirty socks. Bob has time for only one laundry and
 * his washing machine can clean at most K socks. He wants to pick socks for laundering in such a
 * way that after washing he will have a maximal number of clean, same-colored pairs of socks. It is
 * possible that some socks cannot be paired with any other sock, because Bob may have lost some
 * socks over the years.
 * <p>
 * Bob has exactly N clean and M dirty socks, which are described in arrays C and D, respectively.
 * The colors of the socks are represented as integers (equal numbers representing identical
 * colors).
 * <p>
 * For example, given four clean socks and five dirty socks:
 * <p>
 * <p>
 * <p>
 * If Bob's washing machine can clean at most K = 2 socks, then he can take a maximum of three pairs
 * of clean socks. He can wash one red sock and one green sock, numbered 1 and 2 respectively. Then
 * he will have two pairs of red socks and one pair of green socks.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int K, int[] C, int[] D); }
 * <p>
 * that, given an integer K (the number of socks that the washing machine can clean), two arrays C
 * and D (containing the color representations of N clean and M dirty socks respectively), returns
 * the maximum number of pairs of socks that Bob can take on the trip.
 * <p>
 * For example, given K = 2, C = [1, 2, 1, 1] and D = [1, 4, 3, 2, 4], the function should return 3,
 * as explained above.
 * <p>
 * Assume that:
 * <p>
 * K is an integer within the range [0..50]; each element of arrays C and D is an integer within the
 * range [1..50]; C and D are not empty and each of them contains at most 50 elements. In your
 * solution, focus on correctness. The performance of your solution will not be the focus of the
 * assessment.
 * <p>
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication
 * or disclosure prohibited.
 * <p>
 * <a href="https://app.codility.com/programmers/trainings/3/socks_laundering/">Codility</a>
 */
public class Solution {

  public int solution(int cleaningCapacity, int[] cleanSocksColors, int[] dirtySocksColors) {

    Map<Integer, Integer> amountOfCleanSocksPerColor = new HashMap<>();

    for (int cleanSockColor : cleanSocksColors) {
      amountOfCleanSocksPerColor.compute(cleanSockColor, (sockColor, socksAmount) ->
          socksAmount == null ? 1 : socksAmount + 1
      );
    }

    Map<Integer, Integer> amountOfDirtySocksPerColor = new HashMap<>();

    for (int i = 0; i < dirtySocksColors.length && cleaningCapacity > 0; i++) {
      Integer numberOfCleanSocksForColor = amountOfCleanSocksPerColor.get(dirtySocksColors[i]);
      // Cleans it if it finds a matching clean sock
      if (numberOfCleanSocksForColor != null && numberOfCleanSocksForColor % 2 == 1) {
        amountOfCleanSocksPerColor.compute(dirtySocksColors[i],
            (sockColor, socksAmount) -> socksAmount + 1);
        cleaningCapacity--;
      } else {
        amountOfDirtySocksPerColor.compute(dirtySocksColors[i], (sockColor, socksAmount) ->
            socksAmount == null ? 1 : socksAmount + 1
        );
      }
    }

    for (Map.Entry<Integer, Integer> amountOfDirtySocksForColor : amountOfDirtySocksPerColor.entrySet()) {
      if (cleaningCapacity <= 0) {
        break;
      }
      int pairsToClean = amountOfDirtySocksForColor.getValue() / 2;
      int cleanedSocks = Math.min(pairsToClean * 2, cleaningCapacity);
      cleaningCapacity -= cleanedSocks;
      amountOfCleanSocksPerColor.compute(amountOfDirtySocksForColor.getKey(), (key, value) -> {
        if (value == null) {
          return cleanedSocks;
        } else {
          return value + cleanedSocks;
        }
      });
    }

    AtomicInteger cleanSocksPairs = new AtomicInteger();
    amountOfCleanSocksPerColor.forEach((key, value) -> {
      cleanSocksPairs.addAndGet(value / 2);
    });

    return cleanSocksPairs.get();
  }
}
