package com.hsbc.pattern.strategy.finalstrategy.service.impl;

import com.hsbc.pattern.strategy.finalstrategy.service.Quackable;

/**
 * @program: springboot-parents
 * @description: mule quack
 * @author: Kobe
 * @create: 2018/12/15
 */
public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Duck Mute la!");
    }
}
