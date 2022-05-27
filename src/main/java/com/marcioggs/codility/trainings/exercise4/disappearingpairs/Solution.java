package com.marcioggs.codility.trainings.exercise4.disappearingpairs;

import java.util.List;
import java.util.stream.Collectors;

/**
 * A string S containing only the letters "A", "B" and "C" is given. The string can be transformed by removing one occurrence of "AA", "BB" or "CC".
 *
 * Transformation of the string is the process of removing letters from it, based on the rules described above. As long as at least one rule can be applied, the process should be repeated. If more than one rule can be used, any one of them could be chosen.
 *
 * Write a function:
 *
 * class Solution { public String solution(String S); }
 *
 * that, given a string S consisting of N characters, returns any string that can result from a sequence of transformations as described above.
 *
 * For example, given string S = "ACCAABBC" the function may return "AC", because one of the possible sequences of transformations is as follows:
 *
 *
 *
 * Also, given string S = "ABCBBCBA" the function may return "", because one possible sequence of transformations is:
 *
 *
 *
 * Finally, for string S = "BABABA" the function must return "BABABA", because no rules can be applied to string S.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * the length of string S is within the range [0..50,000];
 * string S consists only of the following characters: "A", "B" and/or "C".
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 *
 * <a href="https://app.codility.com/programmers/trainings/4/disappearing_pairs/">Codility</a>
 *
 * 100% solution: https://www.youtube.com/watch?v=b1PKlHIJ8Co
 */
public class Solution {

    public String solution(String text) {

        List<Character> characters =
                text.chars()
                        .mapToObj(e -> (char) e)
                        .collect(Collectors.toList());

        for (int i = 0; i < characters.size() - 1; i++) {
            if (characters.get(i) == characters.get(i + 1)) {
                characters.remove(i + 1);
                characters.remove(i);
                i = Math.max(i - 2, -1);
            }
        }

        return characters.stream()
                .map(Object::toString)
                .reduce((acc, e) -> acc + e)
                .orElse("");
    }
}
