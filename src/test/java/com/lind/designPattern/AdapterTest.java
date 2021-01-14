package com.lind.designPattern;

import com.lind.designPattern.adapter.ConcreteTarget;
import com.lind.designPattern.adapter.NewProjectAdapter;
import com.lind.designPattern.adapter.Service;
import com.lind.designPattern.adapter.Target;
import org.junit.Test;

public class AdapterTest {
    @Test
    public void test() {
        Target adapter = new NewProjectAdapter();
        new Service().doSomethings(adapter);

        Target target = new ConcreteTarget();
        new Service().doSomethings(target);
    }
}
