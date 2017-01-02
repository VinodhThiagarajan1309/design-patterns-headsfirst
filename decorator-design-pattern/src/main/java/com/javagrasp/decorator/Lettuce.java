package com.javagrasp.decorator;

/**
 * Created by vthiagarajan on 12/30/16.
 */
public class Lettuce extends CondimentDecorator {

    SubJointBase subJointBase;

    public Lettuce(SubJointBase subJointBase) {
        this.subJointBase = subJointBase;
    }

    public String getDescription() {
        return subJointBase.getDescription() + ", with Lettuce";
    }

    public double cost() {
        return subJointBase.cost()+0.50;
    }
}