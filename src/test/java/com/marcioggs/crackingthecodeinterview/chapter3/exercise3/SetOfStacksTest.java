package com.marcioggs.crackingthecodeinterview.chapter3.exercise3;

import static org.junit.Assert.assertEquals;

import java.util.EmptyStackException;
import org.junit.Assert;
import org.junit.Test;

public class SetOfStacksTest {

  @Test
  public void singleStackShouldWork() {
    SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(100);

    Integer firstItem = 1;
    Integer secondItem = 2;

    setOfStacks.push(firstItem);
    setOfStacks.push(secondItem);

    assertEquals(secondItem, setOfStacks.pop());
    assertEquals(firstItem, setOfStacks.pop());
  }

  @Test
  public void popWithoutElementsShouldThrowException() {
    SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(100);
    Assert.assertThrows(EmptyStackException.class, setOfStacks::pop);
  }

  @Test
  public void multipleStacksShouldWork() {
    SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(2);

    Integer firstItem = 1;
    Integer secondItem = 2;
    Integer thirdItem = 3;
    Integer fourthItem = 4;

    setOfStacks.push(firstItem);
    setOfStacks.push(secondItem);
    setOfStacks.push(thirdItem);
    setOfStacks.push(fourthItem);

    assertEquals(fourthItem, setOfStacks.pop());
    assertEquals(thirdItem, setOfStacks.pop());
    assertEquals(secondItem, setOfStacks.pop());
    assertEquals(firstItem, setOfStacks.pop());
  }

  @Test
  public void popAtIndexShouldWork() {
    SetOfStacks<Integer> setOfStacks = new SetOfStacks<>(2);

    Integer firstItem = 1;
    Integer secondItem = 2;
    Integer thirdItem = 3;
    Integer fourthItem = 4;

    setOfStacks.push(firstItem);
    setOfStacks.push(secondItem);
    setOfStacks.push(thirdItem);
    setOfStacks.push(fourthItem);

    assertEquals(secondItem, setOfStacks.popAt(0));
    assertEquals(firstItem, setOfStacks.popAt(0));
    assertEquals(fourthItem, setOfStacks.popAt(1));
    assertEquals(thirdItem, setOfStacks.popAt(1));

    Assert.assertThrows(EmptyStackException.class, () -> setOfStacks.popAt(0));
    Assert.assertThrows(EmptyStackException.class, () -> setOfStacks.popAt(1));
  }
}
