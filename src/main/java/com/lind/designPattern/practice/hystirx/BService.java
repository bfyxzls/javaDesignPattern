package com.lind.designPattern.practice.hystirx;

/**
 * 接收者
 */
public class BService {

    public void getSingleData(int param) {
        System.out.println("BService getSingleData called, param: " + param);
    }

    public void getList() {
        System.out.println("BService getList called");
    }

}