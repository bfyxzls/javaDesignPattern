package com.lind.designPattern.chain;

public class WorkFlow1 extends WorkFlow {

    @Override
    public void initCommand() {
        ChainHandler chainHandler = new CreateService();
        chainHandler.setNext(new EditService())
                .setNext(new RemoveService())
                .setNext(new ReadService());
        setCommand(chainHandler);
    }
}
