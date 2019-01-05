package com.hsbc.pattern.command.remotecommand;

import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
@Data
public class StereoOffCommand implements Command {
    Stereo stereo;

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {

    }
}
