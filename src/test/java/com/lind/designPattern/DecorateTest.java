package com.lind.designPattern;

import com.lind.designPattern.decorate.Coffee;
import com.lind.designPattern.decorate.Decorate;
import com.lind.designPattern.decorate.Drink;
import com.lind.designPattern.decorate.MilkDecorate;
import com.lind.designPattern.decorate.SugarDecorate;
import com.lind.designPattern.decorate.Tea;
import org.junit.Test;

public class DecorateTest {

  @Test
  public void test() {
    Drink coffee = new Coffee();
    Decorate milk = new MilkDecorate(coffee);
    Decorate sugar = new SugarDecorate(milk);
    System.out.println(sugar.printer());
    System.out.println("总计：" + sugar.cost());
    System.out.println("----- ------------------");
    Drink tea = new Tea();
    sugar = new SugarDecorate(tea);
    System.out.println(sugar.printer());
    System.out.println("总计：" + sugar.cost());
  }
}
