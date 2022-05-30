package com.marcioggs.crackingthetoptalinterview.chapter3.exercise1;

/**
 * Poker Chips: Luigy works in a Casino and he gives customers poker chips in exchange for money. Find the minimum number
 * of chips Luigy can use to match the customer requests. He has chips worth 100, 50, 25, 10, 5, 1. For example, for
 * 126 Luigy should give 3 chips (100, 25, 1)
 */
public class Solution {

    public int solution(int number) {
        int numberOfChips = 0;
        int[] chipsValue = new int[]{100, 50, 25, 10, 5, 1};

        for (int chipValue : chipsValue) {
            if (number <= 0) {
                break;
            }
            numberOfChips += number / chipValue;
            number = number % chipValue;
        }

        return numberOfChips;
    }
}
