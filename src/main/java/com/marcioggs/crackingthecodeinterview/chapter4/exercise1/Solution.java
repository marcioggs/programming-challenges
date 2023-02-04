package com.marcioggs.crackingthecodeinterview.chapter4.exercise1;

import com.marcioggs.crackingthecodeinterview.chapter4.DirectedGraphNode;

import java.util.*;

public class Solution {

    public <T> boolean isTherePathBetweenNodes(DirectedGraphNode<T> primary, DirectedGraphNode<T> secondary) {
        if (primary == null || secondary == null) {
            return false;
        }

        Set<DirectedGraphNode<T>> visited = new HashSet<>();

        Queue<DirectedGraphNode<T>> toVisit = new ArrayDeque<>();
        toVisit.add(primary);

        while (!toVisit.isEmpty()) {
            DirectedGraphNode<T> beingVisited = toVisit.remove();

            if (visited.contains(beingVisited)) {
                continue;
            }
            visited.add(beingVisited);

            if (beingVisited == secondary) {
                return true;
            }

            if (beingVisited.relatedNodes != null) {
                toVisit.addAll(Arrays.asList(beingVisited.relatedNodes));
            }
        }

        return false;
    }
}
