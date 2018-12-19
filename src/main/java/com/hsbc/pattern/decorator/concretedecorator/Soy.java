package com.hsbc.pattern.decorator.concretedecorator;

import com.hsbc.pattern.decorator.Beverage;
import com.hsbc.pattern.decorator.CondimentDecorator;

/**
 * @program: java-design
 * @description: soy
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Soy,";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.15;
    }
}
