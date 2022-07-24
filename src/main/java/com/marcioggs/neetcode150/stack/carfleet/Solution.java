package com.marcioggs.neetcode150.stack.carfleet;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {

  public int carFleet(int target, int[] position, int[] speed) {

    var cars = new Car[position.length];

    for (int i = 0; i < position.length; i++) {
      cars[i] = new Car(position[i], speed[i]);
    }

    Arrays.sort(cars, Comparator.comparingInt(car -> car.position));

    var stack = new ArrayDeque<Double>();

    for (int i = cars.length - 1; i >= 0; i--) {
      var arrivalTime = (double) (target - cars[i].position) / cars[i].speed;

      if (stack.isEmpty() || arrivalTime > stack.peek()) {
        stack.push(arrivalTime);
      }
    }

    return stack.size();
  }

  private static class Car {
    int position;
    int speed;

    public Car(int position, int speed) {
      this.position = position;
      this.speed = speed;
    }
  }
}
