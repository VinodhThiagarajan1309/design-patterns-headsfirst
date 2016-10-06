package com.javagrasp.step3_rubber_ducks_cant_fly;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class RedHeadDuck extends Duck {
    @Override
    public void quack() {
        System.out.println("RedHeadDuck Duck will Quack !");
    }

    @Override
    public void swim() {
        System.out.println("RedHeadDuck Duck Swims");
    }

    @Override
    public void display() {
        System.out.println("RedHeadDuck Duck Display");
    }


    @Override
    public void fly() {
        System.out.println("RedHead Duck Fly");
    }
}
