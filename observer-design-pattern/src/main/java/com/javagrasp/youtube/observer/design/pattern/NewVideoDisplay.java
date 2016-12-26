package com.javagrasp.youtube.observer.design.pattern;

import com.javagrasp.step2_manual_implementation.*;

/**
 * Created by vthiagarajan on 12/25/16.
 */
public class NewVideoDisplay implements Observer,DisplayElement {

    private String newVideoURL;
    private Subject youTubeData;



    public NewVideoDisplay(Subject youTubeData) {
        this.youTubeData = youTubeData;
        youTubeData.registerObserver(this);
    }

    @Override
    public void update(String newVideoURL) {
        this.newVideoURL = newVideoURL;
        display();
    }

    @Override
    public void display() {
        System.out.println("New video has been uploaded and the URL is " + newVideoURL);

    }

}
