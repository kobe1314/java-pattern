package com.hsbc.pattern.factory.factory2;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/26
 */
public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Veggie");
    }
}
