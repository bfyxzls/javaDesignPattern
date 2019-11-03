package com.lind.designPattern;

import com.lind.designPattern.command.*;
import org.junit.Test;

public class CommandTest {
    @Test
    public void commandOrder() {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        ClearStock clearStock=new ClearStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(clearStock);

        broker.placeOrders();
    }
}
