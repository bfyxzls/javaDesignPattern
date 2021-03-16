package com.lind.designPattern.command;

/**
 * 命令接收者.
 */
public class CommandReceiver {

    /**
     * 真正的业务逻辑.
     */
    public void action(String message) {
        System.out.println("CommandReceiver\n" + message);
    }

}
