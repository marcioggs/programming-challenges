package com.marcioggs.crackingthecodeinterview.chapter4;

import lombok.val;

public class DirectedGraphNode<T> {
    public T value;
    public DirectedGraphNode<T>[] relatedNodes;

    public DirectedGraphNode() {}
    public DirectedGraphNode(T value) {
        this();
        this.value = value;
    }

    public DirectedGraphNode(T value, DirectedGraphNode<T>[] relatedNodes) {
        this(value);
        this.relatedNodes = relatedNodes;
    }
}
