package com.marcioggs.crackingthecodeinterview.chapter2.exercise6;

import com.marcioggs.crackingthecodeinterview.chapter2.SingleLinkedListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void isPalindrome() {
        assertEquals(false, new Solution().isPalindrome(null));
    }

    @Test
    public void isPalindrome2() {
        SingleLinkedListNode<Character> root = new SingleLinkedListNode<>('a', null);
        assertEquals(true, new Solution().isPalindrome(root));
    }

    @Test
    public void isPalindrome3() {
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('a', null);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(true, new Solution().isPalindrome(n1));
    }

    @Test
    public void isPalindrome4() {
        SingleLinkedListNode<Character> n3 = new SingleLinkedListNode<>('a', null);
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('b', n3);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(true, new Solution().isPalindrome(n1));
    }

    @Test
    public void isPalindrome5() {
        SingleLinkedListNode<Character> n6 = new SingleLinkedListNode<>('a', null);
        SingleLinkedListNode<Character> n5 = new SingleLinkedListNode<>('a', n6);
        SingleLinkedListNode<Character> n4 = new SingleLinkedListNode<>('b', n5);
        SingleLinkedListNode<Character> n3 = new SingleLinkedListNode<>('b', n4);
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('a', n3);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(true, new Solution().isPalindrome(n1));
    }

    @Test
    public void isPalindrome6() {
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('c', null);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(false, new Solution().isPalindrome(n1));
    }

    @Test
    public void isPalindrome7() {
        SingleLinkedListNode<Character> n3 = new SingleLinkedListNode<>('c', null);
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('b', n3);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(false, new Solution().isPalindrome(n1));
    }

    @Test
    public void isPalindrome8() {
        SingleLinkedListNode<Character> n6 = new SingleLinkedListNode<>('c', null);
        SingleLinkedListNode<Character> n5 = new SingleLinkedListNode<>('c', n6);
        SingleLinkedListNode<Character> n4 = new SingleLinkedListNode<>('b', n5);
        SingleLinkedListNode<Character> n3 = new SingleLinkedListNode<>('b', n4);
        SingleLinkedListNode<Character> n2 = new SingleLinkedListNode<>('a', n3);
        SingleLinkedListNode<Character> n1 = new SingleLinkedListNode<>('a', n2);
        assertEquals(false, new Solution().isPalindrome(n1));
    }

}