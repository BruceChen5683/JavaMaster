package com.cjl.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class HomeWork {

    public static void main(String[] args) {
        Theme observable = new Theme();

        Observer observer1 = new ObserverImpl();
        Observer observer2 = new ObserverImpl();

        observable.addObserver(observer1);
        observable.addObserver(observer2);

        observable.go();


    }
}
