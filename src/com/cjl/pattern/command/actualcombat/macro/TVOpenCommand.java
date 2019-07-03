package com.cjl.pattern.command.actualcombat.macro;

public class TVOpenCommand implements Command {

    private Televation televation;

    public TVOpenCommand(Televation televation){
        this.televation = televation;
    }
    @Override
    public void execute() {
        this.televation.open();
    }
}