package com.javagrasp.step1_plain_implementation;

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
}
