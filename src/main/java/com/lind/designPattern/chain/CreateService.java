package com.lind.designPattern.chain;

public class CreateService extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("建立");
    }
}
