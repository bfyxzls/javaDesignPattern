package com.lind.designPattern.strategy;

public class Bird extends Animal {
  public Bird() {
    super(new FlySlow(), "小鸟");
  }
}
