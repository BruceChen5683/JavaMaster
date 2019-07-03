package com.cjl.pattern.observer;

/**
 * Created by chenjianliang on 2017/5/18.
 * 被观察的,
 */
public interface Watched {

    public void addWatcher(Watcher watcher);

    public void removeWatcher(Watcher watcher);

    public void notifyWatchers(String msg);


    public void removeOthersWatcher(Watcher watcher);
}
