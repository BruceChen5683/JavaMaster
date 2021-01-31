package com.cjl.multi_thread.enjoystudy;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch2 {

    public static void main(String[] args) {
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(10);

        for (int i = 0; i < 10; i++) {
            new Thread(new Worker(start,done)).start();
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("start will countDown");
        start.countDown();
        System.out.println("after start,countDown");

        try {
            done.await();
            System.out.println("TestCountDownLatch2.main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static class Worker implements Runnable{
        private CountDownLatch start;
        private CountDownLatch done;

        public Worker(CountDownLatch start, CountDownLatch done) {
            this.start = start;
            this.done = done;
        }

        @Override
        public void run() {
            try {
                System.out.println("Worker.run start,await");
                start.await();
                System.out.println("do Work...,sleep 100ms");
                Thread.sleep(100);
                System.out.println("after sleep.");
                done.countDown();
                System.out.println("Worker.run done,countDown");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/**
 * 文明6   不同胜利模式：全部胜利或则单一规则胜利
 *
 * N
 *
 * 胜利条件：政治、文化、军事等...  N个胜利条件
 * 每个都达到，才算胜利
 *
 * 胜利 = new CountDownLatch(N);
 *
 * 政治路线...
 *  countDown
 * 文化路线...
 *  countDown
 * 军事路线...
 *  countDown
 * ...
 *
 * 胜利.await
 *
 *
 *-------------------------------
 *
 * CountDownLatch(1)
 *
 * 多个部队攻击一个攻击一个国家，派遣工人修路
 *
 * 部队1
 *  派遣工人修路.await
 * 部队2
 *  派遣工人修路.wait
 * ...
 *
 * 任意一个部队，攻入
 *  派遣工人修路.countDown   其他工人即可入内
 *
 *
 */
