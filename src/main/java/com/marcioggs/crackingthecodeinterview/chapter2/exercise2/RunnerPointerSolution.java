package com.marcioggs.crackingthecodeinterview.chapter2.exercise2;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

public class RunnerPointerSolution {

    public <T> SingleLinkedListNode<T> returnKthToLast(SingleLinkedListNode<T> root, int k) {
        SingleLinkedListNode<T> current = root;
        SingleLinkedListNode <T>runner = root;

        for (int i = 0; i < k; i++) {
            runner = runner.next;
        }

        while (runner.next != null) {
            current = current.next;
            runner = runner.next;
        }

        return current;
    }
}