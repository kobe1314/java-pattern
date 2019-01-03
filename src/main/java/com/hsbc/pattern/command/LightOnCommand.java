package com.hsbc.pattern.command;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/03
 */
public class LightOnCommand implements Command {
    Light light;

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
