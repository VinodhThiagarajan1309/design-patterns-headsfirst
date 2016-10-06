package com.javagrasp.step5_separating_what_changes_from_what_stays_the_same;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard duck");
    }
}
