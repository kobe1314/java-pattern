package com.hsbc.pattern.singleton;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/27
 */
public class SingletonClient {
    public static void main(String[] args) throws InterruptedException {
        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();
        //System.out.println(singleton1);
        //System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);

        for (int i = 0; i < 100; i ++) {
            System.out.println(Singleton.getInstance());
        }
    }
}
