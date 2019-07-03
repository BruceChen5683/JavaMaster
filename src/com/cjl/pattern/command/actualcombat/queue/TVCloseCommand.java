package com.cjl.pattern.command.actualcombat.queue;

public class TVCloseCommand implements Command{

    private Televation televation;

    public TVCloseCommand(Televation televation){
        this.televation = televation;
    }
    @Override
    public void execute() {
        this.televation.close();
    }
}
