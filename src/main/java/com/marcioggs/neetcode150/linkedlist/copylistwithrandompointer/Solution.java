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
      Node previousNodeCopy = null;
      var originalToCopyMap = new HashMap<Node, Node>();
      Node copyHead = null;

      while (node != null) {
        var nodeCopy = new Node(node.val);

        if (previousNodeCopy != null) {
          previousNodeCopy.next = nodeCopy;
        }
        previousNodeCopy = nodeCopy;

        if (copyHead == null) {
          copyHead = nodeCopy;
        }
        originalToCopyMap.put(node, nodeCopy);
        node = node.next;
      }

      node = head;

      while (node != null) {
        if (node.random != null) {
          var nodeCopy = originalToCopyMap.get(node);
          nodeCopy.random = originalToCopyMap.get(node.random);
        }
        node = node.next;
      }

      return copyHead;
    }
  }
}
