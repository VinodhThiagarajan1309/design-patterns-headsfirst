package com.javagrasp.step4_introduce_interface_for_fly_quack;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MallardDuck extends Duck implements Flyable,Quackable{
    public void fly() {
        System.out.println("Mallard Duck Fly.");
    }

    public void quack() {
        System.out.println("Mallard Duck Quack.");
    }
}
