package com.hsbc.pattern.strategy.strategy2;

import com.hsbc.pattern.strategy.strategy2.service.Flyable;
import com.hsbc.pattern.strategy.strategy2.service.Quackable;

;


public class MallardDuck extends Duck implements Flyable,Quackable{

    @Override
    public void fly() {
        System.out.println("Mallar Duck can fly!");
    }

    @Override
    public void quack() {
        System.out.println("Maller Duck can quack!");
    }

    @Override
    public void display() {
        System.out.println("Green Duck!");
    }
}
