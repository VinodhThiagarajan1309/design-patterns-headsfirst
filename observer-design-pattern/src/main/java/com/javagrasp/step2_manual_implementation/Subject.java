package com.javagrasp.step2_manual_implementation;

/**
 * Created by vthiagarajan on 12/24/16.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
