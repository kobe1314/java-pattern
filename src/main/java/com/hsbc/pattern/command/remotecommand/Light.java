package com.hsbc.pattern.command.remotecommand;

import lombok.NoArgsConstructor;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2019/01/03
 */
@NoArgsConstructor
public class Light {
    private String description;

    public Light(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println("light on!");
    }

    public void off() {
        System.out.println("light off!");
    }
}
