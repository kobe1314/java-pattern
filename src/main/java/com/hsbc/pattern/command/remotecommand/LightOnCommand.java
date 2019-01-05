package com.hsbc.pattern.command.remotecommand;

import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
@Data
public class LightOnCommand implements Command {

    Light light;

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }

}
