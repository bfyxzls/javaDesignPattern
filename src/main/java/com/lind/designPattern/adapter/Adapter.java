package com.lind.designPattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 具体的一个适配器，去适配NewProject这个类.
 */
public class Adapter implements Target {
  private static Logger LOG = LoggerFactory.getLogger(Adapter.class);

  @Override
  public void request() {
    NewProject newProject = new NewProject();
    LOG.info("Adapter.request");
    newProject.onRequest();
  }
}
