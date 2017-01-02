package com.javagrasp.decorator;

/**
 * Created by vthiagarajan on 12/27/16.
 */
public class ChickenTeriyaki extends SubJointBase {

    public double cost() {
        return super.cost()+1.50;
    }

    public String getDescription() {
        return "Chicken Teriyaki";
    }

}
