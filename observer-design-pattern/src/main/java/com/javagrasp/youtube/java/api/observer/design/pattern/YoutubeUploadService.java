package com.javagrasp.youtube.java.api.observer.design.pattern;

import java.util.Observable;


/**
 * Created by vthiagarajan on 12/25/16.
 */
public class YoutubeUploadService extends Observable {
    private String newVideoURL;
    private long noOfLikes;
    private long noOfView;

    public YoutubeUploadService() {

    }

    public void videoHasBeenUploaded() {
        setChanged();
        notifyObservers();
    }

    /**Assume that this method will be called by one of the Youtube's services*/
    public void videoUploadComplete(String newVideoURL, long noOfLikes, long noOfView) {
        this.newVideoURL = newVideoURL;
        this.noOfLikes = noOfLikes;
        this.noOfView = noOfView;
        videoHasBeenUploaded();
    }

    public String getNewVideoURL() {
        return newVideoURL;
    }

    public void setNewVideoURL(String newVideoURL) {
        this.newVideoURL = newVideoURL;
    }

    public long getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(long noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public long getNoOfView() {
        return noOfView;
    }

    public void setNoOfView(long noOfView) {
        this.noOfView = noOfView;
    }
}
