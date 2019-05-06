package com.lind.designPattern.decorate;

public class SugarDecorate extends Decorate {
  public SugarDecorate(Drink drink) {
    super(drink);
    super.setName("糖");
    super.setPrice(3);
  }
}
