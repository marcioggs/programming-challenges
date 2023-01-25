package com.marcioggs.crackingthecodeinterview.chapter2.exercise6;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public boolean isPalindrome(SingleLinkedListNode<Character> root) {
        if (root == null) {
            return false;
        }

        if (root.next == null) {
            return true;
        }

        Deque<Character> stack = new ArrayDeque<>();

        SingleLinkedListNode<Character> slow = root;
        SingleLinkedListNode<Character> fast = root.next;
        int nodesCount = 2;

        stack.push(slow.value);

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            nodesCount += fast == null? 1 : 2;
            stack.push(slow.value);
        }

        if (nodesCount % 2 == 1) {
            stack.pop();
        }

        while (slow.next != null) {
            slow = slow.next;
            if (stack.pop() != slow.value) {
                return false;
            }
        }

        return true;
    }
}
