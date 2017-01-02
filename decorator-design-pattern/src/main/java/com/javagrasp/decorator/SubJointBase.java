package com.javagrasp.decorator;

/**
 * Created by vthiagarajan on 12/27/16.
 */
public abstract class SubJointBase {

    String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double cost(){
        return 2;
    }

}
