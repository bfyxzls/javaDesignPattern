package com.lind.designPattern.strategy;

public abstract class Animal {
  private Fly fly;
  private String name;

  public Animal(Fly fly, String name) {
    this.fly = fly;
    this.name = name;
  }

  public void flying() {
    fly.doing(name);
  }
}
