package com.hsbc.pattern.observer;

/**
 * @program: java-design
 * @description: observer
 * @author: Kobe
 * @create: 2018/12/16
 */
public interface Observer {
    void update(float temperature, float humidity, float pressure);
}
