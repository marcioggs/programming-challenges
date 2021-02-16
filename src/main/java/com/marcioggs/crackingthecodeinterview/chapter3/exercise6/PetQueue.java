package com.marcioggs.crackingthecodeinterview.chapter3.exercise6;

import lombok.SneakyThrows;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * The enqueue methods sleeps to prevent the object to have the same exact LocalDateTime, which
 * yelds wrong results when using dequeueAny.
 */
public class PetQueue {

  private final LinkedList<Cat> catQueue = new LinkedList<>();
  private final LinkedList<Dog> dogQueue = new LinkedList<>();

  @SneakyThrows
  public boolean enqueue(Cat cat) {
    TimeUnit.MILLISECONDS.sleep(10);
    cat.setReceivedDateTime(LocalDateTime.now());
    return this.catQueue.add(cat);
  }

  @SneakyThrows
  public boolean enqueue(Dog dog) {
    TimeUnit.MILLISECONDS.sleep(10);
    dog.setReceivedDateTime(LocalDateTime.now());
    return this.dogQueue.add(dog);
  }

  public Cat dequeueCat() {
    return this.catQueue.remove();
  }

  public Dog dequeueDog() {
    return this.dogQueue.remove();
  }

  public Pet dequeueAny() {
    if (this.catQueue.size() == 0 && this.dogQueue.size() == 0) {
      throw new NoSuchElementException();
    }

    if (this.dogQueue.size() == 0) {
      return this.catQueue.remove();
    }

    if (this.catQueue.size() == 0) {
      return this.dogQueue.remove();
    }

    return this.catQueue
            .peek()
            .getReceivedDateTime()
            .isBefore(this.dogQueue.peek().getReceivedDateTime())
        ? this.dequeueCat()
        : this.dequeueDog();
  }
}
