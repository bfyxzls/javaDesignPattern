package com.lind.designPattern.chain;

/**
 * 第一个责任链条.
 */
public class WorkFlow1 extends WorkFlow {
  @Override
  protected ChainHandler getChainHandler() {
    ChainHandler chainHandler = new CreateService();
    chainHandler.setNext(new EditService())
        .setNext(new RemoveService())
        .setNext(new ReadService());
    return chainHandler;
  }

}
