package com.hsbc.pattern.decorator.concretedecorator;

import com.hsbc.pattern.decorator.Beverage;
import com.hsbc.pattern.decorator.CondimentDecorator;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Whip,";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
