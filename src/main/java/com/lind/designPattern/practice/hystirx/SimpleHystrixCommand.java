package com.lind.designPattern.practice.hystirx;

/**
 * 抽象命令
 */
public interface SimpleHystrixCommand {
    void execute();
    void fallback();
}