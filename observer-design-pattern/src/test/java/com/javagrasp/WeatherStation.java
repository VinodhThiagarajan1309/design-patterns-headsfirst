package com.javagrasp;

import com.javagrasp.step2_manual_implementation.CurrentConditionsDisplay;
import com.javagrasp.step2_manual_implementation.WeatherData;

/**
 * Created by vthiagarajan on 12/24/16.
 */
public class WeatherStation {
    public static void main(String[] args) {


        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
