package com.cjl.pattern.visitor;

public abstract class Node {
    public abstract void accept(Visitor visitor);
}
