package com.lind.designPattern.practice.hystirx;

/**
 * 具体命令
 */
public class BSerGetSingleDataCommand implements SimpleHystrixCommand {
    private BService bService;

    private int param;

    public BSerGetSingleDataCommand(BService bService, int param) {
        this.bService = bService;
        this.param = param;
    }

    @Override
    public void execute() {
        try {
            bService.getSingleData(param);
        } catch (Exception e) {
            fallback();
        }
    }

    @Override
    public void fallback() {
        System.out.println("BSerGetSingleDataCommand fallback called");
    }
}