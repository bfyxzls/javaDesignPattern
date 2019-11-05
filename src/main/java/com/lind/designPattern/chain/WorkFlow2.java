package com.lind.designPattern.chain;

/**
 * 第二个责任链条.
 */
public class WorkFlow2 extends WorkFlow {

  @Override
  protected ChainHandler getChainHandler() {

  ChainHandler chainHandler=  new CreateService();
    chainHandler.setNext(new ReadService())
        .setNext(new EditService());
    return chainHandler;
  }
}
