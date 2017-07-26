package com.example.utku.messagingapp;

import android.os.Build;
import android.support.annotation.RequiresApi;

import java.util.Date;

/**
 * Created by utku on 26.07.2017.
 */

public class Message {

    // Variables to store content, user and time of message
    private String text;
    private long time;
    private String user;

    public Message(String inText, String inUser) { // Constructer to initialise message
        text = inText;
        user = inUser;
        time = new Date().getTime();
    }

    public Message() {

    }

    public String getText() {
        return text;
    }

    public long getMsgTime() {
        return time;
    }

    public String getUser() {
        return user;
    }

    public void setText(String inText) {
        text = inText;
    }

    public void setTime(long inTime) {
        time = inTime;
    }

    public void setUser(String inUser) {
        user = inUser;
    }
}
