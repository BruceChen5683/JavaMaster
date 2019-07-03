package com.cjl.pattern.observer;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class WatcherImpl implements Watcher{
    @Override
    public void update(String msg) {
        System.out.println("msg = " + msg);
    }
}
