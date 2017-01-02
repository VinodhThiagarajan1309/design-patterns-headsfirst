package com.javagrasp.decorator;

/**
 * Created by vthiagarajan on 12/30/16.
 */
public class Olives extends CondimentDecorator {

    SubJointBase subJointBase;

    public Olives(SubJointBase subJointBase) {
        this.subJointBase = subJointBase;
    }

    public String getDescription() {
        return subJointBase.getDescription() + ", with Olives";
    }

    public double cost() {
        return subJointBase.cost()+0.50;
    }
}

