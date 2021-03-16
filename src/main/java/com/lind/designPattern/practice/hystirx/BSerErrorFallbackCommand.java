package com.lind.designPattern.practice.hystirx;

public class BSerErrorFallbackCommand implements SimpleHystrixCommand {
    private BService bService;

    public BSerErrorFallbackCommand(BService bService) {
        this.bService = bService;
    }

    @Override
    public void execute() {
        try {
            int a = 0;
            int c = 1 / a;
        } catch (Exception ex) {
            fallback();
        }

    }

    @Override
    public void fallback() {
        System.out.println("BSerErrorFallbackCommand called fallback");
    }
}
