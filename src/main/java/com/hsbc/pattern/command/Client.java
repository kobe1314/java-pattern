package com.hsbc.pattern.command;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/03
 */
public class Client {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        // a group command
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand();
        lightOnCommand.setLight(light);

        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();

        // another group command
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand();
        garageDoorOpenCommand.setGarageDoor(garageDoor);

        simpleRemoteControl.setCommand(garageDoorOpenCommand);
        simpleRemoteControl.buttonWasPressed();
    }
}
