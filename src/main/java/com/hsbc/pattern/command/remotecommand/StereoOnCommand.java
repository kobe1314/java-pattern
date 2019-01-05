package com.hsbc.pattern.command.remotecommand;

import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
@Data
public class StereoOnCommand implements Command{
    Stereo stereo;

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {

    }
}
