package com.javagrasp.step6_behaviour_change_at_runtime;

/**
 * Created by vthiagarajan on 10/5/16.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly(); }
}