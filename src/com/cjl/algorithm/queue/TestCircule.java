package com.cjl.algorithm.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestCircule {
    public static void main(String[] args) {
        CirculateQueue<String> queue = new CirculateQueue<>(6);


        queue.enqueue("a");
        queue.enqueue("b");
        queue.enqueue("c");
        queue.enqueue("d");
        queue.enqueue("e");
        queue.enqueue("f");
        queue.enqueue("g");
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.enqueue("1");

        System.out.println(queue);

//        ArrayDeque;
//        LinkedList;
//        LinkedBlockingQueue

        //优先级队列   Android MessageQueue
        //PriorityQueue

    }
}
