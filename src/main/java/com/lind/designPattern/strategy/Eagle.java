package com.lind.designPattern.strategy;

public class Eagle extends Animal {
  public Eagle() {
    super(new FlyAdvance(), "鹰");
  }
}
