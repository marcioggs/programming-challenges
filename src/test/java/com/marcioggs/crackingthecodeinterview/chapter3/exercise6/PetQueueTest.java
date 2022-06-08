package com.marcioggs.crackingthecodeinterview.chapter3.exercise6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.util.NoSuchElementException;
import org.junit.Test;

public class PetQueueTest {

  @Test
  public void shouldDequeueOldestCat() {
    PetQueue queue = new PetQueue();

    Cat cat1 = Cat.builder().name("cat1").build();
    Dog dog1 = Dog.builder().name("dog1").build();
    Cat cat2 = Cat.builder().name("cat2").build();
    Dog dog2 = Dog.builder().name("dog2").build();
    Cat cat3 = Cat.builder().name("cat3").build();
    Dog dog3 = Dog.builder().name("dog3").build();

    queue.enqueue(cat1);
    queue.enqueue(dog1);
    queue.enqueue(cat2);
    queue.enqueue(dog2);
    queue.enqueue(cat3);
    queue.enqueue(dog3);

    assertEquals(cat1, queue.dequeueCat());
    assertEquals(cat2, queue.dequeueCat());
    assertEquals(cat3, queue.dequeueCat());
    assertThrows(NoSuchElementException.class, queue::dequeueCat);
  }

  @Test
  public void shouldDequeueOldestDog() {
    PetQueue queue = new PetQueue();

    Cat cat1 = Cat.builder().name("cat1").build();
    Dog dog1 = Dog.builder().name("dog1").build();
    Cat cat2 = Cat.builder().name("cat2").build();
    Dog dog2 = Dog.builder().name("dog2").build();
    Cat cat3 = Cat.builder().name("cat3").build();
    Dog dog3 = Dog.builder().name("dog3").build();

    queue.enqueue(cat1);
    queue.enqueue(dog1);
    queue.enqueue(cat2);
    queue.enqueue(dog2);
    queue.enqueue(cat3);
    queue.enqueue(dog3);

    assertEquals(dog1, queue.dequeueDog());
    assertEquals(dog2, queue.dequeueDog());
    assertEquals(dog3, queue.dequeueDog());
    assertThrows(NoSuchElementException.class, queue::dequeueDog);
  }

  @Test
  public void shouldDequeueOldestPet() {
    PetQueue queue = new PetQueue();

    Cat cat1 = Cat.builder().name("cat1").build();
    Dog dog1 = Dog.builder().name("dog1").build();
    Cat cat2 = Cat.builder().name("cat2").build();
    Dog dog2 = Dog.builder().name("dog2").build();
    Cat cat3 = Cat.builder().name("cat3").build();
    Dog dog3 = Dog.builder().name("dog3").build();

    queue.enqueue(cat1);
    queue.enqueue(dog1);
    queue.enqueue(cat2);
    queue.enqueue(dog2);
    queue.enqueue(cat3);
    queue.enqueue(dog3);

    assertEquals(cat1, queue.dequeueAny());
    assertEquals(dog1, queue.dequeueAny());
    assertEquals(cat2, queue.dequeueAny());
    assertEquals(dog2, queue.dequeueAny());
    assertEquals(cat3, queue.dequeueAny());
    assertEquals(dog3, queue.dequeueAny());
    assertThrows(NoSuchElementException.class, queue::dequeueAny);
  }
}
