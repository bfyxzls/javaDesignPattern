package com.lind.designPattern;

import com.lind.designPattern.adapter.Adapter;
import com.lind.designPattern.adapter.ConcreteTarget;
import com.lind.designPattern.adapter.Target;
import org.junit.Test;

public class AdapterTest {
  @Test
  public void test() {
    Target adapter = new Adapter();
    adapter.request();

    Target target = new ConcreteTarget();
    target.request();
  }
}
