package com.cjl.www;

public class ThreadTest {
    public static void main(String[] args) {
        Sample sample = new Sample();
        IncreaseThread thread1 = new IncreaseThread(sample);
        DecreaseThread thread2 = new DecreaseThread(sample);

        thread1.start();
        thread2.start();
    }
}


class IncreaseThread extends Thread{
    private Sample sample;
    public IncreaseThread(Sample sample){
        this.sample = sample;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sample.increase();
        }
    }
}

class DecreaseThread extends Thread{
    private Sample sample;
    public DecreaseThread(Sample sample){
        this.sample = sample;
    }

    @Override
    public void run() {
        for (int i=0;i<20;i++){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sample.decrease();
        }
    }
}


class Sample{
    private int number;

    public synchronized void increase(){
        while (number != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        number++;
        System.out.println(number);
        notify();
    }

    public synchronized void decrease(){
        while (number == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        number--;
        System.out.println(number);
        notify();
    }
}
