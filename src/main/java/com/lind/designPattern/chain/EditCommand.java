package com.lind.designPattern.chain;

public class EditCommand extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("编辑");
    }
}
