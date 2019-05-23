package com.cjl.multi_thread.base_control;

public class Joining {
    public static void main(String[] args) {
        Sleeper
                sleeper1 = new Sleeper("sleeper1",1500),
                sleeper2 = new Sleeper("sleeper2",1500);

        Joiner
                joiner1 = new Joiner("joiner1",sleeper1),
                joiner2 = new Joiner("joiner2",sleeper2);

        sleeper2.interrupt();
    }
}
