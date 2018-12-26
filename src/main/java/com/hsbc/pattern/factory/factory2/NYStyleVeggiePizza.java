package com.hsbc.pattern.factory.factory2;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        name = "NY style sauce and veggie Pizza";
        dough = "Thin crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano veggie");
    }
}
