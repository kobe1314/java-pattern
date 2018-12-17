package com.hsbc.pattern.observer.innerobserver;

import com.hsbc.pattern.observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: java-design
 * @description: current conditions display
 * @author: Kobe
 * @create: 2018/12/16
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private Observable observable;
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions :" + temperature + "F degrees and " + humidity );
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
