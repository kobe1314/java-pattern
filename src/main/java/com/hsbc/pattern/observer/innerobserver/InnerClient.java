package com.hsbc.pattern.observer.innerobserver;

/**
 * @program: java-design
 * @description: inner client
 * @author: Kobe
 * @create: 2018/12/17
 */
public class InnerClient {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(20,40,22.334f);
        weatherData.setMeasurements(10,34,10.3f);
    }
}
