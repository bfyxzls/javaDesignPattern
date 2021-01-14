package com.lind.designPattern.chain.bll;

import com.lind.designPattern.chain.ChainHandler;
import com.lind.designPattern.chain.WorkFlow;
import com.lind.designPattern.chain.chain.CreateService;
import com.lind.designPattern.chain.chain.EditService;
import com.lind.designPattern.chain.chain.ReadService;
import com.lind.designPattern.chain.chain.RemoveService;

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
