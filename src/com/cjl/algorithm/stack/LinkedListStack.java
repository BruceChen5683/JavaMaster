package com.cjl.algorithm.stack;

import java.util.LinkedList;

public class LinkedListStack<E> implements IStack<E>{
    private LinkedList<E> list = new LinkedList<>();
    @Override
    public synchronized void push(E e) {
        list.add(e);
    }

    @Override
    public synchronized E pop() {
        return list.size() == 0 ? null : list.removeLast();
    }

    @Override
    public synchronized E peek() {
        return list.size() == 0 ? null : list.getLast();
    }

    @Override
    public boolean empty() {
        return list.size() == 0;
    }
}
