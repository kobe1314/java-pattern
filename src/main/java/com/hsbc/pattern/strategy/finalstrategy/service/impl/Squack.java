package com.hsbc.pattern.strategy.finalstrategy.service.impl;

import com.hsbc.pattern.strategy.finalstrategy.service.Quackable;

/**
 * @program: springboot-parents
 * @description: squack
 * @author: Kobe
 * @create: 2018/12/15
 */
public class Squack implements Quackable {
    @Override
    public void quack() {
        System.out.println("Duck Squack la");
    }
}
