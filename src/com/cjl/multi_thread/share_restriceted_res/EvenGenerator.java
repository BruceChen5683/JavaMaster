package com.cjl.multi_thread.share_restriceted_res;

public class  EvenGenerator extends IntGenerator{
    //synchronized static方法 可以在类的范围内防止对static数据的并发访问
    private  int currentEvenValue = 0;
    @Override
    public synchronized int next() {
        /**
         * 递增不是原子性的操作
         */
        ++currentEvenValue;//danger
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
