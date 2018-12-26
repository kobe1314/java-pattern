package com.hsbc.pattern.factory.factory1;

import java.util.ArrayList;

/**
 * @program: java-design
 * @description: pizza
 * @author: Kobe
 * @create: 2018/12/23
 */
public abstract class Pizza {
    String name;
    String dough;//生面团
    String sauce; //酱油，调味汁
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepareing " + name);
        System.out.println("Tossing dough ...");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings : ");
        toppings.stream().forEach(e -> System.out.println(" " + e));
    }
    /**
    *@Description: 烘烤
    *@Param: 
    *@return: 
    *@Author: kobe
    *@date: 2018/12/23
    */
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    /**
    *@Description:切片
    *@Param:
    *@return: 
    *@Author: kobe
    *@date: 2018/12/23
    */
    void cut() {
        System.out.println("Cutting the pizza int o diagonal slices");
    }
    /**
    *@Description: 装箱
    *@Param: 
    *@return: 
    *@Author: kobe
    *@date: 2018/12/23
    */
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
