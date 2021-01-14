package com.lind.designPattern;

import com.lind.designPattern.decorate.Coffee;
import com.lind.designPattern.decorate.AbstractDrinkDecorate;
import com.lind.designPattern.decorate.Drink;
import com.lind.designPattern.decorate.MilkAbstractDrinkDecorate;
import com.lind.designPattern.decorate.SugarAbstractDrinkDecorate;
import com.lind.designPattern.decorate.Tea;
import com.lind.designPattern.decorate2.FlyDecorator;
import com.lind.designPattern.decorate2.Human;
import com.lind.designPattern.decorate2.SuperMan;
import com.lind.designPattern.decorate2.SuperManFlyDecorator;
import org.junit.Test;

public class DecorateTest {

    @Test
    public void drink() {
        Drink coffee = new Coffee();
        AbstractDrinkDecorate milk = new MilkAbstractDrinkDecorate(coffee);
        AbstractDrinkDecorate sugar = new SugarAbstractDrinkDecorate(milk);
        System.out.println(sugar.printer());
        System.out.println("总计：" + sugar.cost());
        System.out.println("----- ------------------");
        Drink tea = new Tea();
        sugar = new SugarAbstractDrinkDecorate(tea);
        System.out.println(sugar.printer());
        System.out.println("总计：" + sugar.cost());
    }

    @Test
    public void human() {
        Human human = new SuperMan("牛肉", "工人");
        FlyDecorator flyDecorator = new SuperManFlyDecorator(human);
        flyDecorator.run();
    }
}
