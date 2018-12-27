package com.hsbc.pattern.singleton;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/27
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() throws InterruptedException {
        if (null == singleton) {
            Thread.sleep(5000);
            singleton = new Singleton();
            return singleton;
        } else {
            return singleton;
        }
    }
}
