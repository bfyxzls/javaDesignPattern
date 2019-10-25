package com.lind.designPattern;

import com.lind.designPattern.strategy.Animal;
import com.lind.designPattern.strategy.Bird;
import com.lind.designPattern.strategy.Dog;
import com.lind.designPattern.strategy.Eagle;
import com.lind.designPattern.strategy.StrategyContext;
import org.junit.Test;

public class StrategyTest {
  @Test
  public void test() {

    Animal dog = new Dog();
    StrategyContext strategyContext = new StrategyContext(dog);
    strategyContext.fly();

    Animal bird = new Bird();
    strategyContext = new StrategyContext(bird);
    strategyContext.fly();

    Animal eagle = new Eagle();
    strategyContext = new StrategyContext(eagle);
    strategyContext.fly();
  }
}
