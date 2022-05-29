package com.marcioggs.codility.trainings.exercise5.threeletters;

/**
 * <a href="https://app.codility.com/programmers/trainings/5/three_letters/">Codility</a>
 */
public class Solution {

    public String solution(int aNumber, int bNumber) {

        StringBuilder result = new StringBuilder();

        while (aNumber > 0 && bNumber > 0) {
            result.append("ab");
            aNumber--;
            bNumber--;
        }

        int aInsertIndex = 0;
        while (aNumber > 0) {
            result.insert(aInsertIndex, "a");
            aInsertIndex = Math.min(result.length(), aInsertIndex + 3);
            aNumber--;
        }

        int bInsertIndex = Math.min(aInsertIndex == 0 ? 1 : 2, result.length());
        while (bNumber > 0) {
            if (result.length() >= 2 && result.substring(result.length() - 2).equals("bb")) {
                result.insert(0, "b");
            } else {
                result.insert(bInsertIndex, "b");
                bInsertIndex = Math.min(result.length(), bInsertIndex < aInsertIndex ? bInsertIndex + 3 : bInsertIndex + 4);
            }
            bNumber--;
        }

        return result.toString();
    }
}
