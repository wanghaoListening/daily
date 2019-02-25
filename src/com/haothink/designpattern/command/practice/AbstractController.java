package com.haothink.designpattern.command.practice;

/**
 * @author wanghao
 * @date 2019年02月18日 17:57
 * description:
 */
public abstract class AbstractController {

    protected AbstractCommand command;

    public abstract void sendCommand(AbstractCommand command);

}
