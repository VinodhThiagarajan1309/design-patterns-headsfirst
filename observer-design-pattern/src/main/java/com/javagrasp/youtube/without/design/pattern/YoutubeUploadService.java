package com.javagrasp.youtube.without.design.pattern;

/**
 * Created by vthiagarajan on 12/25/16.
 */
public class YoutubeUploadService {

    private String newVideoURL;
    private long noOfLikes;
    private long noOfView;

    private NewVideoDisplay newVideoDisplay;

    public String getNewVideoURL() {
        return newVideoURL;
    }

    public void setNewVideoURL(String newVideoURL) {
        this.newVideoURL = newVideoURL;
    }

    public void videoUploadComplete(){
        String newVideoAlert = getNewVideoURL();
        newVideoDisplay.update(newVideoAlert);
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
