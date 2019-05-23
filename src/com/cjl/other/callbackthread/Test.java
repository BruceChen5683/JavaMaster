package com.cjl.other.callbackthread;

/**
 * 验证子线程抛出的回调，接收到的线程是什么线程
 *
 * 结论  抛出回调的线程，和接收到回调的线程，是同一个线程
 */
public class Test {
    public static void main(String[] args) {
        Action action = new Action();
        action.init();
        action.go();
    }
}
