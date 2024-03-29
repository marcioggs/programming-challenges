package com.marcioggs.codility.trainings.exercise3.tennistournament;

/**
 * You are hosting a tennis tournament. P players, who will take part in the first round of this
 * tournament, are already registered and you have reserved C tennis courts for the matches. Exactly
 * two players play in each game and only one game can be played on each court at any given time.
 * You want to host the maximum possible number of games starting at the same time (in order to
 * finish the first round quickly).
 * <p>
 * How many games can be hosted in parallel simultaneously?
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int P, int C); }
 * <p>
 * that, given the number of players P and the number of reserved courts C, returns the maximum
 * number of games that can be played in parallel.
 * <p>
 * Examples:
 * <p>
 * 1. Given P = 5 players and C = 3 available courts, the function should return 2. Two games can be
 * played simultaneously (for instance, the first and second players can play on the first court,
 * and the third and fourth players on the second court, and the third court will be empty because
 * the fifth player does not have a partner to play with).
 * <p>
 * 2. Given P = 10 players and C = 3 courts, the function should return 3. At most three games can
 * be hosted in parallel.
 * <p>
 * Assume that:
 * <p>
 * P and C are integers within the range [1..30,000]. In your solution, focus on correctness. The
 * performance of your solution will not be the focus of the assessment.
 * <p>
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication
 * or disclosure prohibited.
 *
 * <a href="https://app.codility.com/programmers/trainings/3/tennis_tournament/">Codility</a>
 */
public class Solution {

  public int solution(int players, int courts) {
    return Math.min(players / 2, courts);
  }
}
