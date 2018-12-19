package com.hsbc.pattern.decorator.concretebeverage;

import com.hsbc.pattern.decorator.Beverage;

/**
 * @program: java-design
 * @description: house blend
 * @author: Kobe
 * @create: 2018/12/18
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "House blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
