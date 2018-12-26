package com.hsbc.pattern.factory.factory1;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class Client {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("-----------------");
        pizzaStore.orderPizza(PizzaType.GREEK);
    }
}
