package com.marcioggs.crackingthecodeinterview.chapter3.exercise6;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Optional;

public class PetQueue {

  private final LinkedList<Pet> queue = new LinkedList<>();

  public boolean enqueue(Pet pet) {
    return this.queue.add(pet);
  }

  public Cat dequeueCat() {
    Optional<Cat> oldestCat =
        this.queue.stream().filter(pet -> pet instanceof Cat).map(pet -> (Cat) pet).findFirst();

    oldestCat.ifPresent(this.queue::remove);

    return oldestCat.orElseThrow(NoSuchElementException::new);
  }

  public Dog dequeueDog() {
    Optional<Dog> oldestDog =
        this.queue.stream().filter(pet -> pet instanceof Dog).map(pet -> (Dog) pet).findFirst();

    oldestDog.ifPresent(this.queue::remove);

    return oldestDog.orElseThrow(NoSuchElementException::new);
  }

  public Pet dequeueAny() {
    return this.queue.remove();
  }
}
