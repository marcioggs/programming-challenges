package com.marcioggs.crackingthecodeinterview.chapter16.exercise6;

import java.util.*;

public class Solution {

    public int[] findSmallestDifferenceElements(int[] array1, int[] array2) {

        if (array1 == null || array1.length == 0 || array2 == null || array2.length == 0) {
            return null;
        }

        array1 = array1.clone();
        array2 = array2.clone();

        int smallestDifference = Integer.MAX_VALUE;

        Arrays.sort(array1);
        Arrays.sort(array2);

        Integer array1MatchingNumber = null;
        Integer array2MatchingNumber = null;
        int array1Index = 0;
        int array2Index = 0;

        while (array1Index < array1.length
                && array2Index < array2.length) {

            int array1Element = array1[array1Index];
            int array2Element = array2[array2Index];

            int difference = Math.abs(array1Element - array2Element);
            if (difference < smallestDifference) {
                smallestDifference = difference;
                array1MatchingNumber = array1Element;
                array2MatchingNumber = array2Element;
            }

            if (array1Element < array2Element) {
                array1Index++;
            } else {
                array2Index++;
            }
        }

        return new int[] {array1MatchingNumber, array2MatchingNumber};
    }
}

