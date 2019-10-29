package com.lind.designPattern.decorate2;

public class SuperManFlyDecorator extends FlyDecorator {
    public SuperManFlyDecorator(Hamun hamun) {
        super(hamun);
    }

    @Override
    protected void fly() {
        System.out.println("超人会飞");
    }
}
