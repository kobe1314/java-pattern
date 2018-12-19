package com.hsbc.pattern.decorator.concretebeverage;

import com.hsbc.pattern.decorator.Beverage;

/**
 * @program: java-design
 * @description: decaf
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Decaf extends Beverage {
    public Decaf() {
        this.description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
