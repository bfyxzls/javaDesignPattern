package com.lind.designPattern.decorate;

public class MilkDecorate extends Decorate {
  public MilkDecorate(Drink drink) {
    super(drink);
    super.setName("牛奶");
    super.setPrice(5);
  }
}
