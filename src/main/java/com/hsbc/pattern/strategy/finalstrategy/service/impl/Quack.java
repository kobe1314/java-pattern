package com.hsbc.pattern.strategy.finalstrategy.service.impl;

import com.hsbc.pattern.strategy.finalstrategy.service.Quackable;

/**
 * @program: springboot-parents
 * @description: quack call
 * @author: Kobe
 * @create: 2018/12/15
 */
public class Quack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Duck quack la!");
    }
}
