package com.cjl.multi_thread.share_restriceted_res;

public abstract class IntGenerator {
    //boolean 原子性
    //volatile 可见性
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel(){
        canceled = true;
    }

    public boolean isCanceled(){
        return canceled;
    }
}
