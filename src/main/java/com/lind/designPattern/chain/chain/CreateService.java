package com.lind.designPattern.chain.chain;

import com.lind.designPattern.chain.ChainHandler;
import com.lind.designPattern.chain.HandlerParameters;

public class CreateService extends ChainHandler {
    @Override
    public void execute(HandlerParameters parameters) {
        System.out.println("建立");
    }
}
