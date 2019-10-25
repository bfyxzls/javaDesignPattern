package com.lind.designPattern;

import com.lind.designPattern.factorymethod.Factory;
import com.lind.designPattern.factorymethod.H2Factory;
import com.lind.designPattern.factorymethod.UserRepository;
import com.lind.designPattern.factorymethod.Userinfo;
import org.junit.Test;

public class FactoryTest {
  @Test
  public void userTest() {
    Factory factory = new H2Factory();
    UserRepository userRepository = factory.createUserRepository();
    userRepository.insert(new Userinfo());
  }
}
