package com.javagrasp.step7_dynamic_behaviour_even_more_better;


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

    public void setFlyBehavior(FlyBehaviour fb) { flyBehaviour = fb;
    }
    public void setQuackBehavior(QuackBehaviour qb) { quackBehaviour = qb;
    }
}
