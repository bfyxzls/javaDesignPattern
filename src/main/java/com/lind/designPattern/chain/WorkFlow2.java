package com.lind.designPattern.chain;

public class WorkFlow2 extends WorkFlow {

    @Override
    public void initCommand() {
        ChainHandler chainHandler = new CreateService();
        chainHandler.setNext(new ReadService())
                .setNext(new EditService());
        setCommand(chainHandler);
    }
}
