package com.hsbc.pattern.strategy.finalstrategy;

import com.hsbc.pattern.strategy.finalstrategy.service.Flyable;
import com.hsbc.pattern.strategy.finalstrategy.service.Quackable;
import lombok.Data;

@Data
public abstract class Duck {
    private Flyable flyBehvior;
    private Quackable quackBehavior;

    public void swim() {
        System.out.println("Duck swim!");
    }

    public abstract void display();

    public void performFly() {
        flyBehvior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

}
