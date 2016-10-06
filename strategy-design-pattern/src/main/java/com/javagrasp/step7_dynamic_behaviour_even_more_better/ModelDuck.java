package com.javagrasp.step7_dynamic_behaviour_even_more_better;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
    flyBehaviour = new FlyNoWay();
    quackBehaviour = new MuteQuack();
    }

    public void display() {
        System.out.println("I’m a model duck");
    }
}