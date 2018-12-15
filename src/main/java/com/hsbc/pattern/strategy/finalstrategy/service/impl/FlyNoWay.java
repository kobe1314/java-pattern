package com.hsbc.pattern.strategy.finalstrategy.service.impl;

import com.hsbc.pattern.strategy.finalstrategy.service.Flyable;

/**
 * @program: springboot-parents
 * @description: fly no way
 * @author: Kobe
 * @create: 2018/12/15
 */
public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("Can't fly!");
    }
}


