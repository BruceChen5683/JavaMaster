package com.cjl.multi_thread.share_restriceted_res.exercise;

public abstract class NumRangeGenerator { // non-task, non-Runnable, can be canceled
    private volatile boolean canceled = false;
    public abstract int[] next();
    public void cancel() { canceled = true; }
    public boolean isCanceled() { return canceled; }
}
