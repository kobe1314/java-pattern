package com.hsbc.pattern.factory.factory2;

import com.hsbc.pattern.factory.simplefactory.PizzaType;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class FactoryClient {
    public static void main(String[] args){
        PizzaStore nyPizzaStore = new NYPizzaStore();
        nyPizzaStore.orderPizza(PizzaType.CHEESE);

        System.out.println("----------------");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        chicagoPizzaStore.orderPizza(PizzaType.VEGGIE);

    }
}
