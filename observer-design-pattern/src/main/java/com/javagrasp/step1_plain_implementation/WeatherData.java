package com.javagrasp.step1_plain_implementation;

/**
 * Created by vthiagarajan on 12/24/16.
 * The whole point is to send the data to three different screens and
 * there by whenever the data changes in the weather stations we need to update
 * the screens accordingly.
 */
public class WeatherData {


    private CurrentConditionsDisplay currentConditionsDisplay;
    private StatisticsDisplay statisticsDisplay;
    private ForecastDisplay forecastDisplay;

    private float temperature;
    private float pressure;
    private float humidity;

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public void measurementChanged(){

        float temperature = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temperature,pressure,humidity);
        statisticsDisplay.update(temperature,pressure,humidity);
        forecastDisplay.update(temperature,pressure,humidity);

    }



}
