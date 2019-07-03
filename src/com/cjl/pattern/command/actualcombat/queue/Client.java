package com.cjl.pattern.command.actualcombat.queue;

public class Client {
    public static void main(String[] args) {
        Televation televation = new Televation();
        Command onCommand = new TVOpenCommand(televation);
        Command offCommand = new TVCloseCommand(televation);

        CommandQueue commandQueue = new CommandQueue();
        commandQueue.addCommand(onCommand);
        commandQueue.addCommand(offCommand);
        Controller controller = new Controller(commandQueue);
        controller.call();

    }
}
