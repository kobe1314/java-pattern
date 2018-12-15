package com.hsbc.pattern.strategy.finalstrategy;

import com.hsbc.pattern.strategy.finalstrategy.service.Flyable;
import com.hsbc.pattern.strategy.finalstrategy.service.Quackable;
import com.hsbc.pattern.strategy.finalstrategy.service.impl.*;

/**
 * @program: springboot-parents
 * @description: use strategy pattern, include 封装变化；多用组合，少用继承；针对接口编程，不针针对实现编程
 * @author: Kobe
 * @create: 2018/12/15
 */
public class Client {
    public static void main(String[] args) {
        Flyable flyNoWay = new FlyNoWay();
        Flyable flyWithWings = new FlyWithWings();

        Quackable quack = new Quack();
        Quackable squack = new Squack();
        Quackable muteQuack = new MuteQuack();


        Duck duck = new DecoyDuck();
        duck.swim();
        duck.display();

        System.out.println("********************* 1");

        Duck mallardDuck = new MallardDuck();
        mallardDuck.setFlyBehvior(flyWithWings);
        mallardDuck.setQuackBehavior(quack);
        mallardDuck.swim();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        System.out.println("******************** 2");

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.setQuackBehavior(quack);
        redHeadDuck.setFlyBehvior(flyWithWings);
        redHeadDuck.swim();
        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        System.out.println("******************** 3");

        Duck rubberDuck = new RubberDuck();
        rubberDuck.setQuackBehavior(squack);
        rubberDuck.swim();
        rubberDuck.display();
        rubberDuck.performQuack();

        System.out.println("******************** 4");

        Duck decoyDuck  = new DecoyDuck();
        decoyDuck.setQuackBehavior(muteQuack);
        decoyDuck.swim();
        decoyDuck.display();
        decoyDuck.performQuack();




    }
}
