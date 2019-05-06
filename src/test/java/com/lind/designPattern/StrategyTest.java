package com.lind.designPattern;

import com.lind.designPattern.strategy.Animal;
import com.lind.designPattern.strategy.Bird;
import com.lind.designPattern.strategy.Dog;
import com.lind.designPattern.strategy.Eagle;
import org.junit.Test;

public class StrategyTest {
  @Test
  public void test() {
    Animal dog = new Dog();
    dog.flying();

    Animal bird = new Bird();
    bird.flying();

    Animal eagle = new Eagle();
    eagle.flying();
  }
}
