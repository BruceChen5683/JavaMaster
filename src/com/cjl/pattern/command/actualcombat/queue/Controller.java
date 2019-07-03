package com.cjl.pattern.command.actualcombat.queue;

public class Controller {
    private CommandQueue commandQueue;
    public Controller(CommandQueue commandQueue){
        this.commandQueue = commandQueue;
    }

    public void setCommandQueue(CommandQueue commandQueue) {
        this.commandQueue = commandQueue;
    }

    public void call(){
        commandQueue.execute();
    }

}
