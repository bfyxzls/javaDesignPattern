package com.lind.designPattern.singleton;

/**
 * 饿汉单例.
 */
public class SingletonObj {
  private static SingletonObj instance = new SingletonObj();

  private SingletonObj() {
  }

  public static SingletonObj getInstance() {
    return instance;
  }
}
