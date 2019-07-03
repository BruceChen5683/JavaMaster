package com.cjl.pattern.command.actualcombat.macro;


public interface MacroCommand extends Command {
    void add(Command command);
    void remove(Command command);
}
