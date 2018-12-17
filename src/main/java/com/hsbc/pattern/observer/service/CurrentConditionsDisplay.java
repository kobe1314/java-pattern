package com.hsbc.pattern.observer.service;

import com.hsbc.pattern.observer.DisplayElement;
import com.hsbc.pattern.observer.Observer;
import com.hsbc.pattern.observer.Subject;

/**
 * @program: java-design
 * @description: current conditions display
 * @author: Kobe
 * @create: 2018/12/16
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private Subject weatherSubject;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherSubject = subject;
        weatherSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "F degrees and " + humidity );
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
