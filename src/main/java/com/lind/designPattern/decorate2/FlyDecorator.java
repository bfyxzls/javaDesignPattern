package com.lind.designPattern.decorate2;

public abstract class FlyDecorator extends Hamun{
    protected abstract void fly();
    private  Hamun hamun;

    public FlyDecorator(Hamun hamun) {
        this.hamun = hamun;
    }

    @Override
    public void run() {
        hamun.run();
        fly();
    }
}
