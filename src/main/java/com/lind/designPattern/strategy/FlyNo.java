package com.lind.designPattern.strategy;

public class FlyNo implements Fly {
  /**
   * 飞的执行.
   */
  @Override
  public void doing(String name) {
    System.out.println(name + "不会飞");
  }
}
