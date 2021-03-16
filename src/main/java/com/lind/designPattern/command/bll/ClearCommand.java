package com.lind.designPattern.command.bll;

import com.lind.designPattern.command.Command;
import com.lind.designPattern.command.CommandReceiver;

/**
 * 具体命令.
 */
public class ClearCommand implements Command {
    private CommandReceiver commandReceiver;

    public ClearCommand(CommandReceiver commandReceiver){
        this.commandReceiver = commandReceiver;
    }

    public void execute() {
        commandReceiver.action("清盘");
    }
}

