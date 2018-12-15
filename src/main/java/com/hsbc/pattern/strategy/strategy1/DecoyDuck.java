package com.hsbc.pattern.strategy.strategy1;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Decoy Duck !");
    }

    @Override
    public void quack() {
        System.out.println("Decoy Duck can't quack!");
    }

    @Override
    public void fly() {
        System.out.println("Decoy Duck can't fly!");
    }
}
