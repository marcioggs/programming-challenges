package com.marcioggs.codility.trainings.exercise5.paritydegree;

/**
 * <a href="https://app.codility.com/programmers/trainings/5/parity_degree/">Codility</a>
 */
public class Solution {

    public int solution(int number) {

        if (number % 2 == 1) {
            return 0;
        }

        int power = 1;
        int lastPowerOfTwo = 0;

        while (power <= number) {

            if (number % Math.pow(2, power) == 0) {
                lastPowerOfTwo = power;
            }

            power++;
        }

        return lastPowerOfTwo;
    }
}
