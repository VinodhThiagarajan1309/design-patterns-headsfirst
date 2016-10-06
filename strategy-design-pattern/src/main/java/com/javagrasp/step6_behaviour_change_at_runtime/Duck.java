package com.javagrasp.step6_behaviour_change_at_runtime;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void swim(){
        System.out.println("All ducks swim the same.");
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly(){
        flyBehaviour.fly();
    }
}
