package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CriticalSection {
    static void testApproaches(PairManager pairManager1, PairManager pairManager2){
        ExecutorService executorService = Executors.newCachedThreadPool();
        PairManipulator
                pairManipulator1 = new PairManipulator(pairManager1),
                pairManipulator2 = new PairManipulator(pairManager2);

        PairChecker
                pairChecker1 = new PairChecker(pairManager1),
                pairChecker2 = new PairChecker(pairManager2);

        executorService.execute(pairManipulator1);
        executorService.execute(pairManipulator2);
        executorService.execute(pairChecker1);
        executorService.execute(pairChecker2);
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        }catch (InterruptedException e){
            System.out.println("CriticalSection.testApproaches interrupted");
        }

        System.out.println("CriticalSection.testApproaches "+"" +
                "pairManipulator1 "+pairManipulator1+"\n" +
                "pairManipulator2 "+pairManipulator2);

        System.exit(0);

    }

    public static void main(String[] args) {
        PairManager
                pairManager1 = new PairManager1(),
                pairManager2 = new PairManager2();

        testApproaches(pairManager1, pairManager2);
    }
}
