package com.lind.designPattern.proxy;

public class Project implements IProject {
  @Override
  public void print() {
    System.out.println("project.print");
  }
}
