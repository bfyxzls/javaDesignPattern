package com.lind.designPattern.chain;

public class HandlerParameters {
    private String CommandType;
    private String data;

    public HandlerParameters(String commandType, String data) {
        CommandType = commandType;
        this.data = data;
    }

    public String getCommandType() {
        return CommandType;
    }

    public String getData() {
        return data;
    }
}
