package com.javagrasp.step7_dynamic_behaviour_even_more_better;


/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyWithWings());
        model.setQuackBehavior(new Squeak());
        model.performFly();
        model.performQuack();
    }
}