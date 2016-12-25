package com.javagrasp.original;

/**
 * Created by vthiagarajan on 12/24/16.
 */
public class WeatherData {


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

    }



}
