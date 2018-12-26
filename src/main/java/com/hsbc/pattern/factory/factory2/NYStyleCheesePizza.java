package com.hsbc.pattern.factory.factory2;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY style sauce and cheese Pizza";
        dough = "Thin crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
