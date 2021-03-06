package com.lind.designPattern.practice.hystirx;

/**
 * 具体命令
 */
public class BSerGetListCommand implements SimpleHystrixCommand {
    private BService bService;

    public BSerGetListCommand(BService bService) {
        this.bService = bService;
    }

    @Override
    public void execute() {
        try {
            bService.getList();
        } catch (Exception e) {
            this.fallback();
        }
    }

    @Override
    public void fallback() {
        System.out.println("BSerGetListCommand called fallback");
    }
}