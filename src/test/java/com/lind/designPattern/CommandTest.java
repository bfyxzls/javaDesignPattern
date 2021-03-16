package com.lind.designPattern;

import com.lind.designPattern.command.*;
import com.lind.designPattern.command.bll.BuyCommand;
import com.lind.designPattern.command.bll.ClearCommand;
import com.lind.designPattern.command.bll.SellCommand;
import org.junit.Test;

public class CommandTest {
    @Test
    public void commandOrder() {
        CommandReceiver commandReceiver = new CommandReceiver();

        BuyCommand buyCommandOrder = new BuyCommand(commandReceiver);
        SellCommand sellCommandOrder = new SellCommand(commandReceiver);
        ClearCommand clearCommand =new ClearCommand(commandReceiver);

        CommandInvoker commandInvoker = new CommandInvoker();
        commandInvoker.add(buyCommandOrder);
        commandInvoker.add(sellCommandOrder);
        commandInvoker.add(clearCommand);

        commandInvoker.run();
    }
}
