package com.hsbc.pattern.factory.factory1;

/**
 * @program: java-design
 * @description: simple pizza factory
 * @author: Kobe
 * @create: 2018/12/26
 */
public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType pizzaType) {
        Pizza pizza = null;
        if (pizzaType.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza();
        } else if (pizzaType.equals(PizzaType.GREEK)) {
            pizza = new GreekPizza();
        } else if (pizzaType.equals(PizzaType.PEPPERON1)) {
            pizza = new PepperoniPizza();
        }

        return pizza;

    }
}
