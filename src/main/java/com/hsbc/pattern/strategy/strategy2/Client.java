package com.hsbc.pattern.strategy.strategy2;

public class Client {
    public static void main(String[] args){
      MallardDuck mallardDuck = new MallardDuck();
      mallardDuck.display();
      mallardDuck.swim();
      mallardDuck.quack();
      mallardDuck.fly();

      System.out.println("------------------");

      RedHeadDuck redHeadDuck = new RedHeadDuck();
      redHeadDuck.quack();
      redHeadDuck.swim();
      redHeadDuck.display();
      redHeadDuck.fly();

      System.out.println("------------------");

      RubberDuck rubberDuck = new RubberDuck();
      rubberDuck.quack();
      rubberDuck.swim();
      rubberDuck.display();
      //rubberDuck.fly();

      System.out.println("------------------");

      DecoyDuck decoyDuck = new DecoyDuck();
      //decoyDuck.quack();
      decoyDuck.swim();
      decoyDuck.display();
      //decoyDuck.fly();

    }
}
