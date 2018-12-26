package com.hsbc.pattern.factory.factory2;

import com.hsbc.pattern.factory.simplefactory.PizzaType;
import lombok.Data;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/23
 */
@Data
public abstract class PizzaStore {


    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza = this.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
