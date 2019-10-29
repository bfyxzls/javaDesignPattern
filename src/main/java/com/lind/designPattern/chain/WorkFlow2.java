package com.lind.designPattern.chain;

public class WorkFlow2 extends WorkFlow {

    @Override
    public void initCommand() {
        ChainHandler chainHandler = new CreateCommand();
        chainHandler.setNext(new ReadCommand())
                .setNext(new EditCommand());
        setCommand(chainHandler);
    }
}
