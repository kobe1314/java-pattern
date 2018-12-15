package com.hsbc.pattern.strategy.finalstrategy.service.impl;

import com.hsbc.pattern.strategy.finalstrategy.service.Flyable;

/**
 * @program: springboot-parents
 * @description: fly with wings
 * @author: Kobe
 * @create: 2018/12/15
 */
public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("Can fly to sky!");
    }
}
