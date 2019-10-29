package com.lind.designPattern.chain;

public class WorkFlow1 extends WorkFlow {

    @Override
    public void initCommand() {
        ChainHandler chainHandler = new CreateCommand();
        chainHandler.setNext(new EditCommand())
                .setNext(new RemoveCommand())
                .setNext(new ReadCommand());
        setCommand(chainHandler);
    }
}
