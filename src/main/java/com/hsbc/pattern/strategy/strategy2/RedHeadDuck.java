package com.hsbc.pattern.strategy.strategy2;

import com.hsbc.pattern.strategy.strategy2.service.Flyable;
import com.hsbc.pattern.strategy.strategy2.service.Quackable;

;

public class RedHeadDuck extends Duck implements Flyable,Quackable{

    @Override
    public void display() {
        System.out.println("Red Head Duck");
    }

    @Override
    public void fly() {
        System.out.println("Red head Duck can fly1");
    }

    @Override
    public void quack() {
        System.out.println("Red head Duck can quack!");
    }
}
