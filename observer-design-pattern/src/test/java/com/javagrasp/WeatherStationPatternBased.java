package com.javagrasp;


import com.javagrasp.step3_java_api_implementation.CurrentConditionsDisplay;
import com.javagrasp.step3_java_api_implementation.WeatherData;

/**
 * Created by vthiagarajan on 12/24/16.
 */
public class WeatherStationPatternBased {
    public static void main(String[] args) {


        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(70, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
