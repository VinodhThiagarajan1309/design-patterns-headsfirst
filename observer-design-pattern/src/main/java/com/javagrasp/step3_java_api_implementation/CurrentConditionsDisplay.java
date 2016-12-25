package com.javagrasp.step3_java_api_implementation;

import java.util.Observable;
import java.util.Observer;

import com.javagrasp.step2_manual_implementation.DisplayElement;

/**
 * Created by vthiagarajan on 12/25/16.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature+ "F degrees and " + humidity + "% humidity");

    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

}
