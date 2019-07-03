package com.cjl.pattern.observer;

import java.util.*;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class WatchedImpl implements Watched{
    private List<Watcher> list = new ArrayList<Watcher>();
    private List<Watcher> newest = new ArrayList<Watcher>();

    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatchers(String msg) {
        for (Watcher watcher:list){
            watcher.update(msg);
        }
    }

    //brocastReceiver 抑制其他接收信息  猜测

    @Override
    public void removeOthersWatcher(Watcher watcher) {
        Iterator<Watcher> iterator = list.iterator();

        while (iterator.hasNext()){
            Watcher other = iterator.next();
            if(watcher != other){
                iterator.remove();
            }
        }
    }
}
