package com.lind.designPattern.factorymethod;

public class SqlFactory implements Factory {
  @Override
  public UserRepository createUserRepository() {
    return new SqlUserRepository();
  }
}
