package com.hsbc.pattern.command.remotecommand;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/03
 */
public interface Command {
    void execute();
    void undo();
}
