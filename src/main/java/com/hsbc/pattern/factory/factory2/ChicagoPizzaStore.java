package com.hsbc.pattern.factory.factory2;

import com.hsbc.pattern.factory.simplefactory.PizzaType;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza =  new ChicagoStyleCheesePizza();
        } else if (pizzaType.equals(PizzaType.VEGGIE)) {
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
