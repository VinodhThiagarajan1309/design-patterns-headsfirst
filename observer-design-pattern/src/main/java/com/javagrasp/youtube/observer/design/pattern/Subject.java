package com.javagrasp.youtube.observer.design.pattern;

/**
 * Created by vthiagarajan on 12/24/16.
 */
public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
