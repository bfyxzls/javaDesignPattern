package com.lind.designPattern.practice.hystirx;

/**
 * 调用者
 */
public class SimpleHystrix {

    private SimpleHystrixCommand simpleHystrixCommand;

    public void setSimpleHystrixCommand(SimpleHystrixCommand simpleHystrixCommand) {
        this.simpleHystrixCommand = simpleHystrixCommand;
    }

    public void call() {
        simpleHystrixCommand.execute();
    }

}