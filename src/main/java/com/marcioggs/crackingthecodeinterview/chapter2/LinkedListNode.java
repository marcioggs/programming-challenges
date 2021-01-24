package com.marcioggs.crackingthecodeinterview.chapter2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LinkedListNode<T> {
    T value;
    LinkedListNode<T> next;
}
