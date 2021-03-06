package com.javagrasp.youtube.observer.design.pattern;


import java.util.ArrayList;


/**
 * Created by vthiagarajan on 12/25/16.
 */
public class YoutubeUploadService implements Subject {

    private ArrayList observers;
    private String newVideoURL;
    private long noOfLikes;
    private long noOfView;

    /** Initialize the Observer*/
    public YoutubeUploadService() {
        observers = new ArrayList();
    }

    /** Register the Observer
     * */
    public void registerObserver(Observer o) {
        observers.add(o);
    }


    /**Remove the Observer*/
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /** Notify Observer on a Video Upload*/
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(newVideoURL);
        }
    }

    public void videoHasBeenUploaded() {
        notifyObservers();
    }

    /**Assume that this method will be called by one of the Youtube's services*/
    public void videoUploadComplete(String newVideoURL, long noOfLikes, long noOfView) {
        this.newVideoURL = newVideoURL;
        this.noOfLikes = noOfLikes;
        this.noOfView = noOfView;
        videoHasBeenUploaded();
    }
}
