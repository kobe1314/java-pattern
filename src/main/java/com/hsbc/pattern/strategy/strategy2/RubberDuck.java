package com.hsbc.pattern.strategy.strategy2;

import com.hsbc.pattern.strategy.strategy2.service.Quackable;


public class RubberDuck extends Duck implements Quackable {

    @Override
    public void display() {
        System.out.println("This is Rubber duck!");
    }

    @Override
    public void quack() {
        System.out.println("Rubber guagua voice!");
    }
}
