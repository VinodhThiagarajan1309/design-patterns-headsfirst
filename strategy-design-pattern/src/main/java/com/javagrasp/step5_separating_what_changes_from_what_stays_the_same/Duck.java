package com.javagrasp.step5_separating_what_changes_from_what_stays_the_same;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class Duck {

    FlyBehaviour flyBehaviour;

    QuackBehaviour quackBehaviour;

    public void swim(){
        System.out.println("Ducks swim !");
    }

    public void display(){
        System.out.println("Ducks display !");
    }

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }
}
