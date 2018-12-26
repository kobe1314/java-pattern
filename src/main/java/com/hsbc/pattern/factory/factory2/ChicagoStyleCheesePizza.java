package com.hsbc.pattern.factory.factory2;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");

    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
