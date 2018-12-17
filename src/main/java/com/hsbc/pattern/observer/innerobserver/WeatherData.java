package com.hsbc.pattern.observer.innerobserver;

import lombok.Data;

import java.util.Observable;

/**
 * @program: java-design
 * @description: weatherData
 * @author: Kobe
 * @create: 2018/12/17
 */
@Data
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {}

    public void measurementChange() {
        setChanged();
        notifyObservers();

    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChange();
    }
}
