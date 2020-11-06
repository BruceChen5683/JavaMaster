package com.cjl.algorithm.stack;

public interface IStack<E> {

    public void push(E e);
    public E pop();
    public E peek();
    public boolean empty();
}
