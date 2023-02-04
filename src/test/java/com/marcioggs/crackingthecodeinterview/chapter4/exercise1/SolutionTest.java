package com.marcioggs.crackingthecodeinterview.chapter4.exercise1;

import com.marcioggs.crackingthecodeinterview.chapter4.DirectedGraphNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void shouldFindPathBetweenNodeForSimpleCases() {
        DirectedGraphNode<Integer> primary = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> secondary = new DirectedGraphNode<>();

        assertEquals(false, new Solution().isTherePathBetweenNodes(null, null));
        assertEquals(false, new Solution().isTherePathBetweenNodes(primary, null));
        assertEquals(false, new Solution().isTherePathBetweenNodes(null, primary));
        assertEquals(false, new Solution().isTherePathBetweenNodes(primary, secondary));
        assertEquals(true, new Solution().isTherePathBetweenNodes(primary, primary));
    }

    @Test
    public void shouldNotRunInfiniteLoopWhenGraphContainsCycle() {
        DirectedGraphNode<Integer> first = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> second = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> third = new DirectedGraphNode<>();
        first.relatedNodes = new DirectedGraphNode[] {second};
        second.relatedNodes = new DirectedGraphNode[] {first};

        assertEquals(false, new Solution().isTherePathBetweenNodes(first, third));
    }

    @Test
    public void shouldReturnFalseWhenNoPath() {
        DirectedGraphNode<Integer> first = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> second = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> third = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> fourth = new DirectedGraphNode<>();
        first.relatedNodes = new DirectedGraphNode[] {second, third};
        third.relatedNodes = new DirectedGraphNode[] {fourth};

        DirectedGraphNode<Integer> fifth = new DirectedGraphNode<>();

        assertEquals(false, new Solution().isTherePathBetweenNodes(first, fifth));
    }

    @Test
    public void shouldReturnTrueWhenConnectedPath() {
        DirectedGraphNode<Integer> first = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> second = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> third = new DirectedGraphNode<>();
        DirectedGraphNode<Integer> fourth = new DirectedGraphNode<>();
        first.relatedNodes = new DirectedGraphNode[] {second, third};
        third.relatedNodes = new DirectedGraphNode[] {fourth};

        assertEquals(true, new Solution().isTherePathBetweenNodes(first, fourth));
    }
}
