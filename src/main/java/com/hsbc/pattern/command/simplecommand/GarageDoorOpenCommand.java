package com.hsbc.pattern.command.simplecommand;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/03
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoor getGarageDoor() {
        return garageDoor;
    }

    public void setGarageDoor(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
