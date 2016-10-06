package com.javagrasp.step4_introduce_interface_for_fly_quack;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class RubberDuck extends Duck implements Quackable {

    public void quack() {
        System.out.println("Rubber duck can only squeak !");
    }
}
