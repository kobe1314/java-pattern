package com.hsbc.pattern.factory.factory1;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/23
 */
public class PizzaStore {

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = null;
        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza();
        } else if (type.equals(PizzaType.GREEK)) {
            pizza = new GreekPizza();
        } else if (type.equals(PizzaType.PEPPERON1)) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
