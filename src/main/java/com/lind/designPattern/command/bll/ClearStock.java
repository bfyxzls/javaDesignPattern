package com.lind.designPattern.command.bll;

import com.lind.designPattern.command.Command;
import com.lind.designPattern.command.Stock;

/**
 * 具体命令.
 */
public class ClearStock implements Command {
    private Stock abcStock;

    public ClearStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.clear();
    }
}

