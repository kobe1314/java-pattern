package com.hsbc.pattern.strategy.strategy1;


public class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("This is Rubber duck!");
    }
    @Override
    public void quack() {
        System.out.println("Rubber another voice!");
    }
}
