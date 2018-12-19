package com.hsbc.pattern.decorator.concretebeverage;

import com.hsbc.pattern.decorator.Beverage;

/**
 * @program: java-design
 * @description: dark roast
 * @author: Kobe
 * @create: 2018/12/18
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
