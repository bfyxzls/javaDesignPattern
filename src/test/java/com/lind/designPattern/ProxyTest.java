package com.lind.designPattern;

import com.lind.designPattern.proxy.IProject;
import com.lind.designPattern.proxy.Project;
import com.lind.designPattern.proxy.SubjectProxyHandler;
import java.lang.reflect.Proxy;
import org.junit.Test;


public class ProxyTest {
  @Test
  public void daynmicTest() {
    SubjectProxyHandler subjectProxyHandler = new SubjectProxyHandler(Project.class);
    IProject proxy =
        (IProject) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),
            new Class[] {IProject.class}, subjectProxyHandler);
    proxy.print();
  }
}

