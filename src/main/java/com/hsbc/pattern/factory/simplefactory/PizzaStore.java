package com.hsbc.pattern.factory.simplefactory;

import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/23
 */
@Data
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
