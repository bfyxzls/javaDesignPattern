package com.lind.designPattern.command;

/**
 * 具体命令.
 */
public class ClearStock implements Order {
    private Stock abcStock;

    public ClearStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.clear();
    }
}

