package com.cjl.pattern.command.actualcombat.note;

public class UpdateCommand extends Command{
    public UpdateCommand(String name) {
        super(name);
    }

    @Override
    public void execute(String args) {
        this.args = args;
        operator.update(args);
    }

    @Override
    public void execute() {
        operator.update(this.args);
    }
}
