package com.javagrasp.step3_rubber_ducks_cant_fly;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MallardDuck extends Duck {

    @Override
    public void quack() {
        System.out.println("Mallard Duck will Quack !");
    }

    @Override
    public void swim() {
        System.out.println("Mallard Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck Display");
    }

    @Override
    public void fly() {
        System.out.println("Mallard Duck Fly");
    }
}
