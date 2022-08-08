package com.marcioggs.neetcode150.linkedlist.copylistwithrandompointer;

import java.util.HashMap;

public class Solution {

  class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
      this.val = val;
      this.next = null;
      this.random = null;
    }

    public Node copyRandomList(Node head) {

      var node = head;
      var originalToCopyMap = new HashMap<Node, Node>();

      while (node != null) {
        var nodeCopy = new Node(node.val);
        originalToCopyMap.put(node, nodeCopy);
        node = node.next;
      }

      node = head;

      while (node != null) {
        var nodeCopy = originalToCopyMap.get(node);
        nodeCopy.next = originalToCopyMap.get(node.next);
        nodeCopy.random = originalToCopyMap.get(node.random);
        node = node.next;
      }

      return originalToCopyMap.get(head);
    }
  }
}
