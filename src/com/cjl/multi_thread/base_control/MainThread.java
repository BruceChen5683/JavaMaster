package com.cjl.multi_thread.base_control;

import base_control.LiftOff;

public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
