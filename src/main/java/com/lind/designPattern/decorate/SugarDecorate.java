package com.lind.designPattern.decorate;

/**
 * 糖的装饰器.
 */
public class SugarDecorate extends Decorate {
  public SugarDecorate(Drink drink) {
    super(drink);
    super.setName("糖");
    super.setPrice(3);
  }
}
