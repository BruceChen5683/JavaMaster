package com.cjl.pattern.observer;

import java.util.Observable;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class Theme extends Observable{
    private int i = 10;

    public void go(){
        for (int j = i;j > 0;j--){
            setChanged();
            notifyObservers(j);
        }
    }

}
