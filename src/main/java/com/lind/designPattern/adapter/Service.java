package com.lind.designPattern.adapter;

public class Service {
    /**
     * 业务方法需要一个Target实例.
     * @param target
     */
    public void doSomethings(Target target) {
        target.request();
        System.out.println("doSomethings...");
    }
}
