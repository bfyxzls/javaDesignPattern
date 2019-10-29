package com.lind.designPattern.chain;

public class RemoveCommand extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("删除");
    }
}
