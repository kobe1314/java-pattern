package com.hsbc.pattern.decorator.concretedecorator;

import com.hsbc.pattern.decorator.Beverage;
import com.hsbc.pattern.decorator.CondimentDecorator;

/**
 * @program: java-design
 * @description: Mocha
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha,";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
