package com.cjl.algorithm.stack;

public class ArrayStack<E> implements IStack<E>{
    private Object[] elementData;
    private int initialCapacity;

    public ArrayStack(int initialCapacity) {
        if (initialCapacity < 0){
            throw new IllegalArgumentException("< 0 !!!");
        }
        this.initialCapacity = initialCapacity;
        this.elementData = new Object[initialCapacity];
    }

    public ArrayStack() {
        this(10);
    }

    @Override
    public synchronized void push(E e) {

    }

    @Override
    public synchronized E pop() {
        return null;
    }

    @Override
    public synchronized E peek() {
        return null;
    }

    @Override
    public boolean empty() {
        return false;
    }
}
