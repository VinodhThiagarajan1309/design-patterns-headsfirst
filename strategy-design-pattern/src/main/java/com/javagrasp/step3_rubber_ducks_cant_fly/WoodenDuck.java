package com.javagrasp.step3_rubber_ducks_cant_fly;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class WoodenDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("Wooden Duck will be MUTE !");
    }

    @Override
    public void swim() {
        System.out.println("Wooden Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("Wooden Duck Display");
    }

    @Override
    public void fly() {
        System.out.println("Wooden Ducks can't fly.");
    }
}
