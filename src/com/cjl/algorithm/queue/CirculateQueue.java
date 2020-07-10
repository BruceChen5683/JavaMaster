package com.cjl.algorithm.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class CirculateQueue<T> {

    private final List<T> list;
    private final int initialCapacity;
    private int front = 0;
    private int rear = 0;

    public CirculateQueue(int initialCapacity){
        list = new ArrayList<T>(initialCapacity+1);
        this.initialCapacity = initialCapacity+1;
    }

    public T enqueue(T t){
        if ((rear+1)%initialCapacity == front){
            System.out.println("Full ...");
            return t;
        }
        list.add(t);
        rear++;
        return t;
    }

    public T dequeue(){
        if (rear == front){
            System.out.println("Empty ...");
            return null;
        }
        T t = list.remove(0);
        front++;
        return t;
    }

    public int size(){
        return (rear-front+initialCapacity)%initialCapacity;
    }

    public boolean isEmpty(){
        return rear==front;
    }

    public boolean isFull(){
        return (rear+1)%initialCapacity == front;
    }

    @Override
    public String toString() {
        for (T t : list) {
            System.out.println("t:"+t);
        }
       return "";
    }
}
