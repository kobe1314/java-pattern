package com.hsbc.pattern.observer.service;

import com.hsbc.pattern.observer.Observer;
import com.hsbc.pattern.observer.Subject;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: java-design
 * @description: weatherdata
 * @author: Kobe
 * @create: 2018/12/16
 */
@Data
public class WeatherData implements Subject{

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observerList.stream().forEach(
                observer -> {
                    observer.update(temperature,humidity,pressure);
                }
        );
    }
    public void measurementChange() {
        notifyObserver();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }

}
