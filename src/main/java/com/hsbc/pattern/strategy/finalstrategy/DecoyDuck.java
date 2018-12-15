package com.hsbc.pattern.strategy.finalstrategy;

/**
 * @program: springboot-parents
 * @description: decoy duck
 * @author: Kobe
 * @create: 2018/12/15
 */
public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Decory duck !");
    }
}
