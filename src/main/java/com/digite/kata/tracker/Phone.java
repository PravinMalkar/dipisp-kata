package com.digite.kata.tracker;

public class Phone implements Notification
{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "from phone file: " + weatherConditions;
        return alert;
    }
}
