package com.hsbc.pattern.decorator.concretedecorator;

import com.hsbc.pattern.decorator.Beverage;
import com.hsbc.pattern.decorator.CondimentDecorator;

/**
 * @program: java-design
 * @description: milk
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Milk extends CondimentDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Milk,";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
