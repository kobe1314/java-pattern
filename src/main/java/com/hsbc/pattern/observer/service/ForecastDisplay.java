package com.hsbc.pattern.observer.service;

import com.hsbc.pattern.observer.DisplayElement;
import com.hsbc.pattern.observer.Observer;
import com.hsbc.pattern.observer.Subject;

/**
 * @program: java-design
 * @description: forecast display
 * @author: Kobe
 * @create: 2018/12/16
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private Subject weatherSubject;
    private float temperature;
    private float humidity;
    private float pressure;


    public ForecastDisplay(Subject weatherSubject) {
        this.weatherSubject = weatherSubject;
        weatherSubject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Forecast temperature :" + temperature + "F degrees and " + humidity );
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
