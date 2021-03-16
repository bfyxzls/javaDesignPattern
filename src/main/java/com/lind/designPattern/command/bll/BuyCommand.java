package com.lind.designPattern.command.bll;

import com.lind.designPattern.command.Command;
import com.lind.designPattern.command.CommandReceiver;

/**
 * 具体命令.
 */
public class BuyCommand implements Command {
    private CommandReceiver commandReceiver;

    public BuyCommand(CommandReceiver abcCommandReceiver){
        this.commandReceiver = abcCommandReceiver;
    }

    public void execute() {
        commandReceiver.action("购买");
    }
}

