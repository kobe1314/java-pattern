package com.hsbc.pattern.decorator;

import com.hsbc.pattern.decorator.concretebeverage.DarkRoast;
import com.hsbc.pattern.decorator.concretebeverage.Espresso;
import com.hsbc.pattern.decorator.concretebeverage.HouseBlend;
import com.hsbc.pattern.decorator.concretedecorator.Milk;
import com.hsbc.pattern.decorator.concretedecorator.Mocha;
import com.hsbc.pattern.decorator.concretedecorator.Soy;
import com.hsbc.pattern.decorator.concretedecorator.Whip;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/18
 */
public class Client {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.cost() + "$" + espresso.description + "!");

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Milk(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.cost() + "$" + darkRoast.getDescription() + "!");

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Milk(houseBlend);
        System.out.println(houseBlend.cost() + "$" + houseBlend.getDescription() + "!");

    }
}
