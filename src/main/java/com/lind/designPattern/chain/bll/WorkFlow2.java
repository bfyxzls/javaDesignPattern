package com.lind.designPattern.chain.bll;

import com.lind.designPattern.chain.ChainHandler;
import com.lind.designPattern.chain.WorkFlow;
import com.lind.designPattern.chain.chain.CreateService;
import com.lind.designPattern.chain.chain.EditService;
import com.lind.designPattern.chain.chain.ReadService;

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
