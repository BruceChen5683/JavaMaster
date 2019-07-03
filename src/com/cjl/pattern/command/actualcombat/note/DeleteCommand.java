package com.cjl.pattern.command.actualcombat.note;

public class DeleteCommand extends Command{
    public DeleteCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        operator.delete(args);
    }

    @Override
    public void execute() {
        operator.delete(this.args);
    }
}
