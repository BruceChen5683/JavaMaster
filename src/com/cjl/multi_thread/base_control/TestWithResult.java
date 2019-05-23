package com.cjl.multi_thread.base_control;

import java.util.concurrent.*;

public class TestWithResult implements Callable<String> {
    private int id;
    public TestWithResult(int id){
        this.id = id;
    }
    @Override
    public String call() throws Exception {

        return "base_control.TestWithResult:"+id+"";
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0;i < 10;i++){
            TestWithResult testWithResult = new TestWithResult(i);

            Future<String> future = executorService.submit(testWithResult);

            try {

                long time = System.currentTimeMillis() ;
                long now = time;
//                while (!future.isDone()){
//
//                }
//                time = (System.currentTimeMillis() - time);
                System.out.println("base_control.TestWithResult.main "+future.get());
//
                System.out.println("base_control.TestWithResult.main After Get "+ (System.currentTimeMillis() - time));
//
//                if (future.isDone()){
//                    System.out.println("base_control.TestWithResult.main Done");
//                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }
}
