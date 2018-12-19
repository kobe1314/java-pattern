package com.hsbc.pattern.decorator.concretebeverage;

import com.hsbc.pattern.decorator.Beverage;

/**
 * @program: java-design
 * @description: expresso
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
