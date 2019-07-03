package com.cjl.pattern.command.actualcombat.macro;


import java.util.ArrayList;
import java.util.List;

public class MacroSubCommand implements MacroCommand{
    private List<Command> commandList = new ArrayList<Command>();
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    @Override
    public void execute() {
        for (Command command:commandList){
            command.execute();
        }
    }
}
