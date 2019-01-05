package com.hsbc.pattern.command.remotecommand;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/05
 */
public class Stereo {
    public void on() {
        System.out.println("open Stereo !");
    }

    public void off() {
        System.out.println("off Stereo!");
    }

    public void setCD() {
        System.out.println("set CD !");
    }

    public void setVolume(int volume) {
        System.out.println("set volume!");
    }
}
