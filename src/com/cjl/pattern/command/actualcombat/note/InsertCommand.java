package com.cjl.pattern.command.actualcombat.note;

public class InsertCommand extends Command{
    public InsertCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        operator.insert(args);
    }

    @Override
    public void execute() {
        operator.insert(this.args);
    }
}
