package com.cjl.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class ObserverTest {
    public static void main(String[] args) {
        Watched girl = new WatchedImpl();

        Watcher watcher1 = new WatcherImpl();
        Watcher watcher2 = new WatcherImpl();
        Watcher watcher3 = new WatcherImpl();

        girl.addWatcher(watcher1);
        girl.addWatcher(watcher2);
        girl.addWatcher(watcher3);

        girl.notifyWatchers("hi,man");

//        girl.removeOthersWatcher(watcher2);

        girl.removeWatcher(watcher2);

        girl.notifyWatchers("fuck");


    }
}
