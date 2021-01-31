package com.cjl.multi_thread.enjoystudy.container;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class ItemV<V> implements Delayed {

    long delay;
    V v;

    public ItemV(long delay, V v) {
        this.delay = delay+System.currentTimeMillis();
        this.v = v;
    }


    public long getDelay() {
        return delay;
    }

    public V getV() {
        return v;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(delay-System.currentTimeMillis(),TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long d = getDelay(TimeUnit.MILLISECONDS)-o.getDelay(TimeUnit.MILLISECONDS);
        return d == 0 ? 0 : (d > 0 ? 1 : -1);
    }
}
