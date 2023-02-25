package com.marcioggs.crackingthecodeinterview.chapter16.exercise10;

import java.util.*;

public class Solution {

    public int getMostPopulousYear(Person[] people) {
        if (people == null || people.length == 0) {
            return -1;
        }

        int mostPopulousYear = -1;
        int mostPopulousYearPopulation = -1;
        int currentYearPopulation = 0;

        Iterator<Map.Entry<Integer, Integer>> deathsByYear = getDeathsByYear(people).entrySet().iterator();
        Map.Entry<Integer, Integer> deathsInYear = deathsByYear.next();

        for (Map.Entry<Integer, Integer> birthsInYear : getBirthsByYear(people).entrySet()) {

            while (deathsInYear.getKey() < birthsInYear.getKey()) {
                currentYearPopulation -= deathsInYear.getValue();
                deathsInYear = deathsByYear.next();
            }

            currentYearPopulation += birthsInYear.getValue();

            if (currentYearPopulation > mostPopulousYearPopulation) {
                mostPopulousYearPopulation = currentYearPopulation;
                mostPopulousYear = birthsInYear.getKey();
            }
        }

        return mostPopulousYear;
    }

    private Map<Integer, Integer> getBirthsByYear(Person[] people) {
        Map<Integer, Integer> birthsByYear = new TreeMap<>();

        for (Person person : people) {
            birthsByYear.compute(
                person.birthYear, (Integer key, Integer oldValue) -> oldValue == null? 1 : ++oldValue);
        }

        return birthsByYear;
    }

    private Map<Integer, Integer> getDeathsByYear(Person[] people) {
        Map<Integer, Integer> deathsByYear = new TreeMap<>();

        for (Person person : people) {
            deathsByYear.compute(
                person.deathYear, (Integer key, Integer oldValue) -> oldValue == null? 1 : ++oldValue);
        }

        return deathsByYear;
    }

    public static class Person {
        int birthYear;
        int deathYear;

        public Person(int birthYear, int deathYear) {
            this.birthYear = birthYear;
            this.deathYear = deathYear;
        }
    }
}