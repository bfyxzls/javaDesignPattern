package com.lind.designPattern.decorate;

/**
 * 饮料-装饰器.
 */
public class Decorate extends Drink {
  private Drink drink;

  public Decorate(Drink drink) {
    this.drink = drink;
  }

  @Override
  public String printer() {
    return String.format("名称:%s,价格:%s,%s", super.getName(), super.getPrice(), drink.printer());
  }

  /**
   * 计算价格.
   *
   * @return
   */
  @Override
  public double cost() {
    //装饰自己的价格到原有的对象上
    return super.getPrice() + drink.cost();
  }
}
