package com.lind.designPattern.chain;

public class EditService extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("编辑");
    }
}
