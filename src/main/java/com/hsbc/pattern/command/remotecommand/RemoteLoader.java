package com.hsbc.pattern.command.remotecommand;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        //a serial of commands
        Light light = new Light("Living room");
        LightOnCommand lightOnCommand = new LightOnCommand();
        lightOnCommand.setLight(light);

        LightOffCommand lightOffCommand = new LightOffCommand();
        lightOffCommand.setLight(light);

        Stereo stereo = new Stereo();
        StereoOnCommand stereoOnCommand = new StereoOnCommand();
        stereoOnCommand.setStereo(stereo);

        StereoOffCommand stereoOffCommand = new StereoOffCommand();
        stereoOffCommand.setStereo(stereo);

        remoteControl.addOnCommand(lightOnCommand);
        remoteControl.addOffCommand(lightOffCommand);

        remoteControl.addOnCommand(stereoOnCommand);
        remoteControl.addOffCommand(stereoOffCommand);

        System.out.println(remoteControl.toString());

        remoteControl.onButtonPressed(0);
        remoteControl.offButtonPressed(0);
        remoteControl.onButtonPressed(1);
        remoteControl.offButtonPressed(1);

        MacroCommand macroCommand = new MacroCommand();
        macroCommand.addCommand(lightOnCommand);
        macroCommand.addCommand(stereoOnCommand);

        remoteControl.addOnCommand(macroCommand);
        remoteControl.onButtonPressed(2);
    }
}
