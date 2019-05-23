package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PairManager2 extends PairManager {
//    private Lock lock = new ReentrantLock();
    @Override
    public void increment() {
        Pair temp;

        synchronized (this){
            pair.incrementY();
            pair.incrementX();
            temp = getPair();
        }
        store(temp);
    }

    //TODO check lock的效果

//    @Override
//    public void increment() {
//        Pair temp;
//        lock.lock();
//        try {
//            System.out.println("PairManager2.increment pair:"+pair);
//            pair.incrementX();
//            pair.incrementY();
//            temp = getPair();
//            System.out.println("PairManager2.increment temp:"+temp);
//        }finally {
//            lock.unlock();
//        }
//        store(temp);
//    }
}
