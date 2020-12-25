package com.cjl.multi_thread.enjoystudy.container;

import java.util.concurrent.ArrayBlockingQueue;

public class BCThreadPool {

    private WorkThread[] workThreads;
    private int maxTasks;
    private int works;
    public ArrayBlockingQueue<Runnable> arrayBlockingQueue;

    private static int MAX_TASKS = 100;
    private static int MAX_WORKS = 5;

    public BCThreadPool(){
        this(MAX_TASKS,MAX_WORKS);
    }

    public BCThreadPool(int works, int maxTasks) {
        if (maxTasks <= 0 || works <= 0){
            throw new IllegalArgumentException("must > 0");
        }
        this.works = works;
        this.maxTasks = maxTasks;
        arrayBlockingQueue = new ArrayBlockingQueue<>(maxTasks);
        workThreads = new WorkThread[works];
        for (int i = 0; i < works; i++) {
            workThreads[i] = new WorkThread();
            workThreads[i].start();
        }
    }

    public void execute(Runnable r){
        try {
            arrayBlockingQueue.put(r);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void destroy(){
        for (int i = 0; i < works; i++) {
            workThreads[i].stopWork();
            workThreads[i] = null;
        }
    }

    public class WorkThread extends Thread{

        @Override
        public void run() {
            try {
                if (!isInterrupted()){
                    while (true){
                        Runnable runnable = arrayBlockingQueue.take();
                        if (runnable != null){
                            System.out.println("WorkThread.run  "+runnable+"  time "+System.currentTimeMillis());
                            runnable.run();
                        }
                        runnable = null;
                    }
                }

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        public void stopWork(){
            interrupt();
        }
    }
}
