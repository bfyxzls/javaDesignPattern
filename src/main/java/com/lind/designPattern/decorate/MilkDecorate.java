package com.lind.designPattern.decorate;

/**
 * 牛奶的装饰器.
 */
public class MilkDecorate extends Decorate {
  public MilkDecorate(Drink drink) {
    super(drink);
    super.setName("牛奶");
    super.setPrice(5);
  }
}
