package com.cjl.multi_thread.share_restriceted_res;

public class PairManipulator implements Runnable{
    private PairManager pm;

    public PairManipulator(PairManager pairManager){
        this.pm = pairManager;
    }

    @Override
    public void run() {
        while (true){
            pm.increment();
        }
    }

    @Override
    public String toString() {
        return "Pair : "+ pm.getPair()+ "checkCounter = "+pm.checkCounter.get();
    }
}
