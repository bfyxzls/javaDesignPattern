package com.lind.designPattern.decorate;

public class Coffee extends Drink {
  public Coffee() {
    super.setName("咖啡");
    super.setPrice(7);
  }

  /**
   * 计算价格.
   *
   * @return
   */
  @Override
  public double cost() {
    return this.getPrice();
  }
}
