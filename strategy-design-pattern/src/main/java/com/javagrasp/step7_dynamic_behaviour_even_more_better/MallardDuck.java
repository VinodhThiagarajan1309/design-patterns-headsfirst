package com.javagrasp.step7_dynamic_behaviour_even_more_better;



/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    public void display() {
        System.out.println("This is Mallard Duck.");
    }

}
