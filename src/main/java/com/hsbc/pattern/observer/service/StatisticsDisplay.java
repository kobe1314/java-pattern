package com.hsbc.pattern.observer.service;

import com.hsbc.pattern.observer.DisplayElement;
import com.hsbc.pattern.observer.Observer;

/**
 * @program: java-design
 * @description: statistics
 * @author: Kobe
 * @create: 2018/12/16
 */
public class StatisticsDisplay implements Observer, DisplayElement {
    @Override
    public void display() {

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {

    }
}
