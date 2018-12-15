package com.hsbc.pattern.strategy.strategy2;;

public abstract class Duck {
    public void swim(){
        System.out.println("Duck swim!");
    }
    public abstract void display();

    //public void quack() {
    //    System.out.println("Duck quack!");
    //}

    //public void fly() {
    //    System.out.println("Duck can fly!");
    //}
}
