package com.cjl.multi_thread.terminal_task;

import java.io.IOException;
import java.io.InputStream;

public class IOBlocked implements Runnable{
    private InputStream inputStream;

    public IOBlocked(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        try {
            System.out.println("IOBlocked.run Waiting for read");
            inputStream.read();
        }catch (IOException e){
            if (Thread.currentThread().isInterrupted()){
                System.out.println("IOBlocked.run Interrupted from blocked I/O");
            }else {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Exiting IOBlocked.run");
    }
}
