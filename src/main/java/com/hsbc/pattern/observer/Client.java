package com.hsbc.pattern.observer;

import com.hsbc.pattern.observer.service.CurrentConditionsDisplay;
import com.hsbc.pattern.observer.service.ForecastDisplay;
import com.hsbc.pattern.observer.service.WeatherData;

/**
 * @program: java-design
 * @description:
 * @author: Kobe
 * @create: 2018/12/16
 */
public class Client {

    public static void main(String[] args) {
        WeatherData weatherSubject = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherSubject);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherSubject);

        weatherSubject.setMeasurements(80,54,30.3f);
        weatherSubject.setMeasurements(10,34,10.3f);
        weatherSubject.setMeasurements(30,74,20.3f);

    }
}
