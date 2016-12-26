package com.javagrasp.youtube.java.api.observer.design.pattern;

import com.javagrasp.step2_manual_implementation.CurrentConditionsDisplay;
import com.javagrasp.step2_manual_implementation.WeatherData;

/**
 * Created by vthiagarajan on 12/25/16.
 */
public class TestObserverPattern {

    public static void main(String[] args) {
        YoutubeUploadService youtubeUploadService = new YoutubeUploadService();
        NewVideoDisplay newVideoDisplay = new NewVideoDisplay(youtubeUploadService);
        youtubeUploadService.videoUploadComplete("https://www.youtube.com/user/destinws2", 65, 30);
    }
}
