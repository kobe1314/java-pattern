package com.hsbc.pattern.strategy.strategy1;

public class Client {
    public static void main(String[] args){
      Duck mallardDuck = new MallardDuck();
      mallardDuck.display();
      mallardDuck.swim();
      mallardDuck.quack();
      mallardDuck.fly();

      Duck redHeadDuck = new RedHeadDuck();
      redHeadDuck.quack();
      redHeadDuck.swim();
      redHeadDuck.display();
      redHeadDuck.fly();

      Duck rubberDuck = new RubberDuck();
      rubberDuck.quack();
      rubberDuck.swim();
      rubberDuck.display();
      rubberDuck.fly();

      Duck decoyDuck = new DecoyDuck();
      decoyDuck.quack();
      decoyDuck.swim();
      decoyDuck.display();
      decoyDuck.fly();

    }
}
