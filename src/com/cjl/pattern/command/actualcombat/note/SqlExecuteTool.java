package com.cjl.pattern.command.actualcombat.note;

import java.io.ObjectInputStream;
import java.util.ArrayList;

public class SqlExecuteTool {

    private ArrayList<Command> commands = new ArrayList<>();
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void call(String args){
        command.execute(args);
        commands.add(command);
        save();
    }

    public void save(){
        FileUtils.writeCommands(commands);
    }

    public void recover(){
        ArrayList arrayList = FileUtils.readCommands();
        for (Object command:arrayList){
            ((Command)command).execute();
        }
    }
}
