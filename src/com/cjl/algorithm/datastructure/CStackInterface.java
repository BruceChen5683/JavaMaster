package com.cjl.algorithm.datastructure;

public interface CStackInterface<E> {
    E pull();
    void push(E e);
    boolean isEmpty();
    int size();
}
