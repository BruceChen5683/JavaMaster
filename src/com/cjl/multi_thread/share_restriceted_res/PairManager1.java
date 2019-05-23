package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PairManager1 extends PairManager {


    //    private Lock lock = new ReentrantLock();
    @Override
    public synchronized void increment() {
        pair.incrementX();
        pair.incrementY();
        store(getPair());
    }

//    @Override
//    public synchronized void increment() {
//        lock.lock();
//        try {
//            pair.incrementX();
//            pair.incrementY();
//            store(getPair());
//        }finally {
//            lock.unlock();
//        }
//    }
}
