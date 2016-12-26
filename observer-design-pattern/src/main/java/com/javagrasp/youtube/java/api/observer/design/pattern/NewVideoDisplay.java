package com.javagrasp.youtube.java.api.observer.design.pattern;

import java.util.Observable;
import java.util.Observer;

import com.javagrasp.youtube.observer.design.pattern.DisplayElement;

/**
 * Created by vthiagarajan on 12/25/16.
 */
public class NewVideoDisplay implements Observer,DisplayElement {

    private String newVideoURL;
    Observable observable;


    public NewVideoDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof YoutubeUploadService) {
            YoutubeUploadService youtubeUploadService = (YoutubeUploadService)obs;
            this.newVideoURL = youtubeUploadService.getNewVideoURL();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("New video has been uploaded and the URL is " + newVideoURL);

    }

}
