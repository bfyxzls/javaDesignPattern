package com.lind.designPattern.strategy;

public class Dog extends Animal {
  public Dog() {
    super(new FlyNo(), "狗");
  }
}
