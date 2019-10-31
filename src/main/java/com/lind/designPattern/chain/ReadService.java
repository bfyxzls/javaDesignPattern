package com.lind.designPattern.chain;

public class ReadService extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("读取");
    }

}
