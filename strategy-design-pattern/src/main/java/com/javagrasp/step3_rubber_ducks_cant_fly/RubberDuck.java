package com.javagrasp.step3_rubber_ducks_cant_fly;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class RubberDuck extends Duck{

    @Override
    public void quack() {
        System.out.println("Rubber Duck can only squeak !");
    }

    @Override
    public void swim() {
        System.out.println("Rubber Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck Display");
    }

    @Override
    public void fly() {
        System.out.println("Rubber Ducks can't fly.");
    }
}
