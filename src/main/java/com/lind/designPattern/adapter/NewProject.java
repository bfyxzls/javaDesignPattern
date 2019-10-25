package com.lind.designPattern.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 新的项目，与老接口不同，现在它是onRequest
 */
public class NewProject {
  private static Logger LOGGER = LoggerFactory.getLogger(ConcreteTarget.class);

  public void onRequest() {
    LOGGER.info("new.onRequest()");
  }
}
