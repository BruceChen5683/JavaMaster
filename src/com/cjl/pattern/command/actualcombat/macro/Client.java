package com.cjl.pattern.command.actualcombat.macro;

public class Client {
    public static void main(String[] args) {
        Televation televation = new Televation();

        Command openCommand = new TVOpenCommand(televation);
        Command closeCommand = new TVCloseCommand(televation);

        MacroCommand macro = new MacroSubCommand();
        macro.add(openCommand);
        macro.add(closeCommand);
        macro.execute();

    }
}
