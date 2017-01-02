package com.javagrasp.decorator;

/**
 * Created by vthiagarajan on 12/27/16.
 */
public class TestSubWay {

    public static void main(String[] args) {
        SubJointBase sub = new ChickenTeriyaki();

        sub = new Olives(sub);
        sub = new Lettuce(sub);

        System.out.println(sub.getDescription()+"      $ "+sub.cost());
    }
}
