package com.lind.designPattern;

import com.lind.designPattern.chain.HandlerParameters;
import com.lind.designPattern.chain.WorkFlow;
import com.lind.designPattern.chain.WorkFlow1;
import com.lind.designPattern.chain.WorkFlow2;
import org.junit.Test;

public class ChainTest {
    @Test
    public void chainFlow1() {
        WorkFlow workFlow = new WorkFlow1();
        workFlow.ProcessRequest(new HandlerParameters("doing", "test"));
    }
    @Test
    public void chainFlow2() {
        WorkFlow workFlow = new WorkFlow2();
        workFlow.ProcessRequest(new HandlerParameters("doing", "test"));
    }

}
