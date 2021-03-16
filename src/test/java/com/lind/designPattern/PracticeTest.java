package com.lind.designPattern;

import com.lind.designPattern.practice.hystirx.BSerErrorFallbackCommand;
import com.lind.designPattern.practice.hystirx.BSerGetListCommand;
import com.lind.designPattern.practice.hystirx.BSerGetSingleDataCommand;
import com.lind.designPattern.practice.hystirx.BService;
import com.lind.designPattern.practice.hystirx.SimpleHystrix;
import org.junit.Test;

public class PracticeTest {
    @Test
    public void hystrix() {

        SimpleHystrix simpleHystrix = new SimpleHystrix();
        BService bService = new BService();

        simpleHystrix.setSimpleHystrixCommand(new BSerGetSingleDataCommand(bService, 2));
        simpleHystrix.call();

        simpleHystrix.setSimpleHystrixCommand(new BSerGetListCommand(bService));
        simpleHystrix.call();

        simpleHystrix.setSimpleHystrixCommand(new BSerErrorFallbackCommand(bService));
        simpleHystrix.call();
    }
}

