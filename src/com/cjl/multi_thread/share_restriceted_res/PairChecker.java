package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.Executors;

public class PairChecker implements Runnable{
    private PairManager pm;

    public PairChecker(PairManager pm) {
        this.pm = pm;
    }

    @Override
    public void run() {
        while (true){
            pm.checkCounter.incrementAndGet();

            try {
//                System.out.println("PairChecker.run "+pm.getPair());

                pm.getPair().checkState();
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("PairChecker.run Exception "+pm);
            }

//            System.out.println("PairChecker.run "+pm.getPair());
        }
    }
}
