package com.marcioggs.crackingthecodeinterview.chapter4.exercise2;

import com.marcioggs.crackingthecodeinterview.chapter4.BinaryTreeNode;

public class Solution {

    public BinaryTreeNode<Integer> buildBinarySearchTreeWithMinimalHeight(int[] sortedNumbers) {
        if (sortedNumbers == null || sortedNumbers.length == 0) {
            return null;
        }
        return this.buildBinarySearchTreeWithMinimalHeight(sortedNumbers, 0, sortedNumbers.length - 1);
    }

    private BinaryTreeNode<Integer> buildBinarySearchTreeWithMinimalHeight(int[] sortedNumbers, int startIndex, int endIndex) {
        int topIndex = startIndex + (int) Math.ceil(((double) (endIndex - startIndex) / 2));
        BinaryTreeNode<Integer> topNode = new BinaryTreeNode<>(sortedNumbers[topIndex]);

        if (startIndex < topIndex) {
            topNode.setLeft(buildBinarySearchTreeWithMinimalHeight(sortedNumbers, startIndex, topIndex - 1));
        }
        if (endIndex > topIndex) {
            topNode.setRight(buildBinarySearchTreeWithMinimalHeight(sortedNumbers, topIndex + 1, endIndex));
        }

        return topNode;
    }
}
